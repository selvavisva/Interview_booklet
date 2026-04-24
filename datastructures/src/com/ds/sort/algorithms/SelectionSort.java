package com.ds.sort.algorithms;

public class SelectionSort {
	
	public static void main(String[] args) {
		int [] arr = {20,35,-15,7,-22,1,55};
		
		int largestNumIndex=0;
		
		for(int unsortedIndex=arr.length-1;unsortedIndex>0;unsortedIndex--) {
			System.out.println("unsorted index -> "+unsortedIndex);
			for(int j=1;j<=unsortedIndex;j++) {
				System.out.println("Inside j --> "+j);				
				System.out.println(arr[j] +">"+ arr[largestNumIndex]);
				if(arr[j] > arr[largestNumIndex]) {
					System.out.println("Condition 1 met");
					largestNumIndex=j;
				}
				
				if(j==unsortedIndex) {
					System.out.println("Condition FINAL met");
					int tmp = arr[largestNumIndex];
					arr[largestNumIndex]=arr[j];
					arr[j]=tmp;
					largestNumIndex=0;
				}
			}
			
		}
		
		for (int result:arr) {
			System.out.print(result+" ");
		}
	}

}
