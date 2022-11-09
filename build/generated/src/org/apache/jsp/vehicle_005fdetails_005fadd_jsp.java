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

public final class vehicle_005fdetails_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <!doctype html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("        <head>\n");
      out.write("            <!-- Required meta tags -->\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"asset/vehicle-add-css.css\">\n");
      out.write("            <title>Add Vehicle </title>\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                footer {\n");
      out.write("                    background-color: #f2f2f2;\n");
      out.write("                    padding: 25px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2 class=\"text-center mt-3 col-sm-5 mb-3\">Vehicle Details</h2>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"leftside\">\n");
      out.write("                            <form class=\"form-horizontal\" method=\"post\" action=\"vehicle_InsertData\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Registration no</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Registration no\" name=\"reg_no\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Category</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("\n");
      out.write("                                        <select class=\"form-control\" name=\"category\">\n");
      out.write("                                            <option>Economy</option>\n");
      out.write("                                            <option>Compact</option>\n");
      out.write("                                            <option>Standard Sedan</option>\n");
      out.write("                                            <option>Mini Van</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Make</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("\n");
      out.write("                                        <select class=\"form-control\" name=\"make\">\n");
      out.write("                                            <option>Toyota </option>\n");
      out.write("                                            <option>Nissan </option>\n");
      out.write("                                            <option>Suzuki </option>\n");
      out.write("                                            <option>Mazda </option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Model</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Model\" name=\"model\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Year</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Year\" name=\"year\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Color</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Color\" name=\"color\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Mileage</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Mileage\" name=\"mileage\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Monthly Rent</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Monthly Rent\" name=\"monthly\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-offset-2 col-sm-5\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-block btn-success\">Add Details</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;
            
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
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
