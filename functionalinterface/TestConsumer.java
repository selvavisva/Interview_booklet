package com.depth.functionalinterface;

public class TestConsumer {	
	public static void main(String[] args) {
		Logger<String> errorLog = input -> {			
			if(null!=input && input.contains("Exception")) {
				System.out.println("ERROR log identified");
			}
		};
		
		errorLog.log("DB connection failure. Exception in getting connection");
	}
}
