package linkedlist;

public class ReverseLinkedList {
	public static void main(String[] args) {
	
		
		LinkedNode n1 = new LinkedNode(1);
		LinkedNode n2 = new LinkedNode(2);
		LinkedNode n3 = new LinkedNode(3);
		LinkedNode n4 = new LinkedNode(4);
		LinkedNode n5 = new LinkedNode(5);
		
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		LinkedNode current = n1;
		LinkedNode input = n1;
		
		while(current!=null) {		
			System.out.print(current.value + "-> ");
			current=current.next;
		}		
		System.out.println();
		LinkedNode current1 = reverseLinkedList(input);
		
		while(current1.next!=null) {		
			System.out.print(current1.value + "-> ");
			current1=current1.next;
		}
		System.out.print(current1.value);
	}
	
	private static class LinkedNode {		
		private int value;
		private LinkedNode next;		
		LinkedNode(int value){
			this.value=value;			
		}		
	}
	
	private static LinkedNode reverseLinkedList(LinkedNode head) {		
		LinkedNode current=head;
		LinkedNode prev=null;
		if(current==null) return head;		
		while(current!=null) {			
			LinkedNode nxt = current.next;
			current.next=prev;
			prev=current;
			current=nxt;			
		}
		return prev;
		
	}
	
}
