package com.depth.functionalinterface;

public class TestPredicate {
	public static void main(String[] args) {
		Validator<String> validator = input -> {			
			if(null!=input && input.length()>5) {
				return true;
			}else{
				return false;
			}
		};
		
		System.out.println(validator.validate("Trial Data for ClientId"));
	}
}
