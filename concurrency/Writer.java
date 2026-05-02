package com.depth.concurrency;

public class Writer implements Runnable{

	private Counter counter;
	
	Writer(Counter counter){
		this.counter=counter;
	}
	
	public void run() {
		counter.write();
	}
}
