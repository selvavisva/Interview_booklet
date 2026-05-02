package com.depth.string.apis;

public class StringRotation {
	
	public static void main(String[] args) {
		String input="abcdef";
		String rotate="cdefab";
		
		System.out.println(rotateTester(input,rotate));
		
	}
	
	private static boolean rotateTester(String input, String rotate) {		
		String s1 = input+input;		
		return s1.indexOf(rotate)!=-1;
	}
}