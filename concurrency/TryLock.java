package com.depth.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class TryLock {	
	ReentrantLock lock = new ReentrantLock();	
	int count=0;
	
	public void increment() {		
		if(lock.tryLock()) {
			try {
				System.out.println(Thread.currentThread().getName()+" :: lock acquired");
				count++;
			}catch(Exception exp) {
				exp.printStackTrace();
			}finally {
				lock.unlock();
			}
		}else {
			System.out.println(Thread.currentThread().getName()+" :: lock not acquired");
		}		
	}
}
