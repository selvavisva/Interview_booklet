package com.depth.string.apis;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public static void main(String[] args) {
		int[] x = {1,2,2,3,4,4,5};
		int[] y = removeDuplicates(x);
		
		for(int i=0;i<y.length;i++) {
			System.out.print(y[i]);
		}
		
	}
	 public static int[] removeDuplicates(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
	 	for(int i=0;i<nums.length;i++) 
	 	{
	 		numSet.add(nums[i]);
	 	}
	 	int[] newArray = new int[numSet.size()];
	 	int index=0;
	 	for(Integer x:numSet) {
	 		newArray[index]=x;
	 		index++;	 		
	 	}
	 	return newArray;
	 }
}
