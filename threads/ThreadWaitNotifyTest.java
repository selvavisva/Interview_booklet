package com.depth.threads;

public class ThreadWaitNotifyTest {	
	public static void main(String[] args) {
		OrderQueue queue = new OrderQueue();
		
		PlaceRunner placeRunner = new PlaceRunner(queue);
		Thread t1 = new Thread(placeRunner);
		t1.setName("Place order thread");
		
		ConsumeRunner consumeRunner = new ConsumeRunner(queue);
		Thread t2 = new Thread(consumeRunner);
		t2.setName("Consumer order thread");
		
		t1.start();
		t2.start();
		
	}
}