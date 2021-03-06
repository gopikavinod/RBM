package com.dao;

import java.text.*;
import java.util.*;

import com.bean.UserBean;
import com.connection.ConnectionManager;

import java.sql.*;

public class UserDAO 	
{
   static Connection currentCon = null;
   static ResultSet rs = null;  
	
	
	
   public static UserBean login(UserBean bean) {
	
      //preparing some objects for connection 
      Statement stmt = null;    
      PreparedStatement pstmt=null;
      String username = bean.getUsername();    
      String password = bean.getPassword();   
	    
      String searchQuery =
            "select * from userstore where username='"
                     + username
                     + "' AND password='"
                     + password
                     + "'";
	    
   // "System.out.println" prints in the console; Normally used to trace the process
   System.out.println("Your user name is " + username);          
   System.out.println("Your password is " + password);
   System.out.println("Query: "+searchQuery);
	    
   try 
   {
      //connect to DB 
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      rs = stmt.executeQuery(searchQuery);	        
      boolean more = rs.next();
	    System.out.println(more);   
      // if user does not exist set the isValid variable to false
      if (!more) 
      {
         System.out.println("Sorry, you are not a registered user! Please sign up first");
         bean.setValid(false);
      } 
	        
      //if user exists set the isValid variable to true
      else if (more) 
      {
         String Name = rs.getString("Name");
         System.out.println("firstname"+Name);
         String usertype=rs.getString("user_type");
         String last_logged=rs.getString("last_logged");
         String logged_status=rs.getString("logged_status");
	     	
         System.out.println("Welcome " + Name);
         bean.setFirstName(Name);
         bean.setUsertype(usertype);
         bean.setLastlogged(last_logged);
         bean.setLoggedstatus(Integer.parseInt( logged_status));
         bean.setValid(true);
         
         String updateQuery="update userstore set last_logged=?,logged_status=? where username=?";
         try {
         pstmt=currentCon.prepareStatement(updateQuery);
         pstmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
         pstmt.setInt(2, 0);
         pstmt.setString(3,bean.getUsername());
         System.out.println("lastlogged ::"+new Timestamp(System.currentTimeMillis()));
         System.out.println("username ::"+bean.getUsername());
         System.out.println("update ::"+updateQuery);
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
         }
         catch (Exception ex) 
         {
            System.out.println(" An Exception has occurred! " + ex);
         } 
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
  

return bean;
	
   }	
}