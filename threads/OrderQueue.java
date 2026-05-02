package com.depth.threads;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {	
	private Queue<Integer> queue = new LinkedList<>();
	private int MAX_SIZE=5;
	
	public synchronized void placeOrder(int order) {		
		while(queue.size()==MAX_SIZE) {
			try {
				System.out.println("Place order queue is full and waiting for consume process");
				wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}	
		}
		
		queue.add(order);
		System.out.println("Order placed for Order ID :: "+order);
		notify();
	}
	
	public synchronized void consumeOrder() {
		while(queue.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		int data = queue.poll();
		System.out.println("Order processed for Order ID :: "+data);
		notify();
	}
	

}
