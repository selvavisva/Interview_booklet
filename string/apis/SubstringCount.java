package com.depth.string.apis;

public class SubstringCount {
	
	public static void main(String[] args) {
		System.out.println(countOccurrences("banana", "na"));
	}
	
	public static int countOccurrences(String text, String pattern) {
		
		int index=0;
		int count=0;
		
		while((index=text.indexOf(pattern,index))!=-1) {
			count++;			
			index+=pattern.length();
		}
		return count;
		
	}
}
