<%@page import="com.bean.LoginServlet"%>
<%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="com.bean.UserBean"
         
   %>
 
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">

   <html>

      <head>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
     <%--  <% String message = (String)request.getAttribute("alertMsg");%>
	<script type="text/javascript">
    var msg = "<%=message%>";
    alert(msg);
</script> --%>
   <title>FedChoice Bank</title>
<style>
    /* Add some padding on document's body to prevent the content
    to go underneath the header and footer */
    body{        
        padding-top: 60px;
        padding-bottom: 40px;
    }
    .container{
        width: 80%;
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
    .fixed-footer{
        bottom: 0;
    }    
    /* Some more styles to beutify this example */
    nav a{
        color: #fff;
        text-decoration: none;
        padding: 7px 25px;
        display: inline-block;
    }
    .container p{
        line-height: 200px; /* Create scrollbar to test positioning */
    }
    p.detail
    {
    color:yellow;
    line-height: 0px;
    }
    span.name{
    	color:white;
    }
    tr
    {
    height: 40px;
    }
    span.aestric
    {
    color: red;
    }
    .topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
    .dropdown {
  float: left;
  overflow: hidden;
}
.dropdown .dropbtn {
  font-size: 17px;    
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.topnav a:hover, .dropdown:hover .dropbtn {
  background-color: #555;
  color: white;
}

.dropdown-content a:hover {
  background-color: #ddd;
  color: black;
}

.dropdown:hover .dropdown-content {
  display: block;
}

</style>
</head>
<body>
    <div class="fixed-header">
        <div class="container">
            <nav>
          <p class="detail">FedChoice<span class="name">Bank</span></p>
          <div class="topnav" id="myTopnav">
                <a href="#">Home</a>
                <div class="dropdown">
    <button class="dropbtn">Customer Management 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="/Retail_Bank_Management/userLogged.jsp">Create Customer</a>
      <a href="/Retail_Bank_Management/updateCustomer.jsp">Update Customer</a>
      <a href="/Retail_Bank_Management/DeleteCustomer.jsp">Delete Customer</a>
      <a href="#">View Customer Details</a>
    </div>
    </div>
  
   <div class="dropdown">
    <button class="dropbtn">Account Management 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Add Account</a>
      <a href="#">Update Account</a>
      <a href="#">Delete Account</a>
      <a href="#">View Account Details</a>
    </div>
    </div>
             
               
                <a href="#">Status Details</a>
                <a href="#">Account Operation</a>
                <a href="#">Logout</a>
            </nav>
        </div>
    </div>
    <div class="container">
    <p>
    	<form action="CustomerServlet" name="createCustomer" enctype="multipart/form-data" style="margin-top: 95px;
    margin-left: 299px;" >
    <table>
<tr >
<td>Customer SSNID<span class="aestric">*</span>:</td>
<td><input type="text" id="cssnid" name="customerssnid" value="" > </td>
</tr>
<tr >
<td>Customer ID<span class="aestric">*</span>:</td>
<td><input type="text" id="custid" name="customerid" value=""> </td>
</tr>
<tr>
<td>Customer Name<span class="aestric">*</span>:</td>
<td><input type="text" id="cname" name="customername" value="" required="required"> </td>
</tr>
<tr>
<td>Age<span class="aestric">*</span>:</td>
<td><input type="number" id="age" name="customerage" value="" required="required"></td>
</tr>
<tr>
<td>Address<span class="aestric">*</span>:</td>
<td> <input type="text" id="address" name="customeraddress" value="" required="required"></td>
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
<td>City*:</td>
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
    	</p>
    	    </div>    
    <div class="fixed-footer">
        <div class="container">
        <nav>
         
                <a href="#">About Us</a>
                <a href="#">Services</a>
                <a href="#">Contact</a>
        </nav>
        </div>        
    </div>
</body>
   </html>