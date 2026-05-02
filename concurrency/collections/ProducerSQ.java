package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ProducerSQ implements Runnable{	
	BlockingQueue<String> queue;		
	ProducerSQ(BlockingQueue<String> queue){
		this.queue=queue;
	}	
	public void run() {		
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+ " publishing message with id :: "+i);
				queue.put("Message :: "+i);	
			}
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
}
