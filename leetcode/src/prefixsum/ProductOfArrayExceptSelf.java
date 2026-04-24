package prefixsum;

public class ProductOfArrayExceptSelf {
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4};
		int[] result = getArrayProductExceptSelf(num);
		
		for(int data:result) {
			System.out.print(data+" ");
		}
	}
	
	public static int[] getArrayProductExceptSelf(int[] num) {
		
		int res[] = new int [num.length];
		res[0]=1;
		for(int i=1;i<num.length;i++) {			
			res[i]=res[i-1]*num[i-1];
		}		
		
		int right=1;
		for(int i=num.length-1;i>=0;i--) {
			res[i]*=right;
			right*=num[i];
		}
		
		return res;
	}
}