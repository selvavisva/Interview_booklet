package com.depth.threads;

public class ThreadTypesTest {
	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.start();
	}
}
