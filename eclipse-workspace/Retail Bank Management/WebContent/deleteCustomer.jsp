<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
     import="com.bean.CustomerBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
    font-size: 30px
    }
    span.name{
    	color:white;
    	 font-size: 30px
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
<script>

function disableBackButton()
 {
  //location.href("logout.html");

 }
if(window.history.forward(1) != null)
         window.history.forward(1);
</script>

</head>
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
      <a href="/Retail_Bank_Management/deleteCustomer.jsp">Delete Customer</a>
      <a href="/Retail_Bank_Management/customerStatus.jsp">View Customer Details</a>
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
                <a href="/Retail_Bank_Management/LogoutServlet" onclick="disableBackButton()">Logout</a>
            </nav>
        </div>
    </div>
    <div class="container">
    <p>
     <h2>DELETE CUSTOMER</h2>
    <div id="searchdiv1" ${param.searchButton == 'Search'?'hidden':''}>
    	<form action="DeleteCustomerServlet" name="deleteCustomer"  method="post" style="margin-top: 95px;
    margin-left: 299px;" >
    <h2 style="margin-left: 89px;">Delete Customer</h2>
    <table>
   <tr >
<td>Customer SSNID:</td>
<td><input type="text" id="cssnid" name="customerssnid" value="" > </td>
</tr>
<tr >
<td>Customer ID:</td>
<td><input type="text" id="custid" name="customerid" value=""> </td>
</tr>
<tr colspan="2" >
<td></td>
<td><input type="submit" name="searchButton" value="Search" style="background-color: black;color: yellow ;width:97px"></td>
</tr>




 

</table>
    	
    	</form>
    	</div>
 <div id= "serchdiv2"  ${param.searchButton == 'Search'?'':'hidden'}>   	
<form  action="DeleteCustomerServlet" name="deleteCustomer"  method="post"   style="margin-top: 95px;
    margin-left: 299px;">
    <%Object name=request.getAttribute("name");
    Object address=request.getAttribute("address");
    Object age=request.getAttribute("age");
    Object ssn=request.getAttribute("ssn");
    Object custid=request.getAttribute("custid");
    
    %>
   
    <h2 style="margin-left: 89px;">Delete Customer</h2>
    	<table>
    	<tr >
<td>Customer SSNID:</td>
<td><input type="text" id="cssnid" name="customerssnid" value="<%=ssn %>" readonly="readonly"> </td>
</tr>
<tr >
<td>Customer ID:</td>
<td><input type="text" id="custid" name="customerid" value="<%=custid %>" readonly="readonly"> </td>
</tr>
    	<tr>
<td>Customer Name:</td>
<td><input type="text" id="cname" name="customername"   value="<%=name %>" readonly="readonly" > </td>
</tr>

<td>Address:</td>
<td> <input type="text" id="oaddress" name="customeroaddress" value="<%=address %>"  readonly="readonly"></td>
</tr>
<td>Age:</td>
<td> <input type="text" id="oage" name="customeroage" value = "<%=age %>" readonly="readonly"></td>
</tr>

<tr colspan="2" >
<td><input type="submit"  name="deleteButton" value="Delete" style="background-color: black;color: yellow ;width:97px"></td>
<td><input type="submit"  name="cancelButton" value="Cancel" style="background-color: black;color: yellow ;width:97px"></td>
</tr>
    	</table>
    	
    	</form>
    	</div>
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