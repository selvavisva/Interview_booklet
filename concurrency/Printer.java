package com.depth.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {	
	private int paper=0;
	private int ink=0;
	
	Lock lock = new ReentrantLock();	
	Condition paperAvailable = lock.newCondition();
	Condition inkAvailable = lock.newCondition();
	
	public void print(String name) {		
		lock.lock();		
		try {
			
			while(paper==0) {
				System.out.println(name+ " waiting for paper");
				paperAvailable.await();
				
			}
			
			while(ink==0) {
				System.out.println(name+ " waiting for ink");
				inkAvailable.await();
			}
			
			paper--;
			ink--;
			
			System.out.println(name + " printing the document");			
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void refillPaper(int sheets) {		
		lock.lock();		
		try {
			System.out.println("----- Refling papers ------");
			paper+=sheets;
			paperAvailable.signalAll();
		}catch(Exception exp) {
			System.out.println("Exception in paper refill");
		}finally{
			lock.unlock();
		}
		
	}
	
	public void refillInk(int cartidges) {
		lock.lock();
		try {
			System.out.println("----- Refling cartidges ------");
			ink+=cartidges;
			inkAvailable.signalAll();			
		}catch(Exception exp) {
			System.out.println("Exception in ink refill");
		}finally {
			lock.unlock();
		}
	}
}
