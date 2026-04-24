package com.ds.sort.algorithms;

public class InsertionSort {
	
	public static void main(String[] args) {
		int [] arr = {20,35,-15,7,55,1,-22};
		
		int unsortedFirstIndex=0;
		
		for(int i=1;i<arr.length;i++) {	
			System.out.println("unsorted index :: "+unsortedFirstIndex);
			if(arr[unsortedFirstIndex] < arr[i]) {
				System.out.println(arr[unsortedFirstIndex]+"<"+arr[i]);
				unsortedFirstIndex=i;
				System.out.println("unsortedFirstIndex --> "+i);
			}
			else {				
				for(int j=i;j>0;j--) {					
					System.out.println(arr[j]+"<"+arr[j-1]);
					if(arr[j]<arr[j-1]) {
						System.out.println("condition met");
						int tmp = arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=tmp;
					}
				}
			}
			
		}
		
		for(int result:arr) {
			System.out.print(result+" ");
		}
	} 

}