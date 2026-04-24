 package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicatePrb {	
	
	public static void main(String[] args) {
		int[] arr = {1,2,8,3,5,3,6,2,4,0};
		int k = 3;
		System.out.println(isDuplicateBetweenLength(arr,k));
	}
	
	public static boolean isDuplicateBetweenLength(int[] arr, int k) {

	    Set<Integer> set = new HashSet<>();

	    for (int i = 0; i < arr.length; i++) {

	        if (set.contains(arr[i])) {
	            return true;
	        }

	        set.add(arr[i]);

	        // keep window size <= k
	        if (i >= k) {
	            set.remove(arr[i - k]);
	        }
	    }

	    return false;
	}
}