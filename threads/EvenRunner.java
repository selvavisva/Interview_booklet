package com.depth.threads;

public class EvenRunner implements Runnable{
	
	private IdentifyNumber num;	
	
	EvenRunner(IdentifyNumber num){
		this.num=num;
	}
	
	@Override
	public void run() {
		num.evenNums();
	}
}