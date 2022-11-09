package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.payment;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class AddPayment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/index-css.css\">\n");
      out.write("    <title>Add Payments </title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <nav class=\"navbar navbar-expand-sm navbar-light\" id=\"nav\">\n");
      out.write("<ul>\n");
      out.write("  <li><a href=\"AddPayment.jsp\"><button type=\"button\" class=\"btn btn-success\">Add Payment Details</button></a></li>\n");
      out.write("  <li><a href=\"ViewPayments.jsp\"><button type=\"button\" class=\"btn btn-info\">View All Payments</button></a></li>\n");
      out.write("  <li ><a href=\"UpdatePayment.jsp\"><button type=\"button\" class=\"btn btn-secondary\">Update Payments</button></a></li>\n");
      out.write("  <li><a href=\"DeletePayment.jsp\"><button type=\"button\" class=\"btn btn-danger\">Delete Payments</button></a></li>\n");
      out.write(" \n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("      <hr>\n");
      out.write("      \n");
      out.write("      <h2 class=\"text-center mt-3 col-sm-5 mb-3\">Add Payment</h2>\n");
      out.write("      \n");
      out.write("       <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"leftside\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"InsertData\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Customer Name</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Customer Name\" name=\"customer_name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Amount</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Amount\" name=\"amount\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Payment Type</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                       \n");
      out.write("                            <select class=\"form-control\" name=\"payment_type\">\n");
      out.write("                                <option>Credit Card </option>\n");
      out.write("                                <option>Cash</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Discount(%)</label>\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                            <select class=\"form-control\" name=\"discount\">\n");
      out.write("                                    <option>10 </option>\n");
      out.write("                                    <option>15</option>\n");
      out.write("                                </select>\n");
      out.write("                       </div>\n");
      out.write("                    </div>    \n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-5\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block btn-success\">Add Payment</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("<br>\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("<div class=\"rightside\">\n");
      out.write("    <table id=\"table\" align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"lightgreen\">\n");
      out.write("<th><b>ID</b></th>\n");
      out.write("<th><b>Customer Name</b></th>\n");
      out.write("<th><b>Amount</b></th>\n");
      out.write("<th><b>Payment Type</b></th>\n");
      out.write("<th><b>Discount(%)</b></th>\n");
      out.write("<!--<td><b>Discounted Price</b></td>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");

try{
    Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false","root","sliitpc16$97");
statement=connection.createStatement();
String sql ="SELECT * FROM payment_details";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("pid") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("customer_name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("amount") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("payment_type") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("discount") );
      out.write("</td>\n");
      out.write("<!--<td>");
      out.print(Double.parseDouble(resultSet.getString("amount"))-Double.parseDouble(resultSet.getString("amount"))*Double.parseDouble(resultSet.getString("discount"))/100 );
      out.write("</td>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
out.println(e);
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("      \n");
      out.write("             \n");
      out.write("      \n");
      out.write("          \n");
      out.write("  \n");
      out.write("      \n");
      out.write("\n");
      out.write("      \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
