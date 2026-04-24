package fastandslowpointers;

import java.util.LinkedList;

public class LinkedListCycle {
	public static void main(String[] args) {
		LinkedNode n1 = new LinkedNode(10);
		LinkedNode n2 = new LinkedNode(60);
		LinkedNode n3 = new LinkedNode(20);
		LinkedNode n4 = new LinkedNode(40);
		LinkedNode n5 = new LinkedNode(35);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n3;
		
		System.out.println(hasCycle(n1));
	}
	
	
	private static class LinkedNode{
		int val;
		LinkedNode next;
		
		LinkedNode(int val){
			this.val= val;
			this.next=null;
		}
	}
	
	
	public static boolean hasCycle(LinkedNode head) {
		
		if(head==null) return false;
		
		LinkedNode slow = head;
		LinkedNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast==slow) {				
				return true;
			}
			
		}
		return false;
		
	}
}
