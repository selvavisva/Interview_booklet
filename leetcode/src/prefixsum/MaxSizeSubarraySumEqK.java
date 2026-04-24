package prefixsum;

import java.util.HashMap;
import java.util.Map;

public class MaxSizeSubarraySumEqK {
	public static void main(String[] args) {
		int[] input = {1, -1, 5, -2, 3};
		int k=3;
		System.out.println(getMaxSizeSubArraySum(input,k));
	}
	
	public static int getMaxSizeSubArraySum(int[] input, int k) {
		
		int sum=0;
		int max=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		for(int i=0;i<input.length;i++) {			
			sum+=input[i];
			
			if(map.containsKey(sum-k)) {
				int prevIndex = map.get(sum-k);
				max = Math.max(max, i-prevIndex);				
			}
			
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			
		}
		
		return max;
	}
}