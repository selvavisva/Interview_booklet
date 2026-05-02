package com.depth.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class IdentifyNumberAtomic2 {
	
	private int maxNum;	
	private AtomicInteger counter= new AtomicInteger(1);
	
	public IdentifyNumberAtomic2(int maxNum){
		this.maxNum=maxNum;
	}
	
	public void oddNums() {		
		while(counter.get() < maxNum) {					
			if(counter.get()%2!=0) {
				System.out.println(Thread.currentThread().getName()+" :: "+counter);
				counter.incrementAndGet();
				
			}
		}
	}	
	public void evenNums() {		
		while(counter.get() <= maxNum) {					
			if(counter.get()%2==0) {
				System.out.println(Thread.currentThread().getName()+" :: "+counter);
				counter.incrementAndGet();
				
			}
		}
	}
}
