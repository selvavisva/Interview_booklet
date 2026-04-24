package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllMissingNumbers {
	
	public static void main(String[] args) {
		int nums[] = {10, 11, 12, 15};
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int num:nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);	
			set.add(num);
		}		
		
		for(int i=min;i<=max;i++) {
			if(!set.contains(i)) {
				list.add(i);
			}			
		}
		
		list.toArray();
		
	}

}
