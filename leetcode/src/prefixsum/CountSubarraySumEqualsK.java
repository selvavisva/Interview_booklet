package prefixsum;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualsK {
	public static void main(String[] args) {
		
		int[] input = {1,2,3};
		int k=3;
		
		System.out.println(getCount(input,k));
		
	}

	
	public static int getCount(int[] input, int k) {		
		int count=0;
		int sum=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int num:input) {
			sum+=num;				
			if(map.containsKey(sum-k)) {
				count+=map.get(sum-k);
			}	
			map.put(sum, map.getOrDefault(sum, 0)+1);			
		}
		return count;
	}
}