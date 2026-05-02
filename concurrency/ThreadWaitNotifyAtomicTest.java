package com.depth.concurrency;

public class ThreadWaitNotifyAtomicTest {
	
	public static void main(String[] args) {
		
		IdentifyNumberAtomic nums = new IdentifyNumberAtomic(10);		
		OddRunner odd = new OddRunner(nums);		
		EvenRunner even = new EvenRunner(nums);
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t1.start();t1.setName("Odd Thread");
		
		t2.start();t2.setName("Even Thread");
		
	}

}