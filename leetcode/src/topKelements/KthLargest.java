package topKelements;

import java.util.PriorityQueue;

public class KthLargest {
	 public static void main(String[] args) {
	        int[] nums = {3,2,1,5,6,4};
	        int k = 2;

	        System.out.println(findKthLargest(nums, k));
	    }
	 
	 public static int findKthLargest(int[] nums, int k) {
		 
		 PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
		 for(int num:nums) {
			 maxHeap.offer(num);			 
			 if(maxHeap.size()>k) {				 
				 maxHeap.poll();
			 }			 
		 }
		 
		 return maxHeap.peek();
		 
	 }
}
