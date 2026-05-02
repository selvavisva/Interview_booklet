
package com.depth.collections2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestUsingSet {	
	public static void main(String[] args) {
		Employee e1 = new Employee("3333","CCC","150K",10);
		Employee e2 = new Employee("1111","AAA","100K",8);
		Employee e3 = new Employee("2222","BBB","120K",9);
		Employee e4= new Employee("5555","EEE","160K",12);
		Employee e5 = new Employee("4444","DDD","90K",6);
		
		Set<Employee> empSet = new HashSet<>();
		//Set<Employee> empSet = new TreeSet<>(); 
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.add(e5);
		for(Employee e:empSet) {
			System.out.println(e);
		}
	}
}
