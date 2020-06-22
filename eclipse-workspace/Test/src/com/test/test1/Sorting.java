package com.test.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Medicine [] med =new Medicine [4];
		Scanner sn =new Scanner(System.in);
		for (int i=0;i<med.length;i++)
		{
			
			String name= sn.nextLine();
			String batch=sn.nextLine();
			String disease =sn.nextLine();
			int price=sn.nextInt();
			System.out.println("Price ::"+price);
			sn.nextLine();
			med[i]=new Medicine(name, batch, disease, price);
			System.out.println("Array med ::"+med[i]);
		}
		String e = sn.nextLine();
		Integer[] f = sortAccordingtoPrices(med,e);
		for(Integer g : f) {
		System.out.println(g);
		}
	
	}

	private static Integer[] sortAccordingtoPrices(Medicine[] med, String e) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=0;i<med.length;i++)
		{
			if(med[i].getDisease().equalsIgnoreCase(e))
			{
				count++;
			}
		}
		Integer[] j = new Integer[count];
		int k = 0;
		for(int i=0;i<med.length;i++) {
			if(med[i].getDisease().equalsIgnoreCase(e))
			{
				j[k++]=med[i].getPrice();
			}
			Arrays.sort(j);
		}
		return j;
	}


}

/*
 * Sort the medicines according to Medicine prices with Respective to the
 * disease
 * 
 * INPUT : dolo650 batch1 fever 100 dolo990 batch2 headache 101 paracetemol
 * batch3 bodypains 102 almox500 batch4 fever 103 fever
 */