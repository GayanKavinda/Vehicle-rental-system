
import dbconnection.db;
import dbconnection.vehicle_db;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

@WebServlet(urlPatterns = {"/vehicle_InsertData"})
public class vehicle_InsertData extends HttpServlet {

    public vehicle_InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String reg = request.getParameter("reg_no");
        String cat = request.getParameter("category");
        String mak = request.getParameter("make");
        String mod = request.getParameter("model");
        String yea = request.getParameter("year");
        String col = request.getParameter("color");
        String mil = request.getParameter("mileage");
        String mon = request.getParameter("monthly");

        vehicle vehicle1 = new vehicle();
        vehicle1.setReg_no(reg);
        vehicle1.setCategory(cat);
        vehicle1.setMake(mak);
        vehicle1.setModel(mod);
        vehicle1.setYear(yea);
        vehicle1.setColor(col);
        vehicle1.setMileage(mil);
        vehicle1.setMonthly(mon);

        request.setAttribute("vehicle_attribute", vehicle1);

        Boolean status1 = vehicle1.isRegNoFilled();
        Boolean status2 = vehicle1.isModelFilled();
        Boolean status3 = vehicle1.isMileageFilled();
        Boolean status4 = vehicle1.isCategoryFilled();
        Boolean status5 = vehicle1.isMonthlyFilled();
   
        if (status1 && status2 && status3 && status4 && status5== true) {
            try {
                Class.forName("com.mysql.jdbc.Driver");

            } catch (ClassNotFoundException e) {
                System.out.println("Oops ! Something Went Wrong with Database !");
                e.printStackTrace();
                return;
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("INSERT INTO vehicle_details(register_no,category,make,model,year,color,mileage,monthly)values('" + reg + "','" + cat + "','" + mak + "','" + mod + "','" + yea + "','" + col + "','" + mil + "','" + mon + "')");
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully !");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data  not inserted Successfully !");
        }
        response.sendRedirect("vehicle_details_add.jsp");
    }
}
