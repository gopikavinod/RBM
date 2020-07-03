<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
   
    %>
    <%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    /* Add some padding on document's body to prevent the content
    to go underneath the header and footer */
    body{        
        padding-top: 60px;
        padding-bottom: 40px;
    }
    .container{
        margin: 0 auto; /* Center the DIV horizontally */
    }
    .fixed-header, .fixed-footer{
        width: 100%;
        position: fixed;        
        background: #333;
        padding: 10px 0;
        color: #fff;
    }
    .fixed-header{
        top: 0;
    }
  
    /* Some more styles to beutify this example */
  
    .container p{
        line-height: 200px; /* Create scrollbar to test positioning */
    }
    p.detail
    {
    color:yellow;
    line-height: 0px;
    font-size: x-large;
    }
    span.name{
    	color:white;
    	font-size: x-large;
    }
    tr
    {
    height: 5px;
    }
    span.aestric
    {
    color: red;
    }
  

</style>
<script>

function disableBackButton()
 {
  //location.href("logout.html");

 }
if(window.history.forward(1) != null)
         window.history.forward(1);
</script>
</head>
<body>

<style>

form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}
</style>
<div class="fixed-header">
<div class="container" style="padding-left: 493px;">
  <p class="detail" >TATA<span class="name">&nbsp;Hospital Management System</span></p>
</div>
 </div>
   <div class="container" style="width:1358px;height:500px">
 <div id= "serchdiv2"  style="padding-top: 39px;"> 
<form action="DiagnosistServlet" method="POST" name="billForm">
   <%
      
        Object patientid="";
        Object name ="";
        Object age="";
        Object doj= "";
        Object bedtype="";
        Object address="";
        Object dischargedate="";
        Object noOfDaysBetween="";
        Object roomcharge="";
        Object medicinename="";
        Object quantity="";
        Object rate="";
        Object amount=""; 
        Object diagnosisname="";
        Object diagnosisamount="";
        if(request.getAttribute("patientid")!=null)
        {
   			  patientid=request.getAttribute("patientid");
        }
        if(request.getAttribute("name")!=null)
        {
     		name =request.getAttribute("name");
        }
        if(request.getAttribute("age")!=null)
        {
              age=request.getAttribute("age");
        }
        if(request.getAttribute("doj")!=null ||request.getAttribute("bedtype")!=null||request.getAttribute("address")!=null||request.getAttribute("dischargedate")!=null ||request.getAttribute("noOfDaysBetween")!=null||request.getAttribute("roomcharge")!=null||request.getAttribute("medicinename")!=null||request.getAttribute("quantity")!=null||request.getAttribute("rate")!=null||request.getAttribute("amount")!=null)
        {
          
        doj= request.getAttribute("doj");
        bedtype=request.getAttribute("bedtype");
        address=request.getAttribute("address");
        dischargedate=request.getAttribute("dischargedate");
        noOfDaysBetween=request.getAttribute("noOfDaysBetween");
        roomcharge=request.getAttribute("roomcharge");
       // medicinename=request.getAttribute("medicinename");
        //quantity=request.getAttribute("quantity");
       // rate=request.getAttribute("rate");
       // amount=request.getAttribute("amount");
      //  System.out.println("medname>>>>>>>>>>>>>>>>>>>>>"+medicinename);
        }
        %>
        <h2 style="padding-left: 474px;">Diagnostics </h2>
<table style="width:80%" align="center" border="2" >


<!-- <tr >
<td >Patient Id
<font color="red">*</font>
</td>
<td><input type="text" name="pid" size=35 required="required"></td>
<td><input type="submit" name="submit" value="SUBMIT" required="required""></td>
</tr> -->
<tr bgcolor="black">
<th>
<font color="white">PatientID</font>
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
<font color="white">Type of Room</font>
</th>
</tr>

<tr>
<td style="width: 10px;"><input type="text" id="patientid" name="pid" placeholder="Search.." name="search2" required="required" style="padding: 8px;
  
  border: 1px solid grey;
  float: left;
  width: 76%;
  background: #f1f1f1;" value=<%=patientid %> >
  <button type="submit" style=" float: left;
  width: 24%;
  padding: 6px;
  background: searchicon.jpg;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;"><i class="fa fa-search" aria-hidden="true" ></i></button></td>
  
  <td><%=name %></td> <td><%=age %></td> <td><%=address %></td> <td><%=doj %></td> <td><%=bedtype %></td>
</tr>

<!-- <tr >
<td></td>
<td></td>
<td></td>
<td>No. of Days : </td>
<td>Bill for Room :</td>
</tr> -->

</table>
<p>
 <h2 style="padding-left: 474px;">Diagnostics Conducted  </h2>
<table style="width:80%" align="center" border="2">
<tr bgcolor="black">
<th>
<font color="white">Name of the Test</font>
</th>

<th>
<font color="white">Amount</font>
</th>
</tr>


<%
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe"; 
String username="system";
String password="system";
String pid=request.getParameter("pid");
if(pid!=null){
System.out.println(pid);
String query="select * from diagnostics  where patient_id='"+pid+"'";
Connection conn=DriverManager.getConnection(url, username, password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{
	diagnosisname=rs.getString("diagnosis");
	diagnosisamount=rs.getInt("diagnosis_rate");
%>
<tr><td><%=diagnosisname %></td> <td><%=diagnosisamount %></td></tr> 

<%}%>
</table>
<div style="padding-left: 592px;">
<input type="submit" value="Add Diagnostics" name="Add Diagnostics">

</div>
<%
rs.close();
stmt.close();
conn.close();
}
}
catch(Exception e)
{
e.printStackTrace();
}
%>
<%-- <tr >
<td><%=medicinename%></td><td><%=quantity %></td><td><%=rate %></td><td><%=amount %></td>
</tr> --%>



<table style="width:80%" align="center" border="2">

<tr bgcolor="black" >
<th>
<font color="white">Name of the test</font>
</th>
<th>
<font color="white">Amount</font>
</th>
</tr>


</table>

<div style="padding-left: 592px;">
<input type="submit" value="Add" name="add">

</div>
<div style="padding-left: 592px;">
<br>
<input type="submit" value="Update" name="update">
</div>

</form>
</div>
</p>
</div>
</div>
</body>
</html>