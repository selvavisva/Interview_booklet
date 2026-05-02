package com.depth.cloning;

public class Address implements Cloneable {

	private String fullAddress;

	public Address(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String toString() {
		return fullAddress;
	}
	
	  protected Object clone() throws CloneNotSupportedException{
	  
	  return super.clone(); }
	 
}
