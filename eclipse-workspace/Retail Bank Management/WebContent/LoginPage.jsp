<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Login Page</title>
	</head>

	<body >
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
	
		<form action="LoginServlet" name="myForm"  style="height: 100%"  onsubmit=" return form_validation();" enctype="multipart/form-data">

		<!-- 	Please enter your username 		
			<input type="text" name="un"/><br>		
		
			Please enter your password
			<input type="text" name="pw"/>
			
			<input type="submit" value="submit"> -->		
<table align="center" border="1" width="30%" bgcolor="#D3D3D3">

<tr>
<td align="center" colspan="2"  style="background-color: black; color: white;" >Login</td>
</tr>
<tr>
<td><input type="text" name="un" style="width: 98% " colspan="2" placeholder="username" minlength="8"  >  </td>
</tr>
<tr>
</tr>
<tr>

<td> <input type="password" name="pw" style="width: 98%" colspan="2" placeholder="password"  pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$" oninvalid="this.setCustomValidity('Invalid Password')" required="required" > </td>
</tr>
<tr></tr>
<tr></tr>
<tr>
<td align="center" colspan="2"><input type="submit" value="Login"><a href="Signup.jsp">Sign up</a>  </td>
</tr>
</table>	
		
		</form>
	</body>
</html>