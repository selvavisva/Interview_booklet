package com.depth.threads;

public class ConsumeRunner implements Runnable{
	
	private OrderQueue queue;
	
	ConsumeRunner(OrderQueue queue){
		this.queue=queue;
	}
	
	public void run() {
		try {
            while (true) {
                queue.consumeOrder();
                Thread.sleep(15000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}
}
