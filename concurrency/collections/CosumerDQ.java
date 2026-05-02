package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class CosumerDQ implements Runnable{
	private BlockingQueue<DelayedTask> queue;
	CosumerDQ(BlockingQueue<DelayedTask> queue){
		this.queue = queue;
	}
	
	public void run() {
		while(true) {
			try {
			System.out.println("Consumer :: "+queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
