package com.depth.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {
	private int value;

	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public int read() {
		lock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+ " :: Reading");
			return value;
		} finally {
			lock.readLock().unlock();
		}
	}
	
	public void write() {
		lock.writeLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+ " :: Writing");
			value++;
		}finally {
			lock.writeLock().unlock();
		}
	}
}
