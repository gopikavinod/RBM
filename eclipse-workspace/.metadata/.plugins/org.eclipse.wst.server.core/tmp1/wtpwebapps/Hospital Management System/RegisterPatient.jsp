<%@ include file = "test.jsp" %>
    <div class="container">
    <p>
    	<form action="CreatePatientServlet" name="createPatient" method="post" margin-top: 95px;
    margin-left: 299px;  >
    <h2 style="margin-left: 424px; margin-top: 61px;">Create Patient</h2>
    <table style="margin-left: 333px;">
<tr >
<td>Patient SSNID<span class="aestric">*</span>:</td>
<td><input type="text" id="pssnid" name="patientssnid" value="" > </td>
</tr>
<tr>
<td>Patient Name<span class="aestric">*</span>:</td>
<td><input type="text" id="pname" name="patientrname" value="" required="required"> </td>
</tr>
<tr>
<td>Age<span class="aestric">*</span>:</td>
<td><input type="number" id="age" name="patientage" value="" required="required"></td>
</tr>
<tr>
<td>Date Of Admission<span class="aestric">*</span>:</td>
<td><input type="date" id="date" name="admissiondate" value="" required="required"></td>
</tr>
<tr>
<td>Type of Bed<span class="aestric">*</span>:</td>
<td><select name="bedtype" id="typeofbed">
	<option value="select">select</option>
  <option value="generalward">General Ward</option>
  <option value="semisharing">Semi Sharing</option>
  <option value="single">Single Room</option>
  </select></td>
</tr>
<tr>
<td>Address<span class="aestric">*</span>:</td>
<td> <input type="text" id="address" name="patientaddress" value="" required="required"></td>
</tr>
<tr>
<td>State<span class="aestric">*</span>:</td>
<td> <select name="state" id="state">
<option value="select">select</option>
  <option value="Kerala">Kerala</option>
  <option value="TamilNadu">TamilNadu</option>
  <option value="Karnataka">Karnataka</option>
  <option value="Delhi">Delhi</option>
</select>
</td>
</tr>
<tr>
<td>City<span class="aestric">*</span>:</td>
<td> <select name="city" id="city">
<option value="select">select</option>
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
<td><input type="submit" value="Submit" style="background-color: black;color: yellow ;width:97px"></td>
<td><input type="reset" value="Reset" style="background-color: black;color: yellow ;width:97px"></td>
</tr>

</table>
    	
    	</form>
     <br>
		<div style="color: red;padding-left: 336px;font-size: larger;">
		<br>
		${message1} <br>
		<%session.setAttribute("message1", null); %>
		</div>
    	</p>
    	    </div>    

</body>
   </html>