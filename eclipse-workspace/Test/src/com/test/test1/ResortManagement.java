package com.test.test1;

import java.util.Scanner;

public class ResortManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resort [] r =new Resort[3];
		Scanner sn =new Scanner(System.in);
		for(int i=0;i<r.length;i++)
		{
			try
			{
				//System.out.println("enter room no");
			int rno=sn.nextInt();
			//System.out.println("enter name");
			sn.next();
			String name=sn.nextLine();
			//System.out.println("enter charge");
			int charge=sn.nextInt();
			sn.next();
		//	System.out.println("enter Days");
			int days=sn.nextInt();
			//sn.next();
			r[i]=new Resort(rno, name, charge, days);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		Integer[] f = calculateCharge(r);
		for(Integer g : f) {
		System.out.println(g);
		}

	}

	private static Integer[] calculateCharge(Resort[] r) {
				// TODO Auto-generated method stub
		int amount=0;
		for(int i=0;i<r.length;i++)
		{
			 amount=r[i].getCharge()*r[i].getDays();
			if(amount>11000 )
			{
				amount=(int) (1.028*r[i].getCharge()*r[i].getDays());
			}
		}
		Integer[] j = new Integer[amount];
		
		return j;
	}

}
class Resort
{
	//Room number, Name, Charges, Days.
	int roomNumbr;
	String name;
	int charge;
	int days;
	public Resort(int roomNumbr, String name, int charge, int days) {
		super();
		this.roomNumbr = roomNumbr;
		this.name = name;
		this.charge = charge;
		this.days = days;
	}
	public int getRoomNumbr() {
		return roomNumbr;
	}
	public void setRoomNumbr(int roomNumbr) {
		this.roomNumbr = roomNumbr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
}
