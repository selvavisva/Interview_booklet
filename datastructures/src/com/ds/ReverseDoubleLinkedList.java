package com.ds;

public class ReverseDoubleLinkedList {
	
	private static class Node<E>{
		
		private Node<E> prev;
		private Node<E> next;
		private E element;
		
		Node(E data){
			this.element=data;
			this.prev=null;
			this.next=null;
		}
	}
	
	private static Node reverse(Node head) {		
		if((head==null) || (head.next==null)) return head;		
		Node current = head;
		Node tmp = null;
		Node newHead = null;
		while(current!=null) {			
			tmp=current.prev;
			current.prev=current.next;
			current.next=tmp;
			newHead = current;
			current = current.prev;
			
		}
		return newHead;		
	}
	
	private static Node reverseUsingRecurrsion(Node current) {
		
		if(current==null) return current;
		
		Node tmp=current.prev;
		current.prev=current.next;
		current.next=tmp;	
		
		if(current.prev==null) {
			return current;
		}
		return reverseUsingRecurrsion(current.prev);
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(25);
		head.next.next=new Node(34);
		
		head.next.prev=head;
		head.next.next.prev=head.next;
		
		Node current = head;
		System.out.println("BEFORE REVERSE");
		print(current);
		Node reverseHead = reverseUsingRecurrsion(head);
		System.out.println("AFTER REVERSE");
		print(reverseHead);
		
	}
	
	static void print(Node current) {
		while(current!=null) {
			System.out.println(current.element);
			current = current.next;
		}
	}

}
