package com.ds;

public class CustomHashMap<K,V> {	
	private Entry<K,V>[] buckets;	
	private int default_capacity=16;
	private int size=0;

	private class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> next;
		
		Entry(K key, V value){
			this.key=key;
			this.value=value;
		}
	}
	
	public CustomHashMap(){
		buckets = new Entry[default_capacity];
	}
	
	public void put(K key, V value) {		
		int index = index(hash(key));	
		System.out.println(index);
		Entry<K,V> head = buckets[index];
		
		while(head!=null) {			
			if(head.key.equals(key)) {
				head.value=value;
			}
			head=head.next;
		}
		
		Entry<K,V> newNode = new Entry(key,value);
		newNode.next=buckets[index];
		buckets[index]=newNode;	
		size++;
	}
	
	public V get(K key) {
		int index = index(hash(key));
		Entry<K,V> head = buckets[index];		
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public V remove(K key) {		
		int index = index(hash(key));
		Entry<K,V> head = buckets[index];
		Entry<K,V> prev = null;		
		while(head!=null) {
			if(head.key.equals(key)) {
				if(prev==null) {
					buckets[index]=head.next;				
				}
				else {
					prev.next=head.next;
				}
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		size--;
		return null;
	}
	
	private int hash(K key) {
		int h = key.hashCode();
		return h ^ (h >>> 16);
	}
	
	private int index(int hash) {
		return (default_capacity-1) & hash;
	}
}
