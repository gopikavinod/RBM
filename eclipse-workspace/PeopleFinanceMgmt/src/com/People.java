package com;

public class People {
	private int aadharNumber;
	private int panNumber;
	private String name;
	public People(int aadharNumber, int panNumber, String name, double  monthlyIncome) {
		super();
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.name = name;
		this.monthlyIncome = monthlyIncome;
	}
	private double  monthlyIncome;
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public int getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double  getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(double  monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	

}
