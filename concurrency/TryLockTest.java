package com.depth.concurrency;

public class TryLockTest {
	public static void main(String[] args) {
		TryLock lock = new TryLock();
		
		Thread t1 = new Thread(() -> {
			int count = 0;
			while(count<10) {
				lock.increment();
				count++;
			}
		});
		

		Thread t2 = new Thread(() -> {
			int count = 0;
			while(count<10) {
				lock.increment();
				count++;
			}
		});
		
		t1.start();t1.setName("Player 1");
		t2.start();t2.setName("Player 2");
		
	}
}
