package com.depth.concurrency;

public class Reader implements Runnable{
	
	private Counter counter;
	
	Reader (Counter counter){
		this.counter=counter;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			counter.read();	
		}
		
	}

}
