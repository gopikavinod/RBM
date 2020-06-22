package com.bean;

import java.sql.*;
import java.util.*;
import oracle.jdbc.driver.*;



public class ConnectionManager {

   static Connection con;
   static String url;
         
   public static Connection getConnection()
   {
     
      try
      {
    	  String Datasource="@localhost:1521:xe";
    	  String username="system";
    	  String password="system";
    	  //jdbc:oracle:thin:@localhost:1521:xe
         String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
         // assuming "DataSource" is your DataSource name

       
         
         try
         {            	
        	  Class.forName("oracle.jdbc.driver.OracleDriver");
        	  System.out.println("url ::"+url);
            con = DriverManager.getConnection(url,username,password); 
             								
         // assuming your SQL Server's	username is "username"               
         // and password is "password"
              
         }
         
         catch (SQLException ex)
         {
            ex.printStackTrace();
         }
      }

      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }

   return con;
}
}
