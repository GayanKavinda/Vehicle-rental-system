
import dbconnection.db;
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
import model.payment;



@WebServlet(urlPatterns = {"/InsertData"})
public class InsertData extends HttpServlet {

    public InsertData() {
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

        String name = request.getParameter("customer_name");
        String mount = request.getParameter("amount");
        String type = request.getParameter("payment_type");
        String ount = request.getParameter("discount");

        payment pay = new payment();
        pay.setCustomer_name(name);
        pay.setAmount(mount);
        pay.setPayment_type(type);
        pay.setDiscount(ount);

        request.setAttribute("payment", pay);

        Boolean status1 = pay.isNameFilled();
        Boolean status2 = pay.isAmountFilled();

        if (status1 && status2 == true) {
            try {
                Class.forName("com.mysql.jdbc.Driver");

            } catch (ClassNotFoundException e) {
                System.out.println("Oops ! Something Went Wrong with Database !");
                e.printStackTrace();
                return;
            }
            try {

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false", "root", "sliitpc16$97");
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("INSERT INTO payment_details(customer_name,amount,payment_type,discount)values('" + name + "','" + mount + "','" + type + "','" + ount + "')");
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully !");
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Data  not inserted Successfully !");

        }
        response.sendRedirect("AddPayment.jsp");
    }
}
