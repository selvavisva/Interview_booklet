package com.depth.string.apis;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "racecar";
		System.out.println(s1+" is a palindrome :: "+isPalindrome(s1));
		
		String s2 = "A man, a plan, a canal: Panama";
		System.out.println(" String is palindrome :: "+isPalindromeSentence(s2));
	}
	
	public static boolean isPalindrome(String str) {
		
		int left=0;
		int right=str.length()-1;
		
		while(left < right) {
			
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	
	public static boolean isPalindromeSentence(String str) {
		int left = 0;
		int right=str.length()-1;
		
		while(left<right) {
			
			while(left<right && !Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}
			
			while(left<right && !Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}
			
			if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))) return false;
				
			
			left++;
			right--;
		}
		return true;
	}
}
