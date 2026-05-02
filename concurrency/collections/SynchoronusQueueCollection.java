package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchoronusQueueCollection {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new SynchronousQueue<>();
		
		
		ProducerSQ producer = new ProducerSQ(queue);
		
		ConsumerSQ consumer = new ConsumerSQ(queue);
		
		Thread t1 = new Thread(producer,"Producer -> ");
		Thread t2 = new Thread(consumer,"Consumer -> ");
		
		t1.start();
		t2.start();
		
	}
}
