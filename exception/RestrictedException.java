package com.depth.exception;

public class RestrictedException {
	
	public static void main(String[] args) {
		try(ClassA a = new ClassA("1");
			ClassB b = new ClassB("2");){
			System.out.println("----Process----");			
			throw new RuntimeException("Main Exception");
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			for (Throwable t:exp.getSuppressed()) {
				System.out.println("suppressed :: "+t);
			}
		}
	}

}
