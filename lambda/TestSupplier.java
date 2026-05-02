package com.depth.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSupplier {
	public static void main(String[] args) {
		Map<String, List<String>> cache = new HashMap<>();
		
		cache.computeIfAbsent("IT", k -> new ArrayList()).add("Ram");
		
		System.out.println(cache);
	}
}
