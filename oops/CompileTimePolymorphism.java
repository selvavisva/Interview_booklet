package com.depth.oops;

public class CompileTimePolymorphism {
	
	public void doStuff(Animal animal) {		
		System.out.println("Animal doing stuff");
	}
	
	public void doStuff(Horse horse) {		
		System.out.println("Horse doing stuff");
		
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism c = new CompileTimePolymorphism();
		
		Animal a = new Animal();
		Horse h = new Horse();
		Animal ah = new Horse();
		
		c.doStuff(a);
		c.doStuff(h);
		c.doStuff(ah);
		
		
	}

}
