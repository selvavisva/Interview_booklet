package com.depth.concurrency.collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueCollection {
	public static void main(String[] args) {
		
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
		
		Thread producer = new Thread(() -> {			
			for(int i=0;i<1000;i++) {
				queue.offer("Message - "+i);
				try {
					Thread.sleep(500);	
				}catch(InterruptedException exp) {
					exp.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+" :: "+"Message - "+i);
			}			
		});
		
		Thread consumer = new Thread(() -> {
			  try { 
				  	Thread.sleep(800); 
			  } catch (InterruptedException e) {
				  e.printStackTrace(); 
			  }	 
			String task;
			while((task=queue.poll())!=null) {
				
				System.out.println(Thread.currentThread().getName()+" :: "+task);
				
			}
		});
		
		producer.start();producer.setName("Producer");
		
		consumer.start();consumer.setName("Consumer");
	}
}
