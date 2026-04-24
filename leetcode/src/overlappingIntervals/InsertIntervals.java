package overlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time - O(n). Input should be sorted array
public class InsertIntervals {
	
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{15,18}};
		int[] newInterval = {8,10};
		int[][] result = insertIntervals(intervals,newInterval);
		
		for(int[] arr:result) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public static int[][] insertIntervals(int[][] intervals, int[] newInterval){		
		List<int[]> result = new ArrayList<>();
		int n=intervals.length;
		for(int i=0;i<n;i++) {			
			if(intervals[i][1]<newInterval[0]) {
				result.add(intervals[i]);
			}else if(newInterval[1] < intervals[i][0]) {
				result.add(newInterval);
				newInterval=intervals[i];
			}else {
				newInterval[0]=Math.min(newInterval[0], intervals[i][0]);
				newInterval[1]=Math.max(newInterval[1], intervals[i][1]);
			}
		}
		result.add(newInterval);
		return result.toArray(new int[result.size()][]);
	}
}