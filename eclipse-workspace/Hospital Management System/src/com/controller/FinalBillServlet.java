package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.bean.Medicinebean;
import com.bean.PatientBean;
import com.dao.PatientDAO;

public class FinalBillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		String patient_id=request.getParameter("pid");
		if(patient_id!=null)
		{
		PatientBean viewpatient=new PatientBean();
		Medicinebean medicine=new Medicinebean();
		medicine.setPatient_id(Integer.parseInt(patient_id));
		viewpatient.setPatientid(Integer.parseInt(patient_id));
		viewpatient=PatientDAO.searchPatient(viewpatient);
		if(viewpatient.isValid())
		{
			HttpSession session = request.getSession(true);	 
			request.setAttribute("patientid",viewpatient.getPatientid());
			request.setAttribute("name",viewpatient.getPatientname());
			request.setAttribute("age",viewpatient.getAge());
			String doj=viewpatient.getDoj().substring(0, 10);
			LocalDate date=LocalDate.parse(doj);
			request.setAttribute("doj",doj);
			request.setAttribute("bedtype",viewpatient.getRoomtype());
			request.setAttribute("address",viewpatient.getAddress());
			
			
			 DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
			 DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		     Date dateobj = new Date();
		     LocalDate date1=LocalDate.parse(df1.format(dateobj));
		     request.setAttribute("dischargedate",df.format(dateobj));
		     //NO OF DAYS Calculation
		     long noOfDaysBetween =ChronoUnit.DAYS.between(date, date1);
		     request.setAttribute("noOfDaysBetween",noOfDaysBetween);
		     
		     //Room charge Calculation
		     long roomcharge=0;
		     if(viewpatient.getRoomtype().equalsIgnoreCase("General"))
		     {
		    	  roomcharge=2000*noOfDaysBetween;
		     }
		     else if(viewpatient.getRoomtype().equalsIgnoreCase("Semi"))
		     {
		    	 roomcharge=4000*noOfDaysBetween;
		     }
		     else if(viewpatient.getRoomtype().equalsIgnoreCase("Single"))
		     {
		    	 roomcharge=8000*noOfDaysBetween;
		     }
		     request.setAttribute("roomcharge",roomcharge);
			
			//Pharmacy Charges calculation
			   double amount=0.00;
			   amount=medicine.getRate()*medicine.getQuantity();
			   request.setAttribute("amount", amount);
		//session.setAttribute("message1", "Patient Found");
	request.getRequestDispatcher("/FinalBill.jsp").forward(request, response);
		}
		else
		{
			HttpSession session = request.getSession(true);	 
			//session.setAttribute("message1", "Patient Id Doesnot Exist");
			request.getRequestDispatcher("/FinalBill.jsp").forward(request, response);
	         // response.sendRedirect("updateCustomer.jsp"); //error page 
		}
		
	if(action!=null)
	{
		viewpatient=PatientDAO.updateStatus(viewpatient);
		if(viewpatient.isValid())
		{
			HttpSession session = request.getSession(true);	 
			session.setAttribute("message1", "Settlement Successfull");
			request.getRequestDispatcher("/FinalBill.jsp").forward(request, response);
		}
		else
		{
			HttpSession session = request.getSession(true);	 
			session.setAttribute("message1", "Error");
			request.getRequestDispatcher("/FinalBill.jsp").forward(request, response);
		}
	}
	
		//viewpatient=PatientDAO.finalbill(viewpatient);
	   
		}
	}

}
