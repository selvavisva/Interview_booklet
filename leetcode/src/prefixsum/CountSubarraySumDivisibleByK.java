package prefixsum;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumDivisibleByK {
	
	public static void main(String[] args) {
		int[] nums = {4,5,0,-2,-3,1};
		int k = 5;
				
		System.out.println(subArrayDivisibleByK(nums, k));
	}
	
	public static int subArrayDivisibleByK(int[] input, int k) {
		
		int sum=0;
		int remainder=0;
		int count=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int num:input) {
			sum+=num;
			
			remainder=sum%k;
			if(remainder<0) {remainder+=k;}
			if(map.containsKey(remainder)) {
				count+=map.get(remainder);
			}
			
			map.put(remainder, map.getOrDefault(remainder, 0)+1);
		}
		return count;
	}
}
