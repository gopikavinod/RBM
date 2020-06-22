package com.dao;
import java.sql.*;

import javax.servlet.http.HttpSession;

import com.bean.CustomerBean;
import com.connection.ConnectionManager;

import oracle.net.ns.SessionAtts;

public class CustomerDAO {
	 static Connection currentCon = null;
	   static ResultSet rs = null;  
	   
	   public static CustomerBean createCustomer(CustomerBean bean) {

	   
	   
		  // Statement stmt = null; 
		   currentCon=ConnectionManager.getConnection();
		   		PreparedStatement pstmt=null;
	   		String ssid=bean.getSsnid();
	   		String custid=bean.getCustid();
		   String custname=bean.getCustname();
		   String address=bean.getCustaddress();
		   String age=bean.getAge();
		   String state=bean.getState();
		   String  city=bean.getCity();
		   
		   String insertquery="insert into tbl_customer (ws_ssn,ws_cust_id,ws_name,ws_adrs,ws_age) values(?,?,?,?,?)";
		   try {
			   pstmt=currentCon.prepareStatement(insertquery);
			pstmt.setInt(1,Integer.parseInt(ssid) );
			pstmt.setInt(2,Integer.parseInt( custid));
			pstmt.setString(3, custname);
			pstmt.setString(4, address);
			pstmt.setInt(5, Integer.parseInt(age));
			int i=pstmt.executeUpdate();  
			
			if(i>0)
			{
				System.out.println("Record Inserted Successfully");
				
				bean.setValid(true);
			}
			else
			{
				System.out.println("no records inserted");
			}
			//pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   if (pstmt != null) {
		         try {
		        	 pstmt.close();
		         } catch (Exception e) {}
		         pstmt = null;
		         }
			
		      if (currentCon != null) {
		         try {
		            currentCon.close();
		         } catch (Exception e) {
		         }

		         currentCon = null;
		      }
		   return bean;
	   }
	   
	   public static CustomerBean Search(CustomerBean bean) {
		   
		   currentCon=ConnectionManager.getConnection();
		   Statement stmt = null;    
		  String user=bean.getCustid();
		  String ssid=bean.getSsnid();
		  String selQuery=null;
		  if(user!=null && user!="")
		  {
			   selQuery="select * from tbl_customer where ws_cust_id='"+user+"'  ";
		  }
		  else if(ssid!=null && ssid!="")
		  {
			   selQuery="select * from tbl_customer where  ws_ssn ='"+ssid+"' ";
		  }
		  
		 
		  try {
			  System.out.println(selQuery);
			  currentCon = ConnectionManager.getConnection();
		      stmt=currentCon.createStatement();
			  rs=stmt.executeQuery(selQuery);
			  System.out.println(rs);
				boolean result=rs.next();
			System.out.println(result);
			if(result)
			{
				//System.out.println("hellooo1111");
				String name=rs.getString("ws_name");
				String address=rs.getString("ws_adrs");
				String age=rs.getString("ws_age");
				String ssnid=rs.getString("ws_ssn");
				String custid=rs.getString("ws_cust_id");
				System.out.println("quesry cusrtid::"+custid);
				System.out.println("query::"+name);
				bean.setCustname(name);
				bean.setCustaddress(address);
				bean.setAge(age);
				bean.setSsnid(ssnid);
				bean.setCustid(custid);
				String s=bean.getCustid();
				System.out.println("s :::"+s);
				//System.out.println(custid);
				bean.setValid(true);
			}
			else
			{
				bean.setValid(false);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   return bean;
	   }
	   
	   public static CustomerBean updateCustomer(CustomerBean bean) {
		   
		   try {
			   currentCon=ConnectionManager.getConnection();
			   PreparedStatement pstmt=null;
			   String updateQuery=null;
			   String custid=bean.getCustid();
			   String ssid=bean.getSsnid();
			   String newname=bean.getCustname();
			   String newaddress=bean.getCustaddress();
			   String newage=bean.getAge();
			   System.out.println("custid ::"+custid);
			   if(custid!=null && custid!="")
			   {
				   updateQuery="Update tbl_customer set ws_name=?,ws_adrs=?,ws_age=? where ws_cust_id='"+custid+"'";
				   
			   }
			   else if(ssid!=null && ssid!="")
			   {
				   updateQuery="Update tbl_customer set ws_name=?,ws_adrs=?,ws_age=? where ws_ssn='"+ssid+"'";
			   }
			   System.out.println("updatequery::"+updateQuery);
			   System.out.println("newname"+newname);
			   System.out.println("newaddress"+newaddress);
			   System.out.println("newage"+newage);
			   pstmt=currentCon.prepareStatement(updateQuery);
			   pstmt.setString(1,newname);
			   pstmt.setString(2,newaddress);
			   pstmt.setInt(3, Integer.parseInt(newage));
			  int i= pstmt.executeUpdate();
				if(i>0)
				{
					System.out.println("Record Updated Successfully");
					
					bean.setValid(true);
				}
				else
				{
					System.out.println("no records updated");
				}
			  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	   
		   return bean;
	   }
	   
	   public static CustomerBean deleteCustomer(CustomerBean bean) {
		   try {
		   currentCon=ConnectionManager.getConnection();
		   PreparedStatement pstmt=null;
		   String custId=bean.getCustid();
		   String ssnId=bean.getSsnid();
		   String delquery="";
		   System.out.println("Custid ::"+custId);
		   if(custId!=null && custId!="")
		   {
			   delquery="Delete from tbl_customer where ws_cust_id='"+custId+"' ";
		   }
		   else if(ssnId!=null && ssnId!="")
		   {
			   delquery="Delete from tbl_customer where ws_ssn='"+ssnId+"' ";
		   }
		   
		System.out.println(delquery);
		 pstmt=currentCon.prepareStatement(delquery);
		   int i = pstmt.executeUpdate();
		   if(i>0)
			{
				System.out.println("Record Deleted Successfully");
				
				bean.setValid(true);
			}
			else
			{
				System.out.println("no records deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		   return bean;
	   }
	   
	   
	   
	   }

