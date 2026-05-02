package com.depth.threads;

public class ThreadJoinTest1{

	public static void main(String[] args){
	
			Runnable r = () -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println ("executing my thread");
				
			};
			Thread t1 = new Thread(r);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			System.out.println("main thread completed");
	
	}
}