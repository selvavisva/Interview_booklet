package com.depth.threads;

public class OddRunner implements Runnable{

	private IdentifyNumber num;
	
	OddRunner(IdentifyNumber num){
		this.num=num;
	}
	
	@Override
	public void run() {
		num.oddNums();
	}

}
