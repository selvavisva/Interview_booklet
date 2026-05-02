package com.depth.cloning;

public class Employee2 implements Prototype{
	
	private String name;
	private int age;
	private Address2 address2;
	
	public Employee2(String name, int age, Address2 address2) {
		this.name=name;
		this.age=age;
		this.address2=address2;
	}
	
	public Employee2 clone() {		
		Employee2 e = new Employee2(this.name,this.age,this.address2);
		return e;
	}
	
	public String toString() {
		return "Employee -> empName :: "+name+" age :: "+age;
		
	}
}
