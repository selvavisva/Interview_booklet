package com.depth.threads;

public class PlaceRunner implements Runnable{

	private OrderQueue queue;
	
	PlaceRunner(OrderQueue queue){
		this.queue=queue;
	}
	
	@Override
	public void run() {		
	 int orderId = 1;
        try {
            while (true) {
                queue.placeOrder(orderId++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}
}