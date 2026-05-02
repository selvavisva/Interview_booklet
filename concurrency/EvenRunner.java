package com.depth.concurrency;

public class EvenRunner implements Runnable{
	
	private IdentifyNumberAtomic num;	
	
	EvenRunner(IdentifyNumberAtomic num){
		this.num=num;
	}
	
	@Override
	public void run() {
		num.evenNums();
	}
}