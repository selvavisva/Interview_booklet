package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int target = 0;
		threeSumArray(nums,target);
	}
	
	public static List<List<Integer>> threeSumArray(int[] nums, int target){
		Arrays.sort(nums);
		int sum=0;
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<nums.length-2;i++) {
			int left=i+1;
			int right=nums.length-1;  		
			
			if(i>0 && nums[i]==nums[i-1]) continue;
			
			while(left<right) {	
				sum=nums[i]+nums[left]+nums[right];
				if(sum==target) {
					result.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while(left > right && nums[left]==nums[left+1]) continue;
					while(left > right && nums[right]==nums[right-1]) continue;
					
					left++;
					right--;
				}else if(sum<target) {
					left++;
				}else {
					right--;
				}
			}
			
		}
			return result;
	}	
}