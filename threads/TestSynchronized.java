package com.depth.threads;

public class TestSynchronized {	
	public static void main(String[] args) {
			
		Bank bank=new Bank();
		//Bank bank2=new Bank();
		Runner1 runner1 = new Runner1(bank);
		Runner2 runner2 = new Runner2(bank);
		
		Thread t1 = new Thread(runner1);
		t1.start();
		
		Thread t2 = new Thread(runner2);
		try {
			t2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}