package com.depth.threads;

public class ThreadNotifyAllTest {
	public static void main(String[] args) {
		
		AlphabetIdentifier identifier = new AlphabetIdentifier(10);
		
		RunnerAlpha r1 = new RunnerAlpha(identifier,'A',0);
		RunnerAlpha r2 = new RunnerAlpha(identifier,'B',1);
		RunnerAlpha r3 = new RunnerAlpha(identifier,'C',2);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}