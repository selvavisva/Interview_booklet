package com.depth.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList("AAAAAAAAAA","BBB","CCCCCCCCCCC","DDD","EEEE","FFFFFFFFF","GGGGGGGGGGGGGGGGGGGG");
		System.out.println(strs.stream().reduce((e1,e2) -> e1.length() > e2.length() ? e1:e2).get());
	}
}