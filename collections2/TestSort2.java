package com.depth.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSort2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("3333", "CCC", "150K", 10);
		Employee e2 = new Employee("1111", "AAA", "100K", 8);
		Employee e3 = new Employee("2222", "BBB", "120K", 9);
		Employee e4 = new Employee("5555", "EEE", "160K", 12);
		Employee e5 = new Employee("4444", "DDD", "90K", 6);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		for (Employee e : empList) {
			System.out.println(e);
		}
		Collections.sort(empList);
		System.out.println("\n After sorting");
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("\n After salary sorting");
		SalaryComparator comp = new SalaryComparator();
		Collections.sort(empList, comp);

		Collections.sort(empList, (o1, o2) -> Integer.compare(o2.getYrsExp(), o1.getYrsExp()));
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("\n After emp name sorting");
		
		  Collections.sort(empList, (o1,o2) -> o1.getEmpName().compareTo(o2.getEmpName())); 
		  Collections.reverse(empList);
		  
		  for(Employee e:empList) 
		  {
			  System.out.println(e); 
		  }
		  
			
			  empList.sort((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
			  empList.sort((o1, o2) -> o1.compareTo(o2)); for (Employee e : empList) {
			  System.out.println(e); }
			  
			  TreeSet<Employee> treeSet = new TreeSet<>((emp1,emp2) ->
			  emp1.getEmpName().compareTo(emp2.getEmpName()));
			 
	}

}
