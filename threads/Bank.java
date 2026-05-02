package com.depth.threads;

public class Bank {
	
	public synchronized void withdraw() {
		System.out.println(Thread.currentThread().getName() +" :: withdraw in process");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	public synchronized void balanceCheck() {
		System.out.println(Thread.currentThread().getName() +" :: balance check in process");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

}
