package com.depth.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockWithTime {
	private ReentrantLock lock = new ReentrantLock();	
	public void increment() {		
		try {
			if(lock.tryLock(2, TimeUnit.SECONDS)) {
				System.out.println(Thread.currentThread().getName()+" :: acquired lock");				
				Thread.sleep(3000);
			}else {
				System.out.println(Thread.currentThread().getName()+" :: not acquired lock");
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

}
