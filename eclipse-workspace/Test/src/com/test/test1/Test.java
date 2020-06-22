package com.test.test1;

import java.util.Arrays;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
Medicine[] m = new Medicine[4];
for(int i =0;i<m.length;i++) {
String a = sc.nextLine();
String b = sc.nextLine();
String c = sc.nextLine();
int d = sc1.nextInt();
sc.nextLine();
m[i] = new Medicine(a,b,c,d);


}
String e = sc.nextLine();
Integer[] f = sortAccordingtoPrices(m,e);
for(Integer g : f) {
System.out.println(g);
}
}
public static Integer[] sortAccordingtoPrices(Medicine[] m,
String e) {
int count =0 ;
for(int i=0;i<m.length;i++) {
if(m[i].getDisease().equals(e)) {
count++;
}
}
Integer[] j = new Integer[count];
int k = 0;
for(int i=0;i<m.length;i++) {
if(m[i].getDisease().equalsIgnoreCase(e)) {
j[k++] = m[i].getPrice();
Arrays.sort(j);
}
}
return j;
}
}
class Medicine
{
	private String MedicineName;
	private String  batch;
	private String disease;
	private int price;
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Medicine(String medicineName, String batch, String disease, int price) {
		super();
		MedicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	
}














