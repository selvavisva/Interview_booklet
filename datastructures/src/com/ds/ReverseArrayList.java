package com.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		List<String> beforeReverseList = new ArrayList<>();
		beforeReverseList.add("one");
		beforeReverseList.add("two");
		beforeReverseList.add("three");
		beforeReverseList.add("four");
		beforeReverseList.add("five");
		
		List<String> afterReverse = reverse(beforeReverseList);
		
		afterReverse.forEach(e->{
			System.out.println(e);
		});
		
		
		
		Collections.reverse(beforeReverseList);
	}
	
	
	private static List<String> reverse(List<String> l){
	
		for(int i=0,mid=(l.size()>>1),j=l.size()-1;i<mid;i++,j--) {
			l.set(i, l.set(j, l.get(i)));
		}
		
		return l;
	}	

}
