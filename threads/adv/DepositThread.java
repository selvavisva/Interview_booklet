package com.depth.threads.adv;

public class DepositThread implements Runnable{

	private Bank bank;
	
	DepositThread(Bank bank){
		this.bank=bank;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			bank.depositAmount(15);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
