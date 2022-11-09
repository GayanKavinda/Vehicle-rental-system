
import dbconnection.vehicle_db;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.vehicle_availability;
import model.vehicle;

@WebServlet(urlPatterns = {"/vehicle_update_availability"})
public class vehicle_update_availability extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        if (req.getParameter("update") != null) {

            String update_pu_day = req.getParameter("update-pu-day");
            String update_pu_month = req.getParameter("update-pu-month");
            String update_pu_year = req.getParameter("update-pu-year");
            String update_drop_day = req.getParameter("update-do-day");
            String update_drop_month = req.getParameter("update-do-month");
            String update_drop_year = req.getParameter("update-do-year");
            int vid = Integer.parseInt(req.getParameter("vid"));
            
            
            vehicle_availability availability1 = new vehicle_availability();
            vehicle vehicle2 = new vehicle();
            
            
            availability1.setPu_day(update_pu_day);
            availability1.setPu_month(update_pu_month);
            availability1.setPu_year(update_pu_year);
            availability1.setDrop_day(update_drop_day);
            availability1.setDrop_month(update_drop_month);
            availability1.setDrop_year(update_drop_year);
            vehicle2.setVid(vid);

            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");

                String sql = ("UPDATE vehicle_availability SET day=?,month=?,year=?,drop_day=?,drop_month=?,drop_year=? WHERE vid=?");
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                
                pst.setString(1, availability1.getPu_day());
                pst.setString(2, availability1.getPu_month());
                pst.setString(3, availability1.getPu_year());
                pst.setString(4, availability1.getDrop_day());
                pst.setString(5, availability1.getDrop_month());
                pst.setString(6, availability1.getDrop_year());
                pst.setInt(7, vehicle2.getVid());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Updated Successfully !");
                
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }
        }
        
        res.sendRedirect("vehicle_details_update.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
