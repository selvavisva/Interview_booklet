package com.depth.threadpools;

import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer>{
	
	public Integer call() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		throw new RuntimeException();
		//return sum;
	}
}
