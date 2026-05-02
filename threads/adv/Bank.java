package com.depth.threads.adv;

public class Bank {	
	private volatile int  bankBalance = 500;	
	
	public synchronized void depositAmount(int amount) {				
		bankBalance = bankBalance+amount;		
		System.out.println(Thread.currentThread().getName() +" -> Bank Balance is :: "+bankBalance);
		notifyAll();
	}
	
	public synchronized void withdrawAmount(int amount) {
		while(bankBalance<amount) {
			try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}		
		bankBalance = bankBalance-amount;		
		System.out.println(Thread.currentThread().getName()+" :: current balance is :: "+bankBalance);
				
	}
}