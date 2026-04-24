package com.ds.queue;

public class QueueLinkedList<E> {
	
	private Node<E> front, rear;
	private int size;
	private static class Node<E>{
		Node<E> next;
		E item;
		
		Node(E e){
			this.item=e;
		}
	}
	
	QueueLinkedList(){
		this.front=null;
		this.rear=null;
		size=0;
	}
	
	public void add(E e) {
		Node<E> newNode = new Node(e);
		if(isEmpty()) {
			front=rear=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}
	
	public E remove() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		else {
			E e = front.item;
			front=front.next;
			size--;
			return e;
		}		
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public int size() {
		return size;
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new RuntimeException();
		}else {
			return front.item;
		}
	}
	
}
