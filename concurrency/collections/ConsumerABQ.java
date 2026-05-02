package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ConsumerABQ implements Runnable{
	
	private BlockingQueue<String> queue;
	
	ConsumerABQ(BlockingQueue<String> queue){
		this.queue=queue;
	}	
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				queue.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			
		}
	}
}
