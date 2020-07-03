package com;
import java.util.List;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;  
@Transactional  
public class PeopleMgmtDAO{  
    JpaTemplate template;  
  
    public void setTemplate(JpaTemplate template) {  
        this.template = template;  
    }  
    public void addPeople(String adharNumber,String panNumber,String name,int monthlyincome){  
    	
        People people = new People(adharNumber,panNumber,name,monthlyincome);  
        template.persist(people);  
    }  
    public void updateNameBasedOnAadharNumber(String name, String aadharNumber){  
    	People people = template.find(People.class, aadharNumber);  
        if(people != null){  
        	people.setName(name);  
        }  
        template.merge(people);  
    }  
    public void deletePeopleInfo(String aadharNumber ){  
    	People people = template.find(People.class, aadharNumber);  
        if(people != null)  
            template.remove(people);  
    }  
    public List<People> fetchAllInfo(){  
        List<People> people =template.find("select people from People people");  
        return people;  
    }  
    
    public List<People>fetchInfo(){
    	List<People> people=template.find("select people from People  people like %M ");
    	return people;
    }
}  
