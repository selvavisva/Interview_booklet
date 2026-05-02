package com.depth.threads;

public class ThreadWaitNotifyTest2 {
	
	public static void main(String[] args) {
		
		IdentifyNumber nums = new IdentifyNumber(10);		
		OddRunner odd = new OddRunner(nums);		
		EvenRunner even = new EvenRunner(nums);
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t1.start();
		
		t2.start();
		
	}

}
