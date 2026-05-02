package com.depth.threads;

public class ThreadSleepTest {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName()+" is running");	
			}
			
			  try { Thread.sleep(2000);
			  
			  } catch (InterruptedException e) { e.printStackTrace(); }
			 
		};
		Thread t1 = new Thread(r);
		t1.setName("Runnable Thread 1");
		t1.start();
		Thread t2 = new Thread(r);
		t2.setName("Runnable Thread 2");
		t2.start();
		Thread t3 = new Thread(r);
		t3.setName("Runnable Thread 3");
		t3.start();
		Thread t4 = new Thread(r);
		t4.setName("Runnable Thread 4");
		t4.start();
		Thread t5 = new Thread(r);
		t5.setName("Runnable Thread 5");
		t5.start();
		
	
	}
}