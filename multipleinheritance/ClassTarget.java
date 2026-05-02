package com.depth.multipleinheritance;

public class ClassTarget implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		
		ClassTarget target = new ClassTarget();
		target.execute();
	}

	//@Override
	public void execute() {
		
		InterfaceA.super.execute();
		InterfaceB.super.execute();
		System.out.println("Inside execute");
	}
}
