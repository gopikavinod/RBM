<%@ include file = "test.jsp" %>
<div class="container">
    <p>
 <div id= "serchdiv2" style="padding-top: 92px"> 
<form action="ViewPatientServlet" name="viewForm" style"" onload="disableBackButton()" onsubmit="" method="POST">
       <%
      
        Object patientid="";
        Object name ="";
        Object age="";
        Object doj= "";
        Object bedtype="";
        Object address="";
        Object state="";
        Object city="";
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
        if(request.getAttribute("doj")!=null ||request.getAttribute("bedtype")!=null||request.getAttribute("address")!=null||request.getAttribute("state")!=null||request.getAttribute("city")!=null)
        {
          
        doj= request.getAttribute("doj");
        bedtype=request.getAttribute("bedtype");
        address=request.getAttribute("address");
        state=request.getAttribute("state");
        city=request.getAttribute("city");

        }
    %>
<h2 style="margin-left: 452px; margin-top: -41px;">View Patient</h2>
<table style="width:100%" align="center" >

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



<tr>
<td><%=patientid %></td>
</tr>


<tr>
<td></td>
</tr>

<tr>
<td></td>
</tr>
</table>



</form>
</div>
</p>
</div>