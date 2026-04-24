package com.ds;

import com.ds.stack.StackLinkedList;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		String str = "Racecar";
		//String str = "I did did I";
		String modifiedStr = str.replace(" ", "");
		System.out.println(palindromeValidate(str));
	}
	
	public static String palindromeValidate(String str) {
		StackLinkedList stack = new StackLinkedList<>();
			
		char[] dataArray = str.toCharArray();
		
		for(char data:dataArray ) {
			stack.push(data);			
		}
		
		for(char data:dataArray ) {
			char popData=(Character)stack.pop();
			if(!String.valueOf(data).equalsIgnoreCase(String.valueOf(popData))) {
				return "Not a Palindrome";
			}
		}
		
		return "Palindrome";
		
	}

}
