package com.depth.streams;

import java.util.Arrays;
import java.util.List;

public class StreamMapPeek {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		  nums.stream().map(n -> n*n).filter(result -> result > 20).forEach(e -> {
		  System.out.println(e); });
		 
		  nums.stream().map(n -> n * n).filter(result -> result > 90).peek(e -> System.out.println(e)).count();
	}
}