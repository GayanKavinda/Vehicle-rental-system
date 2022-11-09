package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vehicle_005fdetails_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title></title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-8\">\r\n");
      out.write("                <div class=\"leftside\">\r\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"InsertData\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-3 control-label\">Customer Name</label>\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Customer Name\" name=\"customer_name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Amount</label>\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" placeholder=\"Enter Amount\" name=\"amount\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Payment Type</label>\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                       \r\n");
      out.write("                            <select class=\"form-control\" name=\"payment_type\">\r\n");
      out.write("                                <option>Credit Card </option>\r\n");
      out.write("                                <option>Cash</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>   \r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-5 control-label\">Discount(%)</label>\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                            <select class=\"form-control\" name=\"discount\">\r\n");
      out.write("                                    <option>10 </option>\r\n");
      out.write("                                    <option>15</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                       </div>\r\n");
      out.write("                    </div>    \r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-5\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block btn-success\">Add Payment</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("   </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
