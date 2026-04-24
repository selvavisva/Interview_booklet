package com.ds;

public class ReverseArray {
	public static void main(String[] args) {		
		int[] arrayIntegers={1,2,3,4,5,6,7};
		
		//reverse(arrayIntegers);	
		reverseRecursive(arrayIntegers,0,arrayIntegers.length-1);
		
	}
	
	private static void reverse(int[] arrayIntegers) {
		for(int i=0,j=arrayIntegers.length-1;i<j;i++,j--) {			
			int tmp = arrayIntegers[i];
			arrayIntegers[i]=arrayIntegers[j];
			arrayIntegers[j]=tmp;			
		}
		for(int x: arrayIntegers)
		{
			System.out.println(x);
		}
	}
	
	private static void reverseRecursive(int[] arrayIntegers, int i, int j) {					
		if(i>j) {	
			for(int x: arrayIntegers)
			{
				System.out.println(x);
			}
			return;
		}	
		int tmp = arrayIntegers[i];
			arrayIntegers[i]=arrayIntegers[j];
			arrayIntegers[j]=tmp;			
		
		reverseRecursive(arrayIntegers,i+1,j-1);
	}
}
