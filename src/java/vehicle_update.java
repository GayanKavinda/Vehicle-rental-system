
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
import model.vehicle;

@WebServlet(urlPatterns = {"/vehicle_update"})
public class vehicle_update extends HttpServlet {

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

            int vid = Integer.parseInt(req.getParameter("vid"));
            String reg = req.getParameter("reg_no");
            String cat = req.getParameter("category");
            String mak = req.getParameter("make");
            String mod = req.getParameter("model");
            String yea = req.getParameter("year");
            String col = req.getParameter("color");
            String mil = req.getParameter("mileage");
            String mon = req.getParameter("monthly");

            
            
            vehicle vehicle1 = new vehicle();
            vehicle1.setReg_no(reg);
            vehicle1.setCategory(cat);
            vehicle1.setMake(mak);
            vehicle1.setModel(mod);
            vehicle1.setYear(yea);
            vehicle1.setColor(col);
            vehicle1.setMileage(mil);
            vehicle1.setVid(vid);
            vehicle1.setMonthly(mon);

            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");

                String sql = ("UPDATE vehicle_details SET register_no=?,category=?,make=?,model=?,year=?,color=?,mileage=?,monthly=? WHERE vid=?");
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, vehicle1.getReg_no());
                pst.setString(2, vehicle1.getCategory());
                pst.setString(3, vehicle1.getMake());
                pst.setString(4, vehicle1.getModel());
                pst.setString(5, vehicle1.getYear());
                pst.setString(6, vehicle1.getColor());
                pst.setString(7, vehicle1.getMileage());
                pst.setString(8, vehicle1.getMonthly());
                pst.setInt(9, vehicle1.getVid());

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
