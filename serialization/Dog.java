package com.depth.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int size;
	private String name;
	
	Dog(int size, String name){
		this.size=size;
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog(100,"Bull Dog");
		
		try {
			System.out.println("Before Write");
			System.out.println("Dog --> "+dog.name+" "+dog.size);
			FileOutputStream out = new FileOutputStream("test.ser");			
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(dog);
			
			FileInputStream in = new FileInputStream("test.ser");
			ObjectInputStream objIn = new ObjectInputStream(in);
			Dog obj2 = (Dog)objIn.readObject();
			
			System.out.println("After Write");
			System.out.println("Dog --> "+dog.name+" "+dog.size);
			
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
}
