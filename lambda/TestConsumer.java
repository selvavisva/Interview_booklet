package com.depth.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class TestConsumer {	
	public static void main(String[] args) {
		
		Dog d1 = new Dog("Dobberman",3,15);
		Dog d2 = new Dog("Pomeron",4,20);
		Dog d3 = new Dog("Nattu",1,5);
		Dog d4 = new Dog("German shepard",10,25);
		Dog d5 = new Dog("Bull Dog",6,17);
		
		List<Dog> dogList = new ArrayList<>();
		
		dogList.add(d1);
		dogList.add(d2);
		dogList.add(d3);
		dogList.add(d4);
		dogList.add(d5);
		
		Consumer<Dog> dogConsumer = e -> System.out.println("Dog age is :: "+e.getAge());
		Consumer<Dog> dogBark = e -> e.bark();
		dogList.forEach(dogConsumer.andThen(dogBark));
		// or dogList.forEach(e -> System.out.println(e.getName()));		
	}
}
