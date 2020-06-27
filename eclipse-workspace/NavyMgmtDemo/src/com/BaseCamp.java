package com;

import java.util.Scanner;
import com.CustomIdGenerator;
public class BaseCamp {
	
	public static void main(String args[], int CustomIdGenerator)
	{
		BaseCampclass[] basecaamp=new BaseCampclass[1];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<basecaamp.length;i++)
		{
			basecaamp[i]=new BaseCampclass(CustomIdGenerator, sc.next(),sc.next());
		}
		
		
	}
	
	
}
class BaseCampclass
{
	private int baseCampId;
	private String baseCampName,baseCampLocation;
	public int getBaseCampId() {
		return baseCampId;
	}
	public void setBaseCampId(int baseCampId) {
		this.baseCampId = baseCampId;
	}
	public String getBaseCampName() {
		return baseCampName;
	}
	public void setBaseCampName(String baseCampName) {
		this.baseCampName = baseCampName;
	}
	public String getBaseCampLocation() {
		return baseCampLocation;
	}
	public void setBaseCampLocation(String baseCampLocation) {
		this.baseCampLocation = baseCampLocation;
	}
	public BaseCampclass(int baseCampId, String baseCampName, String baseCampLocation) {
		super();
		this.baseCampId = baseCampId;
		this.baseCampName = baseCampName;
		this.baseCampLocation = baseCampLocation;
	}

}
