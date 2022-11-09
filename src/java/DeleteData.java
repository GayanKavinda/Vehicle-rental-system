

import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.payment;



@WebServlet(urlPatterns = {"/DeleteData"})
public class DeleteData extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
          if(request.getParameter("pid") != null){
            
        int pid = Integer.parseInt(request.getParameter("pid"));
        
        payment pay = new payment();
        pay.setPid(pid);
        

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
    
        
        
                

            
            
                
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false", "root", "sliitpc16$97");
                
                
               String sql = ("DELETE FROM payment_details WHERE pid=?");
               PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
               pst.setInt(1, pay.getPid());
               pst.executeUpdate();
                
             JOptionPane.showMessageDialog(null, "Data Deleted Successfully !");
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }

              
           

        }
        response.sendRedirect("DeletePayment.jsp");
       
        
        
    }
          
        
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
