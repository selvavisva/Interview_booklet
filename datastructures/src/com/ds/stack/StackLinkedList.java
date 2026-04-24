package com.ds.stack;

import java.util.EmptyStackException;

public class StackLinkedList<E> {

	private Node<E> top;
	private int size;

	private static class Node<E> {
		Node<E> next;
		E data;

		Node(E data) {
			this.data = data;
		}
	}

	public StackLinkedList() {
		this.top = null;
		this.size = 0;
	}

	public void push(E e) {
		Node<E> newNode = new Node(e);
		newNode.next=top; 
		top=newNode;
		size++;
	}

	public E pop() {
		if(top==null) {throw new EmptyStackException();}
		E obj = top.data;
		top = top.next;
		size--;
		return obj;
	}

	public E peek() {
		if(top==null) {throw new EmptyStackException();}
		return top.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void printStack() {
		while (top != null) {
			System.out.println(top.data);
			top = top.next;
		}
	}
	
	public int getSize() {		
		return size;
	}

}
