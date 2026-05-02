package com.depth.threadpools;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest1 {
	public static void main(String[] args) {
		int arr[] = {10,10,10,10,10,10,10,10,10,10};
		ArraySumTask task = new ArraySumTask(arr, 0, arr.length);
		
		ForkJoinPool forkPool = new ForkJoinPool();
		
		long result = forkPool.invoke(task);
		System.out.println("result --> "+result);
	}
}