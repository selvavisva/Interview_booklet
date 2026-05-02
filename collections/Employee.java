package com.depth.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class Employee {
	
	private final String empName;
	
	private final int empId;
	
	private final Date joiningDate;
	
	private final Address empAddress;
	
	private final List<String> empSkills;
	
	private final int[] ratings;
	
	private Employee(String empName, int empId, Date joiningDate, Address empAddress, 
			List<String> skills, int[] ratings) {
		
		this.empName=empName;
		
		this.empId=empId;
		
		this.joiningDate = new Date(joiningDate.getTime());
		
		this.empAddress = new Address(empAddress);
		
		this.empSkills = Collections.unmodifiableList(new ArrayList<>(skills));
		
		this.ratings = Arrays.copyOf(ratings, ratings.length);
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public Date getJoiningDate() {
		return new Date(joiningDate.getTime());
	}

	public Address getEmpAddress() {
		return new Address(empAddress);
	}

	public List<String> getEmpSkills() {
		return empSkills;
	}
	
	public int[] getRatings() {
		return Arrays.copyOf(ratings,ratings.length);
	}
	
	public int hashCode() {
		return Objects.hash(empId);
	}
	
	public boolean equals(Object obj) {		
		if(this==obj) return true;
		if(!(obj instanceof Employee e)) return false;
		return empId==e.empId;
	}
	
	public String toString() {
		return "Employee -> empId :: "+empId+" empName :: "+empName;
	}

}
