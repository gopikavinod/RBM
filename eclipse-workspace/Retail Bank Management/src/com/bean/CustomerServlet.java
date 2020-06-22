package com.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javafx.scene.control.Alert;

/**
 * Servlet implementation class CustomerServlet
 */

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException {
		try {
			
			CustomerBean customer = new CustomerBean();
			PrintWriter out = response.getWriter();
			System.out.println("customerssnid" +request.getParameter("customerssnid"));
			customer.setSsnid(request.getParameter("customerssnid"));
			customer.setCustid(request.getParameter("customerid"));
			customer.setCustname(request.getParameter("customername"));
			customer.setAge(request.getParameter("customerage"));
			customer.setCustaddress(request.getParameter("customeraddress"));
			customer.setState(request.getParameter("state"));
			customer.setCity(request.getParameter("city"));
			customer =CustomerDAO.createCustomer(customer);
			 if (customer.isValid())
		     {
			        
		          HttpSession session = request.getSession(true);	    
		          session.setAttribute("currentSessionUser",customer);
		          out.println("<script type=\"text/javascript\">");
		          out.println("alert('Customer creation initiated successfully');");
		          out.println("location='userLogged.jsp';");
		          out.println("</script>");
		          
		          //  request.setAttribute("alertMsg", "Customer creation initiated successfully");
//		          RequestDispatcher rd=request.getRequestDispatcher("userlogged.jsp");  
//		          rd.include(request, response);
		        //  response.sendRedirect("userLogged.jsp"); //error page 
		       
		              		
		     }
			        
		     else 
		     {
		    	  out.println("<script type=\"text/javascript\">");
		          out.println("alert('Error Occured ');");
		          out.println("location='userLogged.jsp';");
		          out.println("</script>");
		          response.sendRedirect("userLogged.jsp"); //error page 
		     }
		         
					
		   
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}