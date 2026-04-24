package overlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time - O(n log n) [sorting - n & merging - log n].
public class MergeIntervals {
	
	public static void main(String[] args) {
		int[][] intervals = {{8,10},{15,18},{1,3},{2,6}};
		//int[][] intervals = {{2,5},{1,4},{3,6}};		
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
		
		int[] current = intervals[0];
		List<int[]> result = new ArrayList<>();
		for(int i=1;i<intervals.length;i++) {
			if(intervals[i][0] < current[1]) {
				current[1] = Math.max(current[1], intervals[i][1]);
			}else {
				result.add(current);
				current=intervals[i];				
			}
		}		
		result.add(current);
		result.toArray(new int[intervals.length][]);
		
		for(int[] arr:result) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
