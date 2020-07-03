package com;



import java.util.List;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.context.support.FileSystemXmlApplicationContext;  

public class TesterClass{  
public static void main(String[] args){  
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
PeopleMgmtDAO peoplemgtdao = context.getBean("peoplemgmtDaoBean",PeopleMgmtDAO.class);  
        
peoplemgtdao.addPeople("1234 5678 9891", "XYZPM12345", "John", 330000);
peoplemgtdao.addPeople("9434 9867 1253", "AXYDK10315", "Carter", 350000);
System.out.println("Accounts created");  
        
peoplemgtdao.updateNameBasedOnAadharNumber("Anu", "1234 5678 9891");  
System.out.println("Account balance updated");  
        
        
List<People> people = peoplemgtdao.fetchAllInfo(); 
for (int i = 0; i < people.size(); i++) { 
	People pep = people.get(i); 
	System.out.println("Person1 :");
 System.out.println("AadharNumber:"+pep.getAadharNumber() ); 
 System.out.println("PANNumber :"+pep.getPanNumber() );
 System.out.println("Name:"+pep.getName() ); 
 System.out.println("Monthly Income:"+pep.getMonthlyIncome() ); 
}
        
peoplemgtdao.deletePeopleInfo("1234 5678 9891");
System.out.println("Account deleted");  
        
}  
}  


