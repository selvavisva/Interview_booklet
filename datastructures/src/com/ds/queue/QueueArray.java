package com.ds.queue;

import java.util.NoSuchElementException;

public class QueueArray<E> {
	
	private int front, back;	
	private Object[] queueArray;
	
	public QueueArray(int capacity) {
		queueArray = new Object[capacity]; 
	}
	
	public void add(E e) {
		if(back==queueArray.length) {
			Object[] newQueueArray = new Object[2*queueArray.length];
			System.arraycopy(queueArray, 0, newQueueArray, 0, queueArray.length);			
			queueArray=newQueueArray;
		}		
		queueArray[back++]=e;
	}
	
	public E remove() {
		if(getSize()==0) {
			throw new NoSuchElementException();
		}
		Object obj  =  queueArray[front++];		
		queueArray[front-1] = null;
		return (E) obj;
	}
	
	public int getSize() {
		return back-front;
	}
	
	public Object peek() {
		return queueArray[front];
	}
	
	public void printQueue() {
		for(int i=front;i<back;i++) {
			System.out.println(queueArray[i]);
		}
	}

}
