package prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraySum {
	
	//There exists a subarray of size >= 2 whose sum is divisible by k
	public static void main(String[] args) {
		int[] input = {23, 2, 6, 4, 7};
		int k=2;
		System.out.println(continuousSubArraySum(input,k));
	}
		
	
	public static boolean continuousSubArraySum(int[] input, int k) {
		int sum=0;
		int remainder=0;
		int count=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		
		for(int i=0;i<input.length;i++) {
			sum+=input[i];
			remainder = sum%k;
			
			if(map.containsKey(remainder)) {
				int prev = map.get(remainder);
				if (i-prev >= k) {
					count++;
					//return true;
				}
				
			}else {
				
				map.put(remainder, i);
			}
		}
		System.out.println(count);
		return false;
	}

}
