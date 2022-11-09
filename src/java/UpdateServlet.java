

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
import model.payment;


@WebServlet(urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {

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
        
        if(req.getParameter("update") != null){
            
        int pid = Integer.parseInt(req.getParameter("pid"));
        String name = req.getParameter("customer_name");
        String mount = req.getParameter("amount");
        String type = req.getParameter("payment_type");
        String ount = req.getParameter("discount");
        
        payment pay = new payment();
        pay.setCustomer_name(name);
        pay.setAmount(mount);
        pay.setPayment_type(type);
        pay.setDiscount(ount);
        pay.setPid(pid);
        

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
    
        
        
                

            
            
                
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false", "root", "sliitpc16$97");
                
                
               String sql = ("UPDATE payment_details SET customer_name=?,amount=?,payment_type=?,discount=? WHERE pid=?");
               PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
               pst.setString(1, pay.getCustomer_name());
               pst.setString(2, pay.getAmount());
               pst.setString(3, pay.getPayment_type());
               pst.setString(4, pay.getDiscount());
               pst.setInt(5, pay.getPid());
               pst.executeUpdate();
                
             JOptionPane.showMessageDialog(null, "Data Updated Successfully !");
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }

              
           

        }
        res.sendRedirect("UpdatePayment.jsp");
       
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
