package com.depth.cloning;

public class Employee implements Cloneable{
	
	private String name;
	private int age;
	private String id;
	private Address address;
	
	protected Object clone() throws CloneNotSupportedException{
		Employee cloned = (Employee) super.clone();
		cloned.address = (Address)address.clone();
		return cloned;
	}
	
	public Employee(String name, int age, String id, Address address){
		this.name=name;
		this.age=age;
		this.id=id;
		this.address=address;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		
		return "Employee Details -> name :: "+name+" age :: "+age+" id :: "+id+" address ::"+address.toString();
	}
}
