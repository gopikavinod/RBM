<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
   
    %>
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
 <div class="fixed-header">
<div class="container" style="padding-left: 493px;">
  <p class="detail" >TATA<span class="name">&nbsp;Hospital Management System</span></p>
</div>
 </div>
   <div class="container" style="background-color: dimgrey;width:1358px;height:500px">
   	<script>
	function form_validation() {
		
		var uname=document.myForm.un.value;
		var pwd=document.myForm.pw.value
		if(uname=="")
			{
			 alert("please enter username")
			}
		else if(pwd=="")
			{
			
			}
		
	}
	</script>

   <form action="LoginServlet" name="myForm"  style="padding-top: 58px" onload="disableBackButton()" onsubmit=" return form_validation();" method="post">

		<!-- 	Please enter your username 		
			<input type="text" name="un"/><br>		
		
			Please enter your password
			<input type="text" name="pw"/>
			
			<input type="submit" value="submit"> -->		
<table align="center" border="1" width="25%" bgcolor="#D3D3D3">

<tr>
<td align="center" colspan="2"  style="background-color: black; color: white;" >Login</td>
</tr>
<tr>
<td><input type="text" name="un" style="width: 98% " colspan="2" placeholder="username" minlength="9"  >  </td>
</tr>
<tr>
</tr>
<tr>

<td> <input type="password" name="pw" style="width: 98%" colspan="2" placeholder="password"  pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$" oninvalid="this.setCustomValidity('Invalid Password')" required="required" > </td>
</tr>
<tr></tr>
<tr></tr>
<tr>
<td align="center" colspan="2"><input type="submit" onclick="disableBackButton()" value="Login" ><a href="Signup.jsp">Sign up</a>  </td>
</tr>
</table>	
		
		</form>
		<br>
		<div style="color: red;padding-left: 557px;font-size: larger;">
		<br>
		${message} <br>
		</div>
		
   </div>

</body>
</html>