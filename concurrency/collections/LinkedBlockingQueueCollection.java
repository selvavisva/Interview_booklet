package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueCollection {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new LinkedBlockingQueue<>();
		
		ProducerLBQ producer = new ProducerLBQ(queue);
		ConsumerLBQ consumer = new ConsumerLBQ(queue);
		
		Thread t1 = new Thread(producer); t1.setName("Producer");
		Thread t2 = new Thread(consumer); t2.setName("Consumer");
		
		t1.start();
		t2.start();
	}
}