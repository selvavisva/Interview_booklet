package overlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EraseOverlappingIntervals {
	public static void main(String[] args) {
		int[][] intervals = {{8,10},{15,18},{1,3},{2,6},{9,13}};
		int[][] removed = getOverlappingIntervals(intervals);
		
		  for (int[] arr : removed) {
	            System.out.println(Arrays.toString(arr));
	        }
	        
	}
	
	public static int[][] getOverlappingIntervals(int[][] intervals){
		
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
		List<int[]> result = new ArrayList<>();
		int prevEnd = intervals[0][1];
		
		for(int i=1;i<intervals.length;i++) {			
			if(intervals[i][0] < prevEnd) {
				result.add(intervals[i]);
			}else {
				prevEnd = intervals[i][1];
			}
			
		}
		return result.toArray(new int[result.size()][]);
	}

}
