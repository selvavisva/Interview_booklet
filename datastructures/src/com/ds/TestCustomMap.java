package com.ds;

public class TestCustomMap {

	public static void main(String[] args) {
		CustomHashMap map = new CustomHashMap<>();
		
		map.put(10, "value of 10");
		map.put(100, "value of 100");
		map.put(20, "value of 20");
		map.put(30, "value of 30");
		map.put(40, "value of 40");
		map.put(100, "value of 100");
		
		
		System.out.println(map.get(100));
		map.remove(20);
		System.out.println(map.get(20));
	}
}
