package com.ds.queue;

public class CircularQueue1<E> {
	
	private int front,back;
	private Object[] queue;
	private int defaultCapacity=16;
	private int num;
	
	public CircularQueue1(){
		front=back=0;
		queue = new Object[defaultCapacity];
	}
	
	public int getSize() {
		return (back-front+queue.length) % queue.length;
	}
	
	public boolean isEmpty() {
		return front==back;
	}
	
	public boolean isFull() {
		return (getSize()==queue.length-1);
	}
	
	public void grow() {		
		Object[] newQueue = new Object[2*defaultCapacity];
		num = getSize();		
		for(int i=0; i<num; i++) {
			newQueue[i]=queue[(front+i)%queue.length];
		}		
		queue = newQueue;
		front=0;
		back=num;
	}
	
	public void addLast(E e) {
		if(isFull()) {
			grow();
		}
		queue[back]=e;
		back=(back+1)%queue.length;
	}
	
	public void addFirst(E e) {
		if(isFull()) {
			grow();
		}
		front=(front-1+queue.length)%queue.length;
		queue[front]=e;
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			throw new RuntimeException("Empty queue");
		}		
		E element = (E)queue[front];		
		queue[front]=null;
		front=(front+1)%queue.length;
		return element;
	}
	
	
	public E removeLast() {
	    if(isEmpty()) {
	        throw new RuntimeException("Empty queue");
	    }
	    back = (back - 1 + queue.length) % queue.length;
	    E element = (E) queue[back];
	    queue[back] = null;
	    return element;
	}
	
	public E peekFirst() {
		if(isEmpty()) {
			throw new RuntimeException("Empty queue");
		}
		
		E element = (E)queue[front];
		return element;		
	}
	
	public E peekLast() {
		if(isEmpty()) {
			throw new RuntimeException("Empty queue");
		}		
		int index=(back-1+queue.length)%queue.length;
		E element = (E)queue[index];		
		return element;
	}
}
