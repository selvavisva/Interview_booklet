package com.ds.stack;

import java.util.EmptyStackException;

public class ArrayStack<E> {
	
	private int top;	
	private Object[] elementArray;
	
	public ArrayStack(int capacity){
		elementArray = new Object[capacity];
	}
	
	public void push(E e) {
		
		if(top==elementArray.length) {
			//resize the array
			System.out.println("--- Resizing the array ---");
			Object[] newArray = new Object[2*elementArray.length];
			System.arraycopy(elementArray, 0, newArray, 0, elementArray.length);
			elementArray=newArray;			
		}		
		elementArray[top++]=e;
		
	}
	
	public E pop() {		
		if(top==0) {
			throw new EmptyStackException();
		}
		Object obj = elementArray[--top];
		elementArray[top]=null;
		return (E)obj;
		
	}
	
	public E peek() {		
		if(top==0) {
			throw new EmptyStackException();
		}
		return (E)elementArray[top-1];
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		
		for(int i=top-1;i>=0;i--) {
			System.out.println(elementArray[i]);
			
		}
	}
	
}
