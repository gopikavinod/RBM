/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-06-22 08:12:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.CustomerBean;

public final class deleteCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write(" <title>FedChoice Bank</title>\r\n");
      out.write("<style>\r\n");
      out.write("    /* Add some padding on document's body to prevent the content\r\n");
      out.write("    to go underneath the header and footer */\r\n");
      out.write("    body{        \r\n");
      out.write("        padding-top: 60px;\r\n");
      out.write("        padding-bottom: 40px;\r\n");
      out.write("    }\r\n");
      out.write("    .container{\r\n");
      out.write("        width: 80%;\r\n");
      out.write("        margin: 0 auto; /* Center the DIV horizontally */\r\n");
      out.write("    }\r\n");
      out.write("    .fixed-header, .fixed-footer{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        position: fixed;        \r\n");
      out.write("        background: #333;\r\n");
      out.write("        padding: 10px 0;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("    }\r\n");
      out.write("    .fixed-header{\r\n");
      out.write("        top: 0;\r\n");
      out.write("    }\r\n");
      out.write("    .fixed-footer{\r\n");
      out.write("        bottom: 0;\r\n");
      out.write("    }    \r\n");
      out.write("    /* Some more styles to beutify this example */\r\n");
      out.write("    nav a{\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        padding: 7px 25px;\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("    }\r\n");
      out.write("    .container p{\r\n");
      out.write("        line-height: 200px; /* Create scrollbar to test positioning */\r\n");
      out.write("    }\r\n");
      out.write("    p.detail\r\n");
      out.write("    {\r\n");
      out.write("    color:yellow;\r\n");
      out.write("    line-height: 0px;\r\n");
      out.write("    font-size: 30px\r\n");
      out.write("    }\r\n");
      out.write("    span.name{\r\n");
      out.write("    \tcolor:white;\r\n");
      out.write("    \t font-size: 30px\r\n");
      out.write("    }\r\n");
      out.write("    tr\r\n");
      out.write("    {\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    }\r\n");
      out.write("    span.aestric\r\n");
      out.write("    {\r\n");
      out.write("    color: red;\r\n");
      out.write("    }\r\n");
      out.write("    .topnav {\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("    .dropdown {\r\n");
      out.write("  float: left;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write(".dropdown .dropbtn {\r\n");
      out.write("  font-size: 17px;    \r\n");
      out.write("  border: none;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  background-color: inherit;\r\n");
      out.write("  font-family: inherit;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  background-color: #f9f9f9;\r\n");
      out.write("  min-width: 160px;\r\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("  float: none;\r\n");
      out.write("  color: black;\r\n");
      out.write("  padding: 12px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: block;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover, .dropdown:hover .dropbtn {\r\n");
      out.write("  background-color: #555;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write(" <div class=\"fixed-header\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <nav>\r\n");
      out.write("          <p class=\"detail\">FedChoice<span class=\"name\">Bank</span></p>\r\n");
      out.write("          <div class=\"topnav\" id=\"myTopnav\">\r\n");
      out.write("                <a href=\"#\">Home</a>\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("    <button class=\"dropbtn\">Customer Management \r\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"dropdown-content\">\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/userLogged.jsp\">Create Customer</a>\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/updateCustomer.jsp\">Update Customer</a>\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/deleteCustomer.jsp\">Delete Customer</a>\r\n");
      out.write("      <a href=\"#\">View Customer Details</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("   <div class=\"dropdown\">\r\n");
      out.write("    <button class=\"dropbtn\">Account Management \r\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"dropdown-content\">\r\n");
      out.write("      <a href=\"#\">Add Account</a>\r\n");
      out.write("      <a href=\"#\">Update Account</a>\r\n");
      out.write("      <a href=\"#\">Delete Account</a>\r\n");
      out.write("      <a href=\"#\">View Account Details</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("             \r\n");
      out.write("               \r\n");
      out.write("                <a href=\"#\">Status Details</a>\r\n");
      out.write("                <a href=\"#\">Account Operation</a>\r\n");
      out.write("                <a href=\"#\">Logout</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <p>\r\n");
      out.write("     <h2>DELETE CUSTOMER</h2>\r\n");
      out.write("    <div id=\"searchdiv1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.searchButton == 'Search'?'hidden':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("    \t<form action=\"DeleteCustomerServlet\" name=\"deleteCustomer\"  method=\"post\" style=\"margin-top: 95px;\r\n");
      out.write("    margin-left: 299px;\" >\r\n");
      out.write("    <h2 style=\"margin-left: 89px;\">Delete Customer</h2>\r\n");
      out.write("    <table>\r\n");
      out.write("   <tr >\r\n");
      out.write("<td>Customer SSNID:</td>\r\n");
      out.write("<td><input type=\"text\" id=\"cssnid\" name=\"customerssnid\" value=\"\" > </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("<td>Customer ID:</td>\r\n");
      out.write("<td><input type=\"text\" id=\"custid\" name=\"customerid\" value=\"\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr colspan=\"2\" >\r\n");
      out.write("<td></td>\r\n");
      out.write("<td><input type=\"submit\" name=\"searchButton\" value=\"Search\" style=\"background-color: black;color: yellow ;width:97px\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("    \t\r\n");
      out.write("    \t</form>\r\n");
      out.write("    \t</div>\r\n");
      out.write(" <div id= \"serchdiv2\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.searchButton == 'Search'?'':'hidden'}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">   \t\r\n");
      out.write("<form  action=\"DeleteCustomerServlet\" name=\"deleteCustomer\"  method=\"post\"   style=\"margin-top: 95px;\r\n");
      out.write("    margin-left: 299px;\">\r\n");
      out.write("    ");
Object name=request.getAttribute("name");
    Object address=request.getAttribute("address");
    Object age=request.getAttribute("age");
    Object ssn=request.getAttribute("ssn");
    Object custid=request.getAttribute("custid");
    
    
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <h2 style=\"margin-left: 89px;\">Delete Customer</h2>\r\n");
      out.write("    \t<table>\r\n");
      out.write("    \t<tr >\r\n");
      out.write("<td>Customer SSNID:</td>\r\n");
      out.write("<td><input type=\"text\" id=\"cssnid\" name=\"customerssnid\" value=\"");
      out.print(ssn );
      out.write("\" readonly=\"readonly\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr >\r\n");
      out.write("<td>Customer ID:</td>\r\n");
      out.write("<td><input type=\"text\" id=\"custid\" name=\"customerid\" value=\"");
      out.print(custid );
      out.write("\" readonly=\"readonly\"> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("<td>Customer Name:</td>\r\n");
      out.write("<td><input type=\"text\" id=\"cname\" name=\"customername\"   value=\"");
      out.print(name );
      out.write("\" readonly=\"readonly\" > </td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<td>Address:</td>\r\n");
      out.write("<td> <input type=\"text\" id=\"oaddress\" name=\"customeroaddress\" value=\"");
      out.print(address );
      out.write("\"  readonly=\"readonly\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<td>Age:</td>\r\n");
      out.write("<td> <input type=\"text\" id=\"oage\" name=\"customeroage\" value = \"");
      out.print(age );
      out.write("\" readonly=\"readonly\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr colspan=\"2\" >\r\n");
      out.write("<td><input type=\"submit\"  name=\"deleteButton\" value=\"Delete\" style=\"background-color: black;color: yellow ;width:97px\"></td>\r\n");
      out.write("<td><input type=\"button\"  name=\"cancelButton\" value=\"Cancel\" style=\"background-color: black;color: yellow ;width:97px\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("    \t</table>\r\n");
      out.write("    \t\r\n");
      out.write("    \t</form>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t</p>\r\n");
      out.write("    \t    </div>    \r\n");
      out.write("    <div class=\"fixed-footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <nav>\r\n");
      out.write("         \r\n");
      out.write("                <a href=\"#\">About Us</a>\r\n");
      out.write("                <a href=\"#\">Services</a>\r\n");
      out.write("                <a href=\"#\">Contact</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </div>        \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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