package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.dao.UserDAO;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {


public void doPost(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {
	
try
{	    

     UserBean user = new UserBean();
     user.setUserName(request.getParameter("un"));
     user.setPassword(request.getParameter("pw"));
     
     

     user = UserDAO.login(user);
		/*
		 * String nextJSP = "/RegisterPatient.jsp"; RequestDispatcher dispatcher =
		 * getServletContext().getRequestDispatcher(nextJSP);
		 * dispatcher.forward(request,response);
		 */
//     if (user.isValid())
//     {
//	        
//          HttpSession session = request.getSession(true);	    
//          session.setAttribute("currentSessionUser",user); 
//          if(user.getUsername()!="")
//          {
//        	  response.sendRedirect("RegisterPatient.jsp"); //logged-in page 
//          }
//          else
//          {
//        	  response.sendRedirect("Login.jsp");
//          }
//              		
//     }
//	        
//     else 
//          response.sendRedirect("Login.jsp"); //error page 
     
     
  // Object HttpSession;
if (user.isValid())
   {
	        
        HttpSession session = request.getSession(true);	    
        session.setAttribute("currentSessionUser",user); 
        session.setAttribute("un", user);
        if(user.getUsername()!="" && user.getUsertype().equalsIgnoreCase("admission desk executive"))
        {
      	 // response.sendRedirect("RegisterPatient.jsp"); //logged-in page 
        	request.getRequestDispatcher("/RegisterPatient.jsp").forward(request, response);
        }
        else if(user.getUsername()!="" && user.getUsertype().equalsIgnoreCase("pharmasist"))
        {
        	
        }
        else if(user.getUsername()!="" && user.getUsertype().equalsIgnoreCase("Diagnostic services executive"))
        {
        	
        }
        else
        {
        	session.setAttribute("message", "Invalid Username or Password");
      	  //response.sendRedirect("Login.jsp");
        	request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
            		
   }
	        
   else 
   {
	   HttpSession sess=request.getSession();   
	   sess.setAttribute("message", "Invalid Username or Password");
	   request.getRequestDispatcher("/Login.jsp").forward(request, response);
   }		
} 
		
		
catch (Throwable theException) 	    
{
     System.out.println(theException); 
}
       }
	}