package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.vehicle;
import model.vehicle_availability;

public final class vehicle_005fedit_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!doctype html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("        <head>\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"asset/index-css.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                footer {\n");
      out.write("                    background-color: #f2f2f2;\n");
      out.write("                    padding: 25px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");


                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;

                String vid = request.getParameter("vid");

                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                statement = connection.createStatement();
                String sql = "SELECT * FROM vehicle_details WHERE vid=" + vid;

                resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
            
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h2>Update Vehicle Details</h2>\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\" method=\"post\" name=\"vehicle_edit_form\" action=\"vehicle_update\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-4 control-label\">Vehicle ID</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Vehicle Id\" value=\"");
      out.print( resultSet.getInt("vid"));
      out.write("\" name=\"vid\" id=\"vid\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Registration no</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter Registration no\" value=\"");
      out.print( resultSet.getString("register_no"));
      out.write("\" name=\"reg_no\" id=\"reg_no\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-5 control-label\" >Category</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter Category\" value=\"");
      out.print( resultSet.getString("category"));
      out.write("\" name=\"category\" id=\"category\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Make</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter Make\" value=\"");
      out.print( resultSet.getString("make"));
      out.write("\" name=\"make\" id=\"make\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Model</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Model\" value=\"");
      out.print( resultSet.getString("model"));
      out.write("\" id=\"model\" name=\"model\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Year</label> \n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Year\" value=\"");
      out.print( resultSet.getString("year"));
      out.write("\" id=\"year\" name=\"year\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Color</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Color\" value=\"");
      out.print( resultSet.getString("color"));
      out.write("\" id=\"color\" name=\"color\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Mileage</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Mileage\" value=\"");
      out.print( resultSet.getString("mileage"));
      out.write("\" id=\"mileage\" name=\"mileage\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Monthly</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter Monthly\" value=\"");
      out.print( resultSet.getString("monthly"));
      out.write("\" id=\"monthly\" name=\"monthly\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-6\">\n");
      out.write("                                    <button type=\"submit\" value=\"update\" name=\"update\" class=\"btn btn-block btn-secondary\">Update Vehicle</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>    \n");
      out.write("                    </div>     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                        <h2>Update Availability Details</h2>\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\" method=\"post\" name=\"vehicle_update_form\" action=\"vehicle_update_availability\">    \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Vehicle ID</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getInt("vid"));
      out.write("\" name=\"vid\" id=\"vid\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
 }
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");


                                Class.forName("com.mysql.jdbc.Driver");
                                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                                statement = connection.createStatement();
                                String sql2 = "SELECT * FROM vehicle_availability WHERE vid=" + vid;

                                resultSet = statement.executeQuery(sql2);
                                if (resultSet.next()) {
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--Pick Up update details -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Pick Up day</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getString("day"));
      out.write("\" name=\"update-pu-day\" id=\"update-pu-day\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Pick Up Month</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getString("month"));
      out.write("\" name=\"update-pu-month\" id=\"update-pu-month\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Pick Up Year</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getString("year"));
      out.write("\" name=\"update-pu-year\" id=\"update-pu-year\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--Drop off update details -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Drop Off day</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getString("drop_day"));
      out.write("\" name=\"update-do-day\" id=\"update-do-day\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Drop Off Month</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getString("drop_month"));
      out.write("\" name=\"update-do-month\" id=\"update-do-month\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" style =\"width:45%; display:inline-block;\">\n");
      out.write("                                <label>Drop Off Year</label>\n");
      out.write("                                <div style =\"width:100%; display:inline-block;\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"\" value=\"");
      out.print( resultSet.getString("drop_year"));
      out.write("\" name=\"update-do-year\" id=\"update-do-year\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </br>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-6\">\n");
      out.write("                                    <button type=\"submit\" value=\"update\" name=\"update\" class=\"btn btn-block btn-secondary\">Update Availability</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form> \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </div> \n");
      out.write("                </div>       \n");
      out.write("\n");
      out.write("            </div>     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("            <footer class=\"container-fluid text-center\">\n");
      out.write("\n");
      out.write("                <p> <span class=\"glyphicon glyphicon-copyright-mark\"> Copyright\n");
      out.write("                    </br>Samarajeewa D -IT18189704</p>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
