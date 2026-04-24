package linkedlist;

public class ReverseLinkedListII {
	
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
		LinkedNode current1 = reverseLinkedList(input,2,4);
		
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
	
	private static LinkedNode reverseLinkedList(LinkedNode head, int left, int right) {		
		
		LinkedNode prev = new LinkedNode(0);//dummy node
		LinkedNode curr=head;
		prev.next=curr;
		
		for(int i=1;i<left;i++) {
			prev=prev.next;
		}		
		curr=prev.next;
		
		for(int i=0;i<right-left;i++) {
			LinkedNode next = curr.next;
			curr.next=next.next;
			next.next=prev.next;
			prev.next=next;			
		}
		return prev;
	}

}
