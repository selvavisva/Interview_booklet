package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ConsumerSQ implements Runnable{
	BlockingQueue<String> queue;	
	ConsumerSQ(BlockingQueue<String> queue){
		this.queue =queue;
	}
	public void run() {
		while(true) {
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" fetching the data :: "+queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
