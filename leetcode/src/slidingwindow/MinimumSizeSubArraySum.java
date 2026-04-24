package slidingwindow;

import java.util.Arrays;

public class MinimumSizeSubArraySum {
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,0,3,5,0,6};
		int target = 7;
		int[] result = getMinimumSubArray(nums,target);
		System.out.println(result);
		for(int x:result) {
			System.out.print(x+" ");
		}
	}
	
	public static int[] getMinimumSubArray(int[] data, int targetSum) {		
		int windowSum=0;
		int left=0;
		int start=0;
		int minLength=Integer.MAX_VALUE;
		//int currentLength=0;
		for(int right=0;right<data.length;right++) {			
			windowSum+=data[right];			
			while(windowSum>=targetSum) {
				//currentLength=right-left+1;
				if(right-left+1 < minLength) {
					minLength=right-left+1;
					start=left;
				}
				windowSum-=data[left];				
				left++;
			}			
		}
		return Arrays.copyOfRange(data, start, start+minLength);
	}
}