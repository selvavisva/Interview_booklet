package com.depth.collections2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.getYrsExp(), o2.getYrsExp());
		//return (o1.getEmpName()).compareTo(o2.getEmpName());
	}
}
