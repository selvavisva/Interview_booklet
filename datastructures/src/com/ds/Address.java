package com.ds;

public class Address {

	private String street;
	private int houseNo;
	private String area;
	private String city;
	private int pincode;
	
	public Address(String street, int houseNo, String area, String city, int pincode) {		
		this.street = street;
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address(Address other) {
		this.street = other.street;
		this.houseNo = other.houseNo;
		this.area = other.area;
		this.city = other.city;
		this.pincode = other.pincode;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
