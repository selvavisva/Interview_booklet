package com.depth.multipleinheritance;

public interface InterfaceB {
	default void execute() {
		System.out.println("execute InterfaceB");
	}

}
