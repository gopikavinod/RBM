package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.PatientBean;
import com.dao.PatientDAO;

/**
 * Servlet implementation class DiagnosistServlet
 */
public class DiagnosistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String patient_id=request.getParameter("pid");
		if(patient_id!=null)
		{
			PatientBean diagnosis=new PatientBean();
			diagnosis.setPatientid(Integer.parseInt(patient_id));
			diagnosis=PatientDAO.searchPatient(diagnosis);
			if(diagnosis.isValid())
			{
				HttpSession session = request.getSession(true);	 
				request.setAttribute("patientid",diagnosis.getPatientid());
				request.setAttribute("name",diagnosis.getPatientname());
				request.setAttribute("age",diagnosis.getAge());
				String doj=diagnosis.getDoj().substring(0, 10);
				LocalDate date=LocalDate.parse(doj);
				request.setAttribute("doj",doj);
				request.setAttribute("bedtype",diagnosis.getRoomtype());
				request.setAttribute("address",diagnosis.getAddress());
				
				
				 DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
				 DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
			     Date dateobj = new Date();
			     LocalDate date1=LocalDate.parse(df1.format(dateobj));
			     request.setAttribute("dischargedate",df.format(dateobj));
			     request.getRequestDispatcher("/Diagonstics.jsp").forward(request, response);
			}
			else
			{
				HttpSession session = request.getSession(true);	 
				//session.setAttribute("message1", "Patient Id Doesnot Exist");
				request.getRequestDispatcher("/Diagonstics.jsp").forward(request, response);
			}
		}
	}

}
