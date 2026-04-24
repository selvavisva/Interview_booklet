package arrays;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		int nums[] = {10, 11, 12, 14, 15};
		int xor=0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int num:nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}		
		
		for(int i=min;i<=max;i++) {
			xor^=i;
		}
		
		for(int num:nums) {
			xor^=num;
		}
		System.out.println(xor);
	}
	
	

}
