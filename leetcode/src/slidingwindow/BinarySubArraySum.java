package slidingwindow;

//Find number of subarrays whose sum = 2
public class BinarySubArraySum {
	
	public static void main(String[] args) {
		int[] data = {1,0,1,0,1};
		int k = 2;
		
		System.out.println(atMost(data,k) - atMost(data,k-1));
	}
	
	public static int atMost(int[] nums, int k) {
		
		int sum=0;
		int left=0;
		int count=0;
		for(int right=0;right<nums.length;right++) {
			
			sum+=nums[right];
			
			while(sum>k) {
				sum-=nums[left];
				left++;
			}
			count+=right-left+1;
		}
		return count;
		
	}

}
