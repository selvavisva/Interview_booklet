package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ConsumerPBQ implements Runnable{
	
	private BlockingQueue<TaskPBQ> queue;
	
	ConsumerPBQ(BlockingQueue<TaskPBQ> queue){
		this.queue=queue;
	}
	
	public void run() {		
		while(true) {	
			try {
				Thread.sleep(500);
				System.out.println("\n\nConsumed :: "+queue.take().toString());
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
}