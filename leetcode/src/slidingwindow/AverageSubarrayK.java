package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class AverageSubarrayK {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 6, 1, 4, 1, 8, 2};
		int k=5;
		double[] result = getAverageSubArray2(arr,k);
		
		for (double x:result) {
			System.out.print(x+" ");
		}
	}
	
	public static double[] getAverageSubArrayK(int[] arr, int k)
	{		
		int windowSum=0;
		double avg=0;
		List<Double> avgSumList = new ArrayList<>();
		for(int i=0;i<k;i++) {
			windowSum+=arr[i];
		}
		avg=(double)windowSum/k;
		avgSumList.add(avg);
		for(int i=k;i<arr.length;i++) {
			windowSum=windowSum+arr[i]-arr[i-k];		
			avg=(double)windowSum/k;		
			avgSumList.add(avg);
		}
		return avgSumList.stream().mapToDouble(Double::doubleValue).toArray();
	}
	
	public static double[] getAverageSubArray2(int[] arr, int k)
	{		
		int windowSum=0;
		double avg=0;
		
		double[] result = new double[arr.length-k+1];
		for(int i=0;i<k;i++) {
			windowSum+=arr[i];
		}		
		avg=(double)windowSum/k;		
		result[0]=avg;
		for(int i=k;i<arr.length;i++) {
			windowSum=windowSum+arr[i]-arr[i-k];			
			avg=(double)windowSum/k;			
			result[i-k+1]=avg;
		}
		return result;
	}

}
