package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ProducerDQ implements Runnable{

	private BlockingQueue<DelayedTask> queue;
	
	
	ProducerDQ(BlockingQueue<DelayedTask> queue){
		this.queue = queue;
	
		
	}
	
	public void run() {
		try {
		DelayedTask task1 = new DelayedTask(1000, "Message 1 with delay [1s]");
		DelayedTask task2 = new DelayedTask(500, "Message 2 with delay of [0.5s]");
		DelayedTask task3 = new DelayedTask(2000, "Message 3 with delay of [2s]");
		
		
			queue.put(task1);
			queue.put(task2);
			queue.put(task3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
