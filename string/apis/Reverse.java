package com.depth.string.apis;

public class Reverse {
	
	public static void main(String[] args) {		
		String str = "Hello";
		StringBuilder strBuilder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			strBuilder.append(str.charAt(i));			
		}
		
		System.out.println(strBuilder.toString());
		
	}
}
