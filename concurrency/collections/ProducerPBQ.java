package com.depth.concurrency.collections;

import java.util.concurrent.BlockingQueue;

public class ProducerPBQ implements Runnable{
	
	private BlockingQueue<TaskPBQ> queue;
	
	ProducerPBQ(BlockingQueue<TaskPBQ> queue){
		this.queue=queue;
	}
	
	public void run() {		
		try {			
			
			TaskPBQ task2 = new TaskPBQ(2,"Priority 2 Task");
			System.out.println("Produced - "+task2.toString());
			queue.put(task2);
			Thread.sleep(100);
			TaskPBQ task3 = new TaskPBQ(3,"Priority 3 Task");
			System.out.println("Produced - "+task3.toString());
			queue.put(task3);
			Thread.sleep(100);
			TaskPBQ task1 = new TaskPBQ(1,"Priority 1 Task");
			System.out.println("Produced - "+task1.toString());
			queue.put(task1);
			Thread.sleep(100);
			TaskPBQ task4 = new TaskPBQ(4,"Priority 4 Task");
			System.out.println("Produced - "+task4.toString());
			queue.put(task4);
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
}
