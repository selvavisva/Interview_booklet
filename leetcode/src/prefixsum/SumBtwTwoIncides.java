package prefixsum;

public class SumBtwTwoIncides {
	public static void main(String[] args) {
		int[] input = {-2,0,3,-5,2,-1};	
		System.out.print("\n RESULT :: "+calculateSumBtwTwoIndices(input,2,5));
	}
	
	public static int calculateSumBtwTwoIndices(int[] input, int left, int right) {		
		int[] prefixSumArray= new int[input.length];
		prefixSumArray[0]=input[0];
		for(int k=1;k<input.length;k++) {			
			prefixSumArray[k]=prefixSumArray[k-1]+input[k];
		}
		if(left==0) {
			return prefixSumArray[right];
		}		
		return prefixSumArray[right]-prefixSumArray[left-1];
	}
}