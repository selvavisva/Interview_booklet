package com.depth.functionalinterface;

public class TestSupplier {
	public static void main(String[] args) {
		RetryOperation<String> retry = () -> {
			int count=0;
			while(count<3) {
				
				if(count==2) {
					return "Connection success";
				}
				count++;
			}
			
			return "Connection failure";
		};
		
		System.out.println(retry.execute());
	}
}
