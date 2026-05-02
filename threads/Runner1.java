package com.depth.threads;

public class Runner1 implements Runnable{

	private Bank bank;
	
	Runner1(Bank bank){
		this.bank=bank;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() +" :: Started");		
		bank.withdraw();
		System.out.println(Thread.currentThread().getName() +" :: Completed");
	}
}
