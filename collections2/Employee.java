package com.depth.collections2;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable, Cloneable, Comparable<Employee>{

	private String empId;
	private String empName;
	private int yrsExp;
	private String salary;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getYrsExp() {
		return yrsExp;
	}
	public void setYrsExp(int yrsExp) {
		this.yrsExp = yrsExp;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public Employee() {}
	
	public Employee(String empId, String empName, String salary, int yrsExp) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.yrsExp=yrsExp;
	}
	
	public boolean equals(Object other) {
		if(this==other) return true;
		if(!(other instanceof Employee)) return false;
		return this.empId.equals(((Employee)other).empId);
	}
	
	public int hashCode() {
		return Objects.hash(empId);
	}
	
	public int compareTo(Employee other) {
		return this.empId.compareTo(other.empId);
	}
	
	public String toString() {
		return "Employee --> empId :: "+empId+ " empName :: "+empName+" salary :: "+salary+" yrsOfExp :: "+yrsExp;
	}
}
