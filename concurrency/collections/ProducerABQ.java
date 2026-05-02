package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ProducerABQ implements Runnable{
	
	private BlockingQueue<String> queue;
	
	ProducerABQ(BlockingQueue<String> queue){
		this.queue=queue;
	}
	
	public void run() {		
		for(int i=0;i<10;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+ " :: Message put :: "+i);
				queue.put("Message :: "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
