package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.Exception;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class vehicle_005fview_005fselected_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            footer {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                padding: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .carousel-inner img {\n");
      out.write("                width: 100%; \n");
      out.write("                min-height: 200px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 600px) {\n");
      out.write("                .carousel-caption {\n");
      out.write("                    display: none; \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><img  style=\"height:40px;margin: 5px\" src=\"asset\\Images\\Home\\logo.jpg\"></li>\n");
      out.write("                        <li class=\"active\"><a href=\"vehicle_interface.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">My Account</a></li>\n");
      out.write("                        <li><a href=\"YourPayment.jsp\">Payments</a></li>\n");
      out.write("                        <li><a href=\"vehicle_about.jsp\">About</a></li>\n");
      out.write("                        <li><a href=\"vehicle_contact.jsp\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                statement = connection.createStatement();

                String vid = request.getParameter("vid");

                String sql = "SELECT * FROM vehicle_details WHERE vid='" + vid + "'";

                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                        <!-- Indicators -->\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                        <!-- Wrapper for slides -->\n");
      out.write("                        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <img src=\"asset\\Images\\vehicle_images\\0_");
      out.print(resultSet.getString("vid"));
      out.write("_1.jpg\" alt=\"Image\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h3>Image 1</h3>\n");
      out.write("                                </div>      \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"asset\\Images\\vehicle_images\\0_");
      out.print(resultSet.getString("vid"));
      out.write("_2.jpg\" alt=\"Image\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h3>Image 2</h3>\n");
      out.write("                                </div>      \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"asset\\Images\\vehicle_images\\0_");
      out.print(resultSet.getString("vid"));
      out.write("_3.jpg\" alt=\"Image\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h3>Image 3</h3>\n");
      out.write("                                </div>      \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"asset\\Images\\vehicle_images\\0_");
      out.print(resultSet.getString("vid"));
      out.write("_4.jpg\" alt=\"Image\">\n");
      out.write("                                <div class=\"carousel-caption\">\n");
      out.write("                                    <h3>Image 4</h3>\n");
      out.write("                                </div>      \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                            <span class=\"sr-only\">Next</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h2>Vehicle Details</h2></br>\n");
      out.write("                    <table class=\"table table-hover\" style=\"margin:20px 20px 20px 20px\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Specification</th>\n");
      out.write("                                <th>Description</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr> \n");
      out.write("                            <tr><td>Register No:</td> <td> ");
      out.print( resultSet.getString("register_no"));
      out.write("</td></tr>\n");
      out.write("                            <tr><td>Category</td> <td>");
      out.print(resultSet.getString("category"));
      out.write("</td></tr>\n");
      out.write("                            <tr><td>Make</td><td>");
      out.print(resultSet.getString("make"));
      out.write("</td></tr>\n");
      out.write("                            <tr><td>Model</td><td>");
      out.print(resultSet.getString("model"));
      out.write("</td></tr>\n");
      out.write("                            <tr><td>Year</td> <td>");
      out.print(resultSet.getString("year"));
      out.write("</td></tr>\n");
      out.write("                            <tr><td>Color</td> <td>");
      out.print(resultSet.getString("color"));
      out.write("</td></tr>\n");
      out.write("                            <tr><td>Mileage</td> <td>");
      out.print(resultSet.getString("mileage"));
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("                            <tr><td style=\" margin-left: 20px\" colspan=\"2\"><button class=\"btn btn-info\">Rent for Rs.");
      out.print(resultSet.getString("monthly"));
      out.write(" Monthly</button></td></tr>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                                }

                            } catch (Exception e) {
                                out.println(e);
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>  \n");
      out.write("\n");
      out.write("                </div>   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("        <footer class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">  \n");
      out.write("                <div  class=\"col-sm-6\"> \n");
      out.write("                    <div class=\"well well-sm\">\n");
      out.write("                        <p>Address:</br> &nbsp;&nbsp;&nbsp;&nbsp;No.24,</br>&nbsp;&nbsp;&nbsp;&nbsp;New Kandy Road,</br>&nbsp;&nbsp;&nbsp;&nbsp;Malabe,</br>&nbsp;&nbsp;&nbsp;&nbsp;Sri Lanka</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div  class=\"col-sm-3\"> \n");
      out.write("                    <p>Contact:</br>+94 11 2 456 789</br>+94 71 6 432 907</p>\n");
      out.write("                    <img style=\"height:60px\" src=\"asset\\Images\\Home\\icons.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div  class=\"col-sm-3\">\n");
      out.write("                    <img style=\"height:130px\" src=\"asset\\Images\\Home\\logo.jpg\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">  \n");
      out.write("\n");
      out.write("                <center><p> <span class=\"glyphicon glyphicon-copyright-mark\"> Copyright\n");
      out.write("                        </br>Samarajeewa D -IT18189704</p>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
