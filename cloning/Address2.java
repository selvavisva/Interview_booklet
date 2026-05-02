package com.depth.cloning;

public class Address2  implements Prototype{
	private String fullAddress;

	public Address2(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	 
	public Address2 clone() {		
		Address2 a2 = new Address2(this.fullAddress);
		return a2;		
	}
	
	public String toString() {
		return fullAddress;
	} 
}
