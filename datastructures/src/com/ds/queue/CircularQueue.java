package com.ds.queue;

public class CircularQueue<E> {
	
	private Object[] queue;
	private int front,back;
	private int size;
	private int capacity=10;
	
	public CircularQueue() {
		queue = new Object[10];
	}
	
	public void add(E e) {		
		if(size==queue.length-1) {
			Object[] newqueue = new Object[2*capacity];
			int numItems = size();
			System.arraycopy(queue, front, newqueue, 0, queue.length-front);
			System.arraycopy(queue, 0, newqueue, queue.length-front, back);
			queue=newqueue;			
			front=0;
			back = numItems;
		}		
		queue[back]=e;
		if(back < queue.length-1) {
			back++;
		}else {
			back=0;
		}
		
		//back=(back+1) % queue.length;
	}
	
	public Object remove() {
		Object obj = queue[front];
		queue[front]=null;
		if(size()==0) {
			front=0;
			back=0;
		}
		else if(front == queue.length-1) {
			front=0;
		}else {
			front++;
		}
		
		//front = (front+1) % queue.length;
		return obj;
	}
	
	public int size() {		
		if(front<back) {
			return back-front;
		}else {
			return back-front+queue.length;
			//return (back-front+queue.length) % queue.length;
		}
	}
	
	public Object peek() {
		if(size()==0) {
			throw new RuntimeException("No element available exception");
		}else {
			return queue[front];
		}
	}

}
