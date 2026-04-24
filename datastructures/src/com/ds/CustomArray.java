package com.ds;

import java.io.Serializable;

public class CustomArray<E> implements Serializable, Cloneable{
	int DEF_CAP = 10;
	int size=0;
	
	transient Object[] element;
	
	public CustomArray() {
		element = new Object[DEF_CAP];
	}
	
	//add
	//remove
	//getIndex
	//setIndex
	
	public boolean add(E e) {		
		if(size==element.length) {
			grow();
		}
		element[size]=e;
		size++;
		return true;
	}
	
	private void grow() {
		int oldCap = element.length;
		int newCap = oldCap+(oldCap >> 1);
		Object[] resizedArr = new Object[newCap];
		System.arraycopy(element, 0, resizedArr, 0, size);
		element=resizedArr;
	}
	
	public boolean remove(E e) {		
		int index=0;
		for(int i=0;i<size;i++) {
			if(e.equals(element[i])) {
				index=i;
				break;
			}
		}	
		
		if(element!= null){
			System.arraycopy(element,index+1,element,index,size-1-index);		
			size--;
			return true;	
		}else{return false;}
	}
	
	public E get(int index) {
		try {
			checkIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return (E)element[index];
		
	}
	
	public E set(int index,E e) {
		try {
			checkIndex(index);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		
		Object obj = element[index];
		element[index]=e;
		return (E)obj;
	}
	
	private void checkIndex(int index){		
		if(index >= size) {
			throw new IndexOutOfBoundsException();
		}		
	}
}
