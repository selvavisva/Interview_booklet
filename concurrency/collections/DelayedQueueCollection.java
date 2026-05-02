package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class DelayedQueueCollection {
	public static void main(String[] args) {		
		try {
		BlockingQueue<DelayedTask> task = new DelayQueue<>();
		
		ProducerDQ producer = new ProducerDQ(task);
		CosumerDQ consumer = new CosumerDQ(task);
		
		Thread t1 = new Thread(producer,"Producer :: ");
		Thread t2 = new Thread(consumer, "Consumer :: ");
		t1.start();t2.start();
		
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}

}