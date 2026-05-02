package com.depth.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class GameMonsterHunter {
	
	AtomicInteger count = new AtomicInteger(10);
	
	
	public void huntMonster(int huntCount) {
		System.out.println(Thread.currentThread().getName()+" HUNT :: "+huntCount);
		count.addAndGet(-1);		
	}
	
	public void addMonster(int addCount) {
		System.out.println(Thread.currentThread().getName()+" ADD :: "+addCount);
		count.addAndGet(1);
	}
	
	public int getCurrentMonsterCount() {
		return count.get();
	}

}
