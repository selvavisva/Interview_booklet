package topKelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KsmallestPairs {
	
    public static void main(String[] args) {
        KsmallestPairs obj = new KsmallestPairs();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int k = 3;

        List<List<Integer>> result = obj.kSmallestPairs(nums1, nums2, k);
        System.out.println(result);
    }
    
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0)
            return result;

        // Min Heap using safe comparison
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1])
        );

        // Initialize heap with first column (j = 0)
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }

        // Extract k smallest pairs
        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] curr = minHeap.poll();

            int u = curr[0];
            int v = curr[1];
            int j = curr[2];

            result.add(Arrays.asList(u, v));

            // Move to next element in nums2 (same row)
            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{u, nums2[j + 1], j + 1});
            }
        }

        return result;
    }

}