package com.ds.sort.algorithms;

public class Search {
	
	public static void main(String[] args) {
		//int[] nums = {40, 50, 60, 10, 20, 30};
		//int[] nums = {30, 40, 50, 60, 10, 20};
		//int[] nums = {20, 30, 40, 50, 60, 10};
		int[] nums = {50, 60, 10, 20, 30,40};
		int target = 20;
		System.out.println(search(nums, target));
	}
	public static int search(int[] nums, int target) {
	    int left = 0, right = nums.length - 1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (nums[mid] == target) return mid;

	        // Left half sorted
	        if (nums[left] <= nums[mid]) {
	            if (nums[left] <= target && target < nums[mid]) {
	            	System.out.println("---- 1st condition - IF----");
	                right = mid - 1;
	            } else {
	            	System.out.println("---- 1st condition -  else----");
	                left = mid + 1;
	            }
	        }
	        // Right half sorted
	        else {
	            if (nums[mid] < target && target <= nums[right]) {
	            	System.out.println("---- 2nd condition - IF----");
	                left = mid + 1;
	            } else {
	            	System.out.println("---- 2nd condition - else----");
	                right = mid - 1;
	            }
	        }
	    }

	    return -1;
	}
}
