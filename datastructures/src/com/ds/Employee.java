package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private  String empName;
	
	private  int empId;
	
	private  Date joiningDate;
	
	private  Address empAddress;
	
	private  List<String> empSkills;
	
	private  int[] ratings;

	public Employee() {
		
	}
	public Employee(int empId) {
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public List<String> getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(List<String> empSkills) {
		this.empSkills = empSkills;
	}

	public int[] getRatings() {
		return ratings;
	}

	public void setRatings(int[] ratings) {
		this.ratings = ratings;
	}

	public int hashcode() {
		return Objects.hash(empId);
	}
	
	public boolean equals(Object o) {	
		if(this==o) return true;
		if(! (o instanceof Employee)) return false;
		Employee other = (Employee)o;
		return (other.empId==empId);
	}

	@Override
	public int compareTo(Employee o) {		
		return Integer.compare(empId,o.empId);
	}
	
	public String toString() {
		return "Employee -> empId :: "+empId;
	}

}
