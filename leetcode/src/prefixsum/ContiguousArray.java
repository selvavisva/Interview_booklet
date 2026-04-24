package prefixsum;

import java.util.HashMap;
import java.util.Map;

//longest subarray with equal number of 0's and 1's
public class ContiguousArray {
	
	public static void main(String[] args) {
		int[] input = {0,1,0};
		int sum=0;
		int count=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,-1);
		int maxLength=0;
		for(int i=0;i<input.length;i++) {			
			sum+=input[i]==0?-1:1;			
			if(map.containsKey(sum)) {
				count++;
				maxLength=Math.max(maxLength, i-map.get(sum));
			}else {				
				map.put(sum,i);
			}
		}
		System.out.println(count);
		System.out.println(maxLength);
	}
}