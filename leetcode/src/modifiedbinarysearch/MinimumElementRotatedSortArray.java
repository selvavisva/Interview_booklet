package modifiedbinarysearch;

public class MinimumElementRotatedSortArray {
	
	public static void main(String[] args) {
		int[] nums = {40, 50, 60, 70, 10, 20, 30};		
		System.out.println(min(nums));
	}
	
	public static int min(int[] nums) {
		
		int left=0;
		int right = nums.length-1;
		
		while(left<right) {
			int mid = left+(right-left)/2;			
			if(nums[mid]>nums[right]) {
				left=mid+1;				
			}else {
				right=mid;
			}
		}
		return nums[left];
	}

}
