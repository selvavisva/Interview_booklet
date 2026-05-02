package com.depth.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class GameCounter {
	
	private AtomicInteger counter = new AtomicInteger(0);

	
	public int get() { return counter.get(); }
	 
	public int increment() {		
		return counter.incrementAndGet();
	}
}