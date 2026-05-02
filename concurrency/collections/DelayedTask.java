package com.depth.concurrency.collections;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Delayed {
	private long delay;
	private String name;

	DelayedTask(long delay, String name) {
		this.delay = System.currentTimeMillis() + delay;
		this.name = name;
	}

	
	public long getDelay(TimeUnit unit) {
		long remaining = delay - System.currentTimeMillis();
		return unit.convert(remaining, TimeUnit.MILLISECONDS);
	}

	public int compareTo(Delayed other) {
		return Long.compare(this.delay, ((DelayedTask) other).delay);
	}
	 

	public String toString() {
		return "Name :: " + name + " Delay :: " + delay;
	}
}
