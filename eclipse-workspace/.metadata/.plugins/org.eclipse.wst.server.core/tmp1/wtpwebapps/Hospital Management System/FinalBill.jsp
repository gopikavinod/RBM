<%@ include file = "test.jsp" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
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
<div class="container">

    
    <p>
 <div id= "serchdiv2"  style="padding-top: 39px;"> 
<form action="FinalBillServlet" method="POST" name="billForm">
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
        double total_amount=0.00;
        Object diagnosisname="";
        Object diagnosisamount="";
        double totaldignosis_amnt=0.00;
        String str ="";
        double d=0.00;
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
        str= roomcharge.toString();  d = Double.valueOf(str).doubleValue();
       // medicinename=request.getAttribute("medicinename");
        //quantity=request.getAttribute("quantity");
       // rate=request.getAttribute("rate");
       // amount=request.getAttribute("amount");
      //  System.out.println("medname>>>>>>>>>>>>>>>>>>>>>"+medicinename);
        }
        %>
        <h2 style="padding-left: 474px;">Patient Billing</h2>
<table style="width:100%" align="center" border="2" >


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
<font color="white">Date of Discharge</font>
</th>
<th>
<font color="white">Type of Room</font>
</th>
</tr>

<tr>
<td><input type="text" id="patientid" name="pid" placeholder="Search.." name="search2" required="required" style="padding: 8px;
  
  border: 1px solid grey;
  float: left;
  width: 76%;
  background: #f1f1f1;" value=<%=patientid %> >
  <button type="submit" style=" float: left;
  width: 14%;
  padding: 6px;
  background: searchicon.jpg;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;"><i class="fa fa-search" aria-hidden="true" ></i></button></td>
  
  <td><%=name %></td> <td><%=age %></td> <td><%=address %></td> <td><%=doj %></td> <td><%=dischargedate %></td> <td><%=bedtype %></td>
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
<h3 style="padding-left: 781px;">No. of Days :<%=noOfDaysBetween %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Bill for Room :<%=roomcharge %></h3></p>
<h2 style="padding-left: 474px;">Pharmacy Charges</h2>

<table style="width:100%" align="center" border="2">
<tr bgcolor="black">
<th>
<font color="white">Medicine</font>
</th>
<th>
<font color="white">Quantity</font>
</th>
<th>
<font color="white">Rate</font>
</th>
<th>
<font color="white">Amount</font>
</th>
</tr>
<%
try
{
	String pid=request.getParameter("pid");
	if(pid!=null){
	System.out.println(pid);
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe"; 
String username="system";
String password="system";
String query="select * from tbl_medicine  a inner join  (select * from tbl_issued_medicine where patient_id='"+pid+"') b on a.medicine_id=b.medicine_id inner join  (select patient_id from tbl_patient )c on b.patient_id=c.patient_id";
Connection conn=DriverManager.getConnection(url, username, password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);

while(rs.next())
{
	medicinename=rs.getString("medicine_name");
	quantity=rs.getInt("quantity");
	rate=rs.getInt("rate");
	amount=rs.getInt("quantity")*rs.getInt("rate");
	  total_amount=total_amount+rs.getInt("quantity")*rs.getInt("rate");
%>
<tr><td><%=medicinename %></td> <td><%=quantity %></td><td><%=rate %></td><td><%=amount%></td></tr>

<%}%>
</table>
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

<h3 style="padding-left: 781px;">Pharmacy Charges :<%=total_amount %></h3>
<h2 style="padding-left: 474px;">Diagnostic Charges</h2>
<table style="width:100%" align="center" border="2">
<tr bgcolor="black">
<th>
<font color="white">Name of the test</font>
</th>
<th>
<font color="white">Amount</font>
</th>
</tr>

<%
try
{
	String pid=request.getParameter("pid");
	if(pid!=null){
	System.out.println(pid);
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe"; 
String username="system";
String password="system";
String query="select * from diagnostics  where patient_id='"+pid+"'";
Connection conn=DriverManager.getConnection(url, username, password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);

while(rs.next())
{
	diagnosisname=rs.getString("diagnosis");
	diagnosisamount=rs.getInt("diagnosis_rate");
	totaldignosis_amnt=totaldignosis_amnt+rs.getInt("diagnosis_rate");
%>
<tr><td><%=diagnosisname %></td> <td><%=diagnosisamount %></td></tr>

<%
}%>
</table>
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
<div>
<h3 style="padding-left: 781px;">Bill for Diagnostics :<%=totaldignosis_amnt %></h3>
<h3 style="padding-left: 781px;">Grand Total  :<%=total_amount+totaldignosis_amnt+d%></h3>
<p style="padding-left: 563px;"><input type="submit" name ="action" value="Confirm" name="confirm" style="width: 95px;
    height: 50px;"></td>
</div>
</form>
	<div style="color:red;padding-left: 326px;">
		<h2>
	${message1}<br>
		<%session.setAttribute("message1", null); %>
		</div>
</div>
</p>
</div>