package com.depth.oops;

import java.io.IOException;

public class Horse extends Animal{
	
	@Override
	public Horse eat() throws IOException{
		System.out.println("Horse eat method");
		return new Horse();
	}
	
	public void walk() {
		super.walk();
	}
	
	public void eat(String s) {
		System.out.println("Horse eats :: "+s);
	}
	
	public static void makeSound() {
		System.out.println("Horse Sound");
	}
}
