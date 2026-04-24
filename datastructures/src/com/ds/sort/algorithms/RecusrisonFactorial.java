package com.ds.sort.algorithms;

public class RecusrisonFactorial {

	public static void main(String[] args) {

		System.out.println(factorial(3));
	}
	
	  public static int factorial(int num) {
		  int result=num; 		
		  if(num==1) { 
			  return result; 
		  } 		  
		  return result*factorial(num-1); 
	 }	  
	 
}
