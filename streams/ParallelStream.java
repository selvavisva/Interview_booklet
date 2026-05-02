package com.depth.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = nums.stream().parallel().mapToInt(n->n).sum();
		System.out.println(sum);
	}
}
