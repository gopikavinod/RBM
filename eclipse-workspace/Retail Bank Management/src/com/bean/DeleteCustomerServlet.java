package com.bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCustomerServlet
 */

public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ssnid=request.getParameter("customerssnid");
		String custid=request.getParameter("customerid");
		CustomerBean search = new CustomerBean();
		search.setCustid(custid);
		search.setSsnid(ssnid);
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
		
	}

}