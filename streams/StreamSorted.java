package com.depth.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSorted {	
	public static void main(String[] args) {
			
		Comparator<Duck> ageComp = Comparator.comparing(Duck::getAge);
		Comparator<Duck> colorComp = Comparator.comparing(Duck::getColor);
		Comparator<Duck> originComp = (d1, d2) -> d1.getNativeOrg().compareTo(d2.getNativeOrg());
		
		Duck d1 = new Duck("Greeny","Green",3,"Canada");
		Duck d2 = new Duck("Mr.Whit","White",5,"India");
		Duck d3 = new Duck("Pinky","Pink",4,"Africa");
		Duck d4 = new Duck("Golden Sun","Yellow",1,"Argentina");
		Duck d5 = new Duck("Golden Goose","Yellow",2,"Mynammar");
		Duck d6 = new Duck("Golden Duck","Yellow",3,"Poland");
		Duck d7 = new Duck("Blue ray","Purple",6,"China");
		Duck d8 = new Duck("Blue Goose","Purple",7,"US");
		Duck d9 = new Duck("Blue Duck","Purple",4,"Newzeland");
		Duck d10 = new Duck("Blue swan","Purple",5,"Germany");
		
		List<Duck> ducks = new ArrayList<>();
		
		ducks.add(d1);
		ducks.add(d2);
		ducks.add(d3);
		ducks.add(d4);
		ducks.add(d5);
		ducks.add(d6);
		ducks.add(d7);
		ducks.add(d8);
		ducks.add(d9);
		ducks.add(d10);
		
		System.out.println("---- NAME sorted -----");
		ducks.stream().sorted().forEach(e-> {System.out.println(e.toString());});
		
		System.out.println("\n---- AGE sorted -----");
		ducks.stream().sorted(ageComp).forEach(e-> {System.out.println(e.toString());});
		
		System.out.println("\n---- COLOR sorted -----");
		ducks.stream().sorted(colorComp).forEach(e-> {System.out.println(e.toString());});
		
		System.out.println("\n---- COLOR reversed -----");
		ducks.stream().sorted(colorComp.reversed()).forEach(e-> {System.out.println(e.toString());});
		
		System.out.println("\n ---- ORIGIN sorted ----");
		ducks.stream().sorted(originComp).forEach(e->{System.out.println(e.toString());});
		
		System.out.println("\n ---- ORIGIN & COLOR sorted ----");
		ducks.stream().sorted(colorComp.thenComparing(ageComp)).forEach(e->{System.out.println(e.toString());});
		
	}
}