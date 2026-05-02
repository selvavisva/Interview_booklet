package com.depth.concurrency;

public class TryLockWithTimeTest {

	public static void main(String[] args) {

		TryLockWithTime lock = new TryLockWithTime();

		Thread t1 = new Thread(() -> {
			while (true) {
				lock.increment();
			}
		});

		Thread t2 = new Thread(() -> {	
			while (true) {
				lock.increment();
			}
		});

		
		t1.start();t1.setName("player 1");
		t2.start();t2.setName("player 2");
		
	}
}