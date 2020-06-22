package com.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateCustomerServlete
 */
public class UpdateCustomerServlete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException{
			try {
				
			System.out.println("helloooooo");
			String custid=request.getParameter("customerid");
			String ssnId=request.getParameter("customerssnid");
			System.out.println("custid:::"+custid);
			CustomerBean search = new CustomerBean();
			search.setCustid(custid);
			search.setSsnid(ssnId);
			search =CustomerDAO.Search(search);
			String name=search.getCustname();
			String address=search.getCustaddress();
			String age=search.getAge();
			String customerid=search.getCustid();
			String ssn=search.getSsnid();
			System.out.println("customerid::"+customerid);
			request.setAttribute("name",name);
			request.setAttribute("age",age);
			request.setAttribute("address",address);
			request.setAttribute("custid",customerid);
			request.setAttribute("ssn",ssn);
			//String a=request.setAttribute(address,"address");
	
			 request.getRequestDispatcher("updateCustomer.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException{
		
		try {
			String action=request.getParameter("updateButton");
			if("update".equalsIgnoreCase(action))
			{
			System.out.println("action:::"+action);
			String ssnid=request.getParameter("customerssnid");
			String custid=request.getParameter("customerid");
			String newname=request.getParameter("newcustname");
			String newaddress=request.getParameter("customernaddress");
			String newage=request.getParameter("customernage");
			
			System.out.println("new name"+newname);
			CustomerBean updateCustomer = new CustomerBean();
			PrintWriter out = response.getWriter();
			updateCustomer.setSsnid(ssnid);
			updateCustomer.setCustid(custid);
			updateCustomer.setCustname(newname);
			updateCustomer.setCustaddress(newaddress);
			updateCustomer.setAge(newage);
			updateCustomer =CustomerDAO.updateCustomer(updateCustomer);
			if(updateCustomer.isValid())
			{
				 out.println("<script type=\"text/javascript\">");
		          out.println("alert('Customer details Updated successfully');");
		          out.println("location='updateCustomer.jsp';");
		          out.println("</script>");
			}
			
			else
			{
				 out.println("<script type=\"text/javascript\">");
		          out.println("alert('Error Occured ');");
		          out.println("location='updateCustomer.jsp';");
		          out.println("</script>");
		          response.sendRedirect("updateCustomer.jsp"); //error page 
			}
			}
			else
			{
				System.out.println("hello");
			}
		          
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}