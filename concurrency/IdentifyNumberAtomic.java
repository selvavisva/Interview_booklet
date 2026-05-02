package com.depth.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class IdentifyNumberAtomic {	
	private int maxNum;	
	private AtomicInteger counter= new AtomicInteger(1);
	
	public IdentifyNumberAtomic(int maxNum){
		this.maxNum=maxNum;
	}
	
	public void oddNums() {		
		while(true) {
			int current = counter.get();
			if(current > maxNum) break;			
			if(current%2!=0) {
				counter.compareAndExchange(current, current+1);
				System.out.println(Thread.currentThread().getName()+" :: "+current);
			}
		}
	}
	
	public void evenNums() {		
		while(true) {
			int current = counter.get();
			if(current > maxNum) break;
			if(current%2==0) {
				counter.compareAndExchange(current, current+1);
				System.out.println(Thread.currentThread().getName()+" :: "+current);
			}
		}
	}
}