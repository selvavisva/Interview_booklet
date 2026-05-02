package com.depth.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort1 {
	public static void main(String[] args) {
		List<String> listNames = new ArrayList<>();		
		listNames.add("EE");
		listNames.add("ZZ");
		listNames.add("CC");
		listNames.add("AA");
		listNames.add("HH");
		listNames.add("QQ");
		
		System.out.println(listNames);
		Collections.sort(listNames);
		System.out.println("\nAfter sorting\n");
		System.out.println(listNames);
		
	}

}
