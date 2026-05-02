package com.depth.oops;

public class StaticExample {
		
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		
		StaticExample staticExample = new StaticExample();		
		System.out.println(Frog.getFrogCount());	
		staticExample.goCheck();
		
		Animal a = new Animal();
		Horse h = new Horse();
		Animal ah = new Horse();
		
		a.makeSound();
		h.makeSound();
		ah.makeSound();
	}
	
	public void goCheck() {
		Frog frog = new Frog();
		System.out.println(frog.getFrogCount());
	}

}
