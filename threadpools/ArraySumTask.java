package com.depth.threadpools;

import java.util.concurrent.RecursiveTask;

public class ArraySumTask extends RecursiveTask<Integer>{
	
	int arr[];
	int start,end;
	int threshold = 5;
	int sum=0;
	
	ArraySumTask(int[] arr, int start, int end){
		this.arr=arr;
		this.start=start;
		this.end=end;
	}
	
	@Override
	public Integer compute() {		
		if(end-start<threshold) {			
			for(int i=start;i<end;i++) {
				sum=sum+arr[i];
			}
			return sum;
		}
		
		int mid=(start+end)/2;
		
		ArraySumTask taskLeft = new ArraySumTask(arr, start, mid);		
		ArraySumTask taskRight = new ArraySumTask(arr, mid, end);
		
		taskLeft.fork();
		
		int resultRight = taskRight.compute();
		
		int resultLeft = taskLeft.join(); 
		
		return resultLeft+resultRight;
	}
	
}
