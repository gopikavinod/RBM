/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-07-03 15:05:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import com.dao.PatientDAO;

public final class ViewPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/test.jsp", Long.valueOf(1593691807595L));
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>TATA Hospital Management System</title>\r\n");
      out.write("<style>\r\n");
      out.write("    /* Add some padding on document's body to prevent the content\r\n");
      out.write("    to go underneath the header and footer */\r\n");
      out.write("    body{        \r\n");
      out.write("        padding-top: 60px;\r\n");
      out.write("        padding-bottom: 40px;\r\n");
      out.write("    }\r\n");
      out.write("    .container{\r\n");
      out.write("        width: 84%;\r\n");
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
      out.write("    font-size: x-large;\r\n");
      out.write("    }\r\n");
      out.write("    span.name{\r\n");
      out.write("    \tcolor:white;\r\n");
      out.write("    \tfont-size: x-large;\r\n");
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
      out.write("  \r\n");
      out.write("  font-size: x-large;\r\n");
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
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function disableBackButton()\r\n");
      out.write(" {\r\n");
      out.write("  //location.href(\"logout.html\");\r\n");
      out.write("\r\n");
      out.write(" }\r\n");
      out.write("if(window.history.forward(1) != null)\r\n");
      out.write("         window.history.forward(1);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <div class=\"fixed-header\">\r\n");
      out.write("        <div class=\"container\" >\r\n");
      out.write("            <nav>\r\n");
      out.write("         <p class=\"detail\"  style=\"padding-left: 400px;\">TATA<span class=\"name\">&nbsp;Hospital Management System</span></p>\r\n");
      out.write("          <div class=\"topnav\" id=\"myTopnav\" display=\"none\">\r\n");
      out.write("  <!--           <div class=\"dropdown\">\r\n");
      out.write("    <button class=\"dropbtn\" style=\"font-size: x-large;\">Create Patient\r\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"dropdown-content\">\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/userLogged.jsp\">Patient Registration</a>\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/updateCustomer.jsp\">Update Patient</a>\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/deleteCustomer.jsp\">Delete Patient</a>\r\n");
      out.write("      <a href=\"/Retail_Bank_Management/customerStatus.jsp\">View Patients</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div> -->\r\n");
      out.write("  \r\n");
      out.write("                 <a href=\"/Hospital_Management_System/RegisterPatient.jsp\"  style=\"font-size: x-large;\">Create Patient</a>\r\n");
      out.write("                <a href=\"/Hospital_Management_System/UpdatePatient.jsp\"  style=\"font-size: x-large;\">Update Patient</a>\r\n");
      out.write("                <a href=\"/Hospital_Management_System/DeletePatient.jsp\"  style=\"font-size: x-large;\">Delete Patient</a>\r\n");
      out.write("                <a href=\"/Hospital_Management_System/SearchPatient.jsp\"  style=\"font-size: x-large;\">Search Patient</a>\r\n");
      out.write("                <a href=\"/Hospital_Management_System/ViewPatient.jsp\"  style=\"font-size: x-large;\">View Patient</a>\r\n");
      out.write("                <a href=\"/Hospital_Management_System/FinalBill.jsp\"  style=\"font-size: x-large;\">Bill Generation</a>\r\n");
      out.write("                 <a href=\"/Hospital_Management_System/LogoutServlet\" onclick=\"disableBackButton()\"  style=\"font-size: x-large;\">Logout</a>\r\n");
      out.write("          </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" style=\"padding-top: 69px;\">\r\n");
      out.write("\r\n");
      out.write("<table style=\"width:100%\" align=\"center\" border=\"2\">\r\n");
      out.write("\r\n");
      out.write("<tr bgcolor=\"black\">\r\n");
      out.write("<th>\r\n");
      out.write("<font color=\"white\">Patient Id</font>\r\n");
      out.write("</th>\r\n");
      out.write("<th>\r\n");
      out.write("<font color=\"white\">Name</font>\r\n");
      out.write("</th>\r\n");
      out.write("<th>\r\n");
      out.write("<font color=\"white\">Age</font>\r\n");
      out.write("</th>\r\n");
      out.write("<th>\r\n");
      out.write("<font color=\"white\">Address</font>\r\n");
      out.write("</th>\r\n");
      out.write("<th>\r\n");
      out.write("<font color=\"white\">DOJ</font>\r\n");
      out.write("</th>\r\n");
      out.write("<th>\r\n");
      out.write("<font color=\"white\">Type Of Room</font>\r\n");
      out.write("</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe"; 
String username="system";
String password="system";
String query="select * from tbl_patient";
Connection conn=DriverManager.getConnection(url, username, password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{
	int id=rs.getInt("patient_id");
	String name=rs.getString("patient_name");
		int age =rs.getInt("age");
		String doj=rs.getString("date_of_joining");
		System.out.println("doj >>>>"+doj);
		String bedtype=rs.getString("room_type");
		String address=rs.getString("address");
		String city=rs.getString("city");
		String state=rs.getString("state");

      out.write("\r\n");
      out.write("<tr><td>");
      out.print(id );
      out.write("</td> <td>");
      out.print(name );
      out.write("</td><td>");
      out.print(age );
      out.write("</td><td>");
      out.print(address );
      out.write("</td><td>");
      out.print(doj);
      out.write("</td><td>");
      out.print(bedtype );
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");


}

      out.write("\r\n");
      out.write("</table>\r\n");

rs.close();
stmt.close();
conn.close();
}
catch(Exception e)
{
e.printStackTrace();
}

      out.write("\r\n");
      out.write("</form>");
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
