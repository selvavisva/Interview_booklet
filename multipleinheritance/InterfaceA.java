package com.depth.multipleinheritance;

public interface InterfaceA {
	
	default void execute() {
		System.out.println("execute InterfaceA");
	}
}