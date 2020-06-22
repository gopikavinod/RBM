package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CustomerBean;
import com.dao.CustomerDAO;

/**
 * Servlet implementation class DeleteCustomerServlet
 */

public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("searchButton");
		String action1=request.getParameter("deleteButton");
		System.out.println("action :::::"+action1);
		if("Search".equalsIgnoreCase(action))
		{
		String ssnid=request.getParameter("customerssnid");
		String custid=request.getParameter("customerid");
		CustomerBean search = new CustomerBean();
		search.setCustid(custid);
		search.setSsnid(ssnid);
		search =CustomerDAO.Search(search);
		if(search.isValid())
		{
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

		 request.getRequestDispatcher("deleteCustomer.jsp").forward(request, response);
		}
		else
		{
			 out.println("<script type=\"text/javascript\">");
	          out.println("alert('Error Occured .No Customer id Or SSN ID Found');");
	          out.println("location='deleteCustomer.jsp';");
	          out.println("</script>");
		}
		}
		
		else if("Delete".equalsIgnoreCase(action1))
		{
			CustomerBean deletecustomer = new CustomerBean();
			String ssnid=request.getParameter("customerssnid");
			String custid=request.getParameter("customerid");
			String name=request.getParameter("customername");
			String address=request.getParameter("customeroaddress");
			String age=request.getParameter("customeroage");
			deletecustomer.setCustid(custid);
			deletecustomer.setSsnid(ssnid);
			deletecustomer.setCustname(name);
			deletecustomer.setCustaddress(address);
			deletecustomer.setAge(age);
			System.out.println("id :::"+custid);
			String aa=deletecustomer.getCustid();
			System.out.println("aa:::"+aa);
			deletecustomer =CustomerDAO.deleteCustomer(deletecustomer);
			
			
			
			if(deletecustomer.isValid())
			{
				 out.println("<script type=\"text/javascript\">");
		          out.println("alert('Customer details Deleteds successfully');");
		          out.println("location='deleteCustomer.jsp';");
		          out.println("</script>");
			}
			
			else
			{
				 out.println("<script type=\"text/javascript\">");
		          out.println("alert('Error Occured ');");
		          out.println("location='deleteCustomer.jsp';");
		          out.println("</script>");
		          response.sendRedirect("deleteCustomer.jsp"); //error page 
			}
		}
	}

}