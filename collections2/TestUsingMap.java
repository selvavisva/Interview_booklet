package com.depth.collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestUsingMap {	
	public static void main(String[] args) {	
		Employee e1 = new Employee("3333","CCC","150K",10);
		Employee e2 = new Employee("1111","AAA","100K",8);
		Employee e3 = new Employee("2222","BBB","120K",9);
		Employee e4= new Employee("5555","EEE","160K",12);
		Employee e5 = new Employee("4444","DDD","90K",6);
		
	//	Map<Employee,Employee> map = new HashMap<>();
		TreeMap<Employee,Employee> map = new TreeMap<>();
		map.put(e1,e1);
		map.put(e1,e1);
		map.put(e1,e1);
		map.put(e2,e2);
		map.put(e3,e3);
		map.put(e4,e4);
		map.put(e5,e5);
	
		
		  map.forEach((k,v) -> { System.out.println(v); });
		 

			
			Employee e6 = new Employee("3334","XXX","350K",10);
			System.out.println("\n applied condition");
			System.out.println(map.floorKey(e6));
			
			System.out.println(map.floorEntry(e6));
			
			System.out.println(map.ceilingEntry(e6));
			
			System.out.println("\n--- submap ----");
			System.out.println(map.subMap(e2, e5));
	}
}
