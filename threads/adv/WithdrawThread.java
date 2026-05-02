package com.depth.threads.adv;

public class WithdrawThread implements Runnable{

	private Bank bank;
	
	WithdrawThread(Bank bank){
		this.bank=bank;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			bank.withdrawAmount(100);		
		}
		
	}
}
