package com.depth.threads;

public class ThreadJoinTest {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);					
					System.out.println("T1 running");
				}
			} catch (Exception exp) {

			}
		});

		Thread t2 = new Thread(() -> {
			try {
				// called inside T2
				
				for (int i = 0; i < 100; i++) {
					t1.join();
					Thread.sleep(1000);
					System.out.println("T2 running after T1");
				}
			} catch (Exception e) {
			}
		});

		t1.start();
		t2.start();
	}
}