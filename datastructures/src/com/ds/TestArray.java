package com.ds;

public class TestArray {
	public static void main(String[] args) {
		CustomArray<Integer> customArray = new CustomArray();
		customArray.add(10);
		customArray.add(40);
		customArray.add(20);
		customArray.add(30);
		customArray.add(70);
		customArray.set(0, 100);	
		System.out.println(customArray.get(2));
		customArray.remove(40);
		System.out.println(customArray.get(2));
		System.out.println(customArray.get(0));
	}
}
