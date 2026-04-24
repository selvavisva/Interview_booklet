package com.ds.sort.algorithms;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int [] arr = {50,30,10,100,60,90,20,70,40,80};
		
		quickSort(arr,0,arr.length-1);
		
		for(int result:arr) {
			System.out.print(result+" ");
		}
	}
	
	public static void quickSort(int [] arr, int start, int end) {
	
		if(start>end) {
			return;
		}
		int p = partition(arr, start,end);
		quickSort(arr,start,p-1);
		quickSort(arr,p+1,end);		
	}
	
	public static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[start];
		int i=start+1;
		int j=end;
		
		while(i<=j) {
			while(i<=j && arr[i]<pivot) i++;
			while(arr[j]>pivot) j--;			
		
			if(i<j) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;	
			}
			
		}
		
		int pivotTmp=arr[start];		
		arr[start]=arr[j];
		arr[j]=pivotTmp;
		
		
		return j;
	}

}
