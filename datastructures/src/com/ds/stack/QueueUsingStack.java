package com.ds.stack;

public class QueueUsingStack<E> {
	
	private StackLinkedList<E> inStack, outStack;
	
	public QueueUsingStack() {
		inStack = new StackLinkedList();
		outStack = new StackLinkedList();
	}
	
	public void enqueue(E element) {
		inStack.push(element);
	}
	
	public E dequeue() {
		if(isEmpty()) {			
			throw new RuntimeException();
		}		
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}
	
	private boolean isEmpty() {		
		return inStack.isEmpty() && outStack.isEmpty();
	}
}
