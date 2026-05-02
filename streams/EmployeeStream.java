package com.depth.streams;

public class EmployeeStream {
	private String name;
	private int salary;
	private int age;
	private String location;
	
	EmployeeStream(String name, int salary, int age, String location){
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.location=location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "Name :: "+name+ ", "+
				"Salary :: "+salary + ", "+
				"Age :: "+age + ", "+
				"Location :: "+location;
	}
}
