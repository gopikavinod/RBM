package com.bean;

public class Medicinebean {
private int patient_id;
	public int getPatient_id() {
	return patient_id;
}
public void setPatient_id(int patient_id) {
	this.patient_id = patient_id;
}

	private int medicine_id;
	private String medicine_name;
	private double rate;
	private int quantity;
	boolean valid;
	public int getMedicine_id() {
		return medicine_id;
	}
	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isValid() {
	       return valid;
		}

	    public void setValid(boolean newValid) {
	       valid = newValid;
		}	
}
