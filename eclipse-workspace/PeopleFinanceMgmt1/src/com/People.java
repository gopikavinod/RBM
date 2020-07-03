package com;

public class People {
	private String aadharNumber;
	private String panNumber;
	private String name;
	public People(String aadharNumber, String panNumber, String name, int  monthlyIncome) {
		super();
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.name = name;
		this.monthlyIncome = monthlyIncome;
	}
	private int  monthlyIncome;
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int  getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(int  monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	

}
