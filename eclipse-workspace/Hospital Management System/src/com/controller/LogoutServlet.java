package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session = request.getSession(false);
//    	System.out.println("currentSessionUser="+session.getAttribute("currentSessionUser"));
//    	if(session != null){
//    		session.invalidate();
//    	}
//    	response.sendRedirect("LoginPage.jsp");
		System.out.println("heloooo");
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath()+"/Login.jsp");
//		 RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//         rd.forward(request, response);
	}

}
