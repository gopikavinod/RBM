package com.bean;

import java.util.Date;

public class PatientBean {
	private int patientssnid;
	private int patientid;
	private String patientname;
	private String address;
	private int age;
	private String doj;
	private String roomtype;
	private String state;
	private String city;
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean valid;
	public int getPatientssnid() {
		return patientssnid;
	}

	public void setPatientssnid(int patientssnid) {
		this.patientssnid = patientssnid;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public boolean isValid() {
	       return valid;
		}

	    public void setValid(boolean newValid) {
	       valid = newValid;
		}	
}
