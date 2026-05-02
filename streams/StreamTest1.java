package com.depth.streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {
	public static void main(String[] args) {
		List<Double>  tempReadings = Arrays.asList(100.12,150.20,130.48,90.89,79.30,40.39,90.30);		
		tempReadings.stream().filter(r -> r>100).forEach(e-> {
			System.out.println(e);
		});
		
		long result = tempReadings.stream().filter(n -> n >100).count();
		System.out.println(result);
	}
}