<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ include file = "test.jsp" %>
<%@ page import="com.dao.PatientDAO" %>
<form method="post" style="padding-top: 69px;">

<table style="width:100%" align="center" border="2">

<tr bgcolor="black">
<th>
<font color="white">Patient Id</font>
</th>
<th>
<font color="white">Name</font>
</th>
<th>
<font color="white">Age</font>
</th>
<th>
<font color="white">Address</font>
</th>
<th>
<font color="white">DOJ</font>
</th>
<th>
<font color="white">Type Of Room</font>
</th>
</tr>

<%
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
%>
<tr><td><%=id %></td> <td><%=name %></td><td><%=age %></td><td><%=address %></td><td><%=doj%></td><td><%=bedtype %></td></tr>


 <%

}
%>
</table>
<%
rs.close();
stmt.close();
conn.close();
}
catch(Exception e)
{
e.printStackTrace();
}
%>
</form>