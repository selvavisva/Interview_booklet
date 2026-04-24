package twopointer;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] nums = {10,15,30,8,4,12,6};
		int target = 20;
		int[] result = twoSum(nums, target);
		System.out.println(result[0]+", "+result[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int left=0; 
		int right=nums.length-1;
		int sum=0;
		Arrays.sort(nums);
		System.out.println("sorted -> "+ Arrays.toString(nums));
		
		while(left < right) {			
			sum=nums[left]+nums[right];			
			if(sum==target) {
				return new int[] {left,right};				
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
			
		}
		return new int[] {-1,-1};
		
		
		
	}
}
