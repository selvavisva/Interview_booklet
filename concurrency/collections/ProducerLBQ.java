package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ProducerLBQ implements Runnable{

	private BlockingQueue<String> queue;
	
	ProducerLBQ(BlockingQueue<String> queue){
		this.queue=queue;
	}
	
	public void run() {		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+ " :: Message put :: "+i);
			try {
				queue.put("Message :: "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
