package com.depth.functionalinterface;

public class TestFunction {
	
	public static void main(String[] args) {
		Transformer<String,Integer> transform = input -> {
			
			if(null!=input) {
				return input.length();
			}else {
				return 0;
			}
		};
		
		System.out.println(transform.transform("Trial Data"));
	}
}