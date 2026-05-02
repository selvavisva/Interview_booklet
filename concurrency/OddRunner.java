package com.depth.concurrency;

public class OddRunner implements Runnable{

	private IdentifyNumberAtomic num;
	
	OddRunner(IdentifyNumberAtomic num){
		this.num=num;
	}
	
	@Override
	public void run() {
		num.oddNums();
	}

}
