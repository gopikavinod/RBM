package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.PatientBean;
import com.dao.PatientDAO;

/**
 * Servlet implementation class SearchPatientServlet
 */
public class SearchPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String patientid=request.getParameter("patientid");
		PatientBean search=new PatientBean();
		search.setPatientid(Integer.parseInt(patientid));
		search=PatientDAO.searchPatient(search);
		if(search.isValid())
		{
			HttpSession session = request.getSession(true);	 
			request.setAttribute("patientid",search.getPatientid());
			request.setAttribute("name",search.getPatientname());
			request.setAttribute("age",search.getAge());
			String doj=search.getDoj().substring(0, 10);
			request.setAttribute("doj",doj);
			request.setAttribute("bedtype",search.getRoomtype());
			request.setAttribute("address",search.getAddress());
			request.setAttribute("state",search.getState());
			request.setAttribute("city",search.getCity());
			
		session.setAttribute("message1", "Patient Found");
	request.getRequestDispatcher("/SearchPatient.jsp").forward(request, response);
		}
		else
		{
			HttpSession session = request.getSession(true);	 
			session.setAttribute("message1", "Patient Id Doesnot Exist");
			request.getRequestDispatcher("/SearchPatient.jsp").forward(request, response);
	         // response.sendRedirect("updateCustomer.jsp"); //error page 
		}
	}

}
