package com.depth.concurrency.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueCollection {		
	public static void main(String[] args) {		
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);		
		ProducerABQ producer = new ProducerABQ(queue);
		ConsumerABQ consumer = new ConsumerABQ(queue);
		
		
		Thread t1 = new Thread(producer);t1.setName("Producer 1");
		
		Thread t2 = new Thread(consumer);t2.setName("Consumer 1");
		
		t1.start();
	
		t2.start();
	}
}