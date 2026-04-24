package com.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(4444);
		e1.setEmpName("Guru");
		
		Employee e2 = new Employee();
		e2.setEmpId(2222);
		e2.setEmpName("Ram");
		
		Employee e3 = new Employee();
		e3.setEmpId(3333);
		e3.setEmpName("Aakash");
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Collections.sort(empList, (one,two)->one.getEmpName().compareTo(two.getEmpName()));
		
		System.out.println(empList);	
		
	}

}
