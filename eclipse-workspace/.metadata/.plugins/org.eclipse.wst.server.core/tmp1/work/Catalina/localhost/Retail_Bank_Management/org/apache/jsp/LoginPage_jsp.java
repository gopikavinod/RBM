/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-06-15 14:31:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=windows-1256");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1256\">\r\n");
      out.write("\t\t<title>Login Page</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body >\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction form_validation() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar uname=document.myForm.un.value;\r\n");
      out.write("\t\tvar pwd=document.myForm.pw.value\r\n");
      out.write("\t\tif(uname==\"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t alert(\"please enter username\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\telse if(pwd==\"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<form action=\"LoginServlet\" name=\"myForm\"  style=\"height: 100%\"  onsubmit=\" return form_validation();\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- \tPlease enter your username \t\t\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"un\"/><br>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tPlease enter your password\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pw\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"submit\"> -->\t\t\r\n");
      out.write("<table align=\"center\" border=\"1\" width=\"30%\" bgcolor=\"#D3D3D3\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\" colspan=\"2\"  style=\"background-color: black; color: white;\" >Login</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=\"text\" name=\"un\" style=\"width: 98% \" colspan=\"2\" placeholder=\"username\" minlength=\"8\"  >  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td> <input type=\"password\" name=\"pw\" style=\"width: 98%\" colspan=\"2\" placeholder=\"password\"  pattern=\"^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$\" oninvalid=\"this.setCustomValidity('Invalid Password')\" required=\"required\" > </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\" colspan=\"2\"><input type=\"submit\" value=\"Login\"><a href=\"Signup.jsp\">Sign up</a>  </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
