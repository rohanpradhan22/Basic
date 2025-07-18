package com.DTO;

public class Patient 
{
	private int P_id;
	private String Name;
	private String Address;
	private long phone;
	private String Doctor;
	
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDoctor() {
		return Doctor;
	}
	public void setDoctor(String doctor) {
		Doctor = doctor;
	}
	
	
	

}
