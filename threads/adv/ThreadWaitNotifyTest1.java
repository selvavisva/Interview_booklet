package com.depth.threads.adv;

public class ThreadWaitNotifyTest1 {
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		DepositThread deposit = new DepositThread(bank);
		WithdrawThread withdraw = new WithdrawThread(bank);
		
		Thread t1 = new Thread(deposit);
		Thread t2 = new Thread(withdraw);
		Thread t3 = new Thread(withdraw);
		Thread t4 = new Thread(withdraw);
		Thread t5 = new Thread(withdraw);
		
		t1.start();t1.setName("Deposit Thread");
		t2.start();t2.setName("Withdraw Thread 1");
		t3.start();t3.setName("Withdraw Thread 2");
		t4.start();t4.setName("Withdraw Thread 3");
		t5.start();t5.setName("Withdraw Thread 4");
	}

}
