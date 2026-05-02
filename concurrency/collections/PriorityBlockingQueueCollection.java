package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueCollection {
	public static void main(String[] args) {		
		BlockingQueue<TaskPBQ> queue = new PriorityBlockingQueue<>();
	
		ProducerPBQ producer = new ProducerPBQ(queue);		
		ConsumerPBQ consumer = new ConsumerPBQ(queue);
		
		Thread t1= new Thread(producer,"Producer");
		
		Thread t2 = new Thread(consumer,"Conumer");
		
		t1.start();
		t2.start();
		
	}
}