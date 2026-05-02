package com.depth.oops;

import java.io.IOException;

public class Animal {
	
	protected Animal eat() throws Exception{
		System.out.println("Animal eat method");
		return new Animal();
	}
	
	public void walk() {
		System.out.println("Animal walk");
	}
		
	public static void makeSound() {
		System.out.println("Animal makes Sound");
	}

}
