package com.depth.oops;

import java.io.IOException;

public class RuntimePolymorphism {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal horseAnimal = new Horse();
		Horse horse = new Horse();
		
		try {
			animal.eat();
			horseAnimal.eat();
			horse.eat();
			horse.eat("barley");
			//horseAnimal.eat("barley");
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
