package com.ds;

public class CustomDoubleLinkedList<E> {

	//addFirst -> linkFirst
	//addLast -> linkLast
	//add (E)
	//add(index,E) -> linkBefore

	//removeFirst -> unlinkFirst
	//removeLast -> unlinkLast
	//remove(Object) -> unlink -> Node()
	
	private int size;
	
	private Node<E> first;
	
	private Node<E> last;
	
	private static class Node<E>{
		Node<E> prev;
		Node<E> next;
		E item;
		
		Node(Node<E> prev, E item, Node<E> next){
			this.prev=prev;
			this.item=item;
			this.next=next;
		}
	}
	
	public boolean add(E e) {		
		
		linkLast(e);
		return true;
	}
	
	public boolean addFirst(E e) {
		linkFirst(e);
		return true;
	}
	
	public boolean addLast(E e) {
		linkLast(e);
		return true;
	}
	
	public boolean add(E e, int index) {
		if(size==index) linkLast(e);		
		else {
				linkBefore(e, node(index));
			};
		return true;
	}
	
	public boolean removeFirst() {
		unlinkFirst();
		return true;
	}
	
	public boolean removeLast() {
		unlinkLast();
		return true;
	}
	
	public boolean remove(int index) {
		unlink(node(index));
		return true;
	}
	
	private void linkLast(E e) {		
		Node<E> l = last;
		Node<E> newNode = new Node(l,e,null);
		last=newNode;
		
		if(l==null) {//empty list
			first=newNode;
		}
		else {
			l.next=newNode;
		}
		size++;
	}
	
	private void linkFirst(E e) {
		Node<E> f=first;
		Node<E> newNode = new Node(null,e,f);
		first=newNode;
		if(f==null) {//empty list
			last=newNode;
		}else {
			f.prev=newNode;
		}		
		size++;
	}
	
	
	private void linkBefore(E e ,Node<E> node) {
		
		Node<E> pred=node.prev;
		Node<E> succ = node;
		
		Node<E> newNode = new Node(pred,e,succ);
		succ.prev=newNode;
		if(pred==null) {	
			first=newNode;
		}else {
			pred.next=newNode;
		}
		
		size++;
		
		
	}
	
	private Node<E> node(int index){
		if(index < (size >> 1)) {
			Node<E> x=first;
			for(int i=0;i<index;i++) {
				x=x.next;
			}
			return x;
		}else {
			Node<E> x=last;
			for(int j=size-1;j>index;j--) {
				x=x.prev;
			}
			return x;
		}
	}
	public E unlinkFirst() {
	    Node<E> f = first;
	    if (f == null)
	        return null;

	    Node<E> next = f.next;
	    first = next;
	    
	    if (next == null) {
	        last = null;
	    }
	    else {
	        next.prev = null;
	    	f.next = null;
	    }
	    E element = f.item;
	    f.item = null;
	    size--;
	    return element;
	}
	
	
	private E unlinkLast() {
		Node<E> l = last;
		
		if(l==null) return null;
			
		Node<E> prev = l.prev;		
		last=prev;		
		
		if(prev==null) {			
			first=null;
		}else {
			l.prev=null;
			prev.next=null;
		}
		E element = l.item;
		l.item=null;
		size--;
		return element;		
	}

    
	private E unlink(Node<E> node) {		
		Node<E> prev = node.prev;
		Node<E> next = node.next;
		E element = node.item;
		node.item=null;
		if(prev==null) {
			first = next;			
			next.prev=null;			
		}else {
			prev.next=next;
			node.prev=null;
		}
		
		if(next==null) {
			last=prev;
			prev.next=null;
		}else {
			next.prev=prev;
			node.next=null;
		}
		size--;
		return element;
	}
	
	public int getIndexOf(Object o) {
		int i=0;
		for(Node<E> x =first; x!=null;x=x.next) {
			if(x.item.equals(o)) {
				return i; 
			}
			i++;
		}
		return -1;
	}
	
}
