<%@ include file = "test.jsp" %>
    <div class="container">

    
    <p>
 <div id= "serchdiv2" style="padding-left: 318px; ">  
<form action="DeletePatientServlet" name="deletePatient" method="post" margin-top: 95px;
    margin-left: 299px;  >
    
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
     <h2 style="margin-left: 97px; margin-top: 61px;">Delete Patient</h2>
    <table>
 <tr >
<td>Patient ID<span class="aestric">*</span>:</td>
<td><input type="text" id="pid" name="patientid" value="<%=patientid%>" > </td>
<td><input type="submit" id="searchbtn" name="action" value="Search" style="background-color: black;color: yellow ;width:97px">
</tr>
<tr>
<td>Patient Name<span class="aestric">*</span>:</td>
<td><input type="text" id="pname" name="patientname" value="<%=name %>" readonly="readonly"> </td>
</tr>
<tr>
<td>Age<span class="aestric">*</span>:</td>
<td><input type="number" id="age" name="patientage" value="<%=age %>" readonly="readonly"></td>
</tr>
<tr>
<td>Date Of Admission<span class="aestric">*</span>:</td>
<td><input type="date" id="date" name="admissiondate" value="<%=doj%>" readonly="readonly"></td>
</tr>
<tr>
<td>Type of Bed<span class="aestric">*</span>:</td>
<td><select name="bedtype" id="typeofbed">
	<option value="<%=bedtype %>"><%=bedtype%></option>
  <option value="generalward">General Ward</option>
  <option value="semisharing">Semi Sharing</option>
  <option value="single">Single Room</option>
  </select></td>
</tr>
<tr>
<td>Address<span class="aestric">*</span>:</td>
<td> <input type="text" id="address" name="patientaddress" value="<%=address %>" readonly="readonly"></td>
</tr>
<tr>
<td>State<span class="aestric">*</span>:</td>
<td> <select name="state" id="state" readonly="readonly">
<option value="<%=state%>"><%=state%></option>
  <option value="Kerala">Kerala</option>
  <option value="TamilNadu">TamilNadu</option>
  <option value="Karnataka">Karnataka</option>
  <option value="Delhi">Delhi</option>
</select>
</td>
</tr>
<tr>
<td>City<span class="aestric">*</span>:</td>
<td> <select name="city" id="city" readonly="readonly">
<option value="<%=city%>"><%=city%></option>
  <option value="Ernakulam">Ernakulam</option>
  <option value="Thrissur">Thrissur</option>
  <option value="Palakkad">Palakkad</option>
  <option value="Thiruvanathapuram">Thiruvanathapuram</option>
</select>
</td>
</tr>
<tr >
<td style="color: red;"> (*)Fields are compulsory</td>

</tr>

<tr colspan="1">

<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name ="action" value="Delete" style="background-color: black;color: yellow ;width:97px"></td>

</tr>

</table>
    	
    	</form>
    	</div>

		<div style="color:red;padding-left: 326px;">
		<h2>
	${data1}<br>
		<%session.setAttribute("data1", null); %>
		</div>
		
		
    	</p>
    	
    	    </div>    

</body>
   </html>