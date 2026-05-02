package com.depth.threads;

public class Runner2 implements Runnable{
	
	private Bank bank;
	
	Runner2(Bank bank){
		this.bank=bank;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() +" :: Started");	
		bank.balanceCheck();
		System.out.println(Thread.currentThread().getName() +" :: Completed");
	}
}
