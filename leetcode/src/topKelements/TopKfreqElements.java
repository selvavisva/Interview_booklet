package topKelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfreqElements {	
	public static void main(String[] args) {
		
		int[] nums = {10,10,10,20,20,30,50,50,50,60,60,60,60};
		int k=2;
		
		System.out.println(topKFrequent(nums,k));
	}
	
	public static int[] topKFrequent(int[] nums, int k) {
	    Map<Integer, Integer> freq = new HashMap<>();
	    for (int num : nums) {
	        freq.put(num, freq.getOrDefault(num, 0) + 1);
	    }

	    PriorityQueue<Integer> heap = 
	        new PriorityQueue<>((a, b) -> Integer.compare(freq.get(a),freq.get(b)));

	    for (int num : freq.keySet()) {
	        heap.offer(num);
	        if (heap.size() > k) {
	            heap.poll();
	        }
	    }

	    int[] result = new int[k];
	    for (int i = k - 1; i >= 0; i--) {
	        result[i] = heap.poll();
	    }

	    return result;
	}

}
