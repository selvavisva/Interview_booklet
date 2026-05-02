package com.depth.streams;

import java.util.HashMap;
import java.util.Map;

public class StreamTest2 {
	public static void main(String[] args) {
		Map<String, Integer> employeeMap = new HashMap<>();
		employeeMap.put("Guru",40);
		employeeMap.put("Raj",30);
		employeeMap.put("Dindu",42);
		employeeMap.put("Sasthiti",38);
		employeeMap.put("Manok",28);
		employeeMap.put("Abhisl",35);
		
		employeeMap.entrySet().stream().filter(d -> d.getValue() > 35).forEach(e -> {
			System.out.println(e);
		});
		
	}
}
