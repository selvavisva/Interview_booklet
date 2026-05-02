package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ConsumerLBQ implements Runnable{
	private BlockingQueue<String> queue;
	
	ConsumerLBQ(BlockingQueue<String> queue){
		this.queue=queue;
	}
	public void run() {
		while(true) {
			try {			
				System.out.println(Thread.currentThread().getName()+" :: Message consumed");
				queue.take();
			}catch(Exception exp) {
				exp.printStackTrace();
			}
		}
	}
}