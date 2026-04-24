package prefixsum;

public class PivotIndex {
	public static void main(String[] args) {		
		int[] input = {1, 7, 3, 6, 5, 6};		
		System.out.println(getPivotIndex(input));
	}
	
	public static int getPivotIndex(int[] input) {
		
		int rightSum=0;
		int leftSum=0;
		int totalSum=0;
		
		for(int num:input) {
			totalSum+=num;
		}
		
		for(int i=0;i<input.length;i++) {			
			rightSum=totalSum-leftSum-input[i];
			
			if(rightSum==leftSum) {
				return i;
			}
			leftSum+=input[i];
		}
		
		return -1;
		
	}
}


