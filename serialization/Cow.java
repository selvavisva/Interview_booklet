package com.depth.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cow implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//private transient Collar collar;
	private Collar collar;
	private String name;
	private int size;

	Cow(int size, String name, Collar collar){
		this.size=size;
		this.name=name;
		this.collar = collar;
	}
	
	public static void main(String[] args) {
		Collar collar = new Collar(10);
		
		Cow cow = new Cow(100, "Nattu",collar);
		
		try {
			System.out.println("Collar size after");
			System.out.println(cow.collar.getCollarSize());
			
			FileOutputStream out = new FileOutputStream("test2.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(cow);
			objOut.close();
			out.close();
			
			FileInputStream in = new FileInputStream("test2.ser");
			ObjectInputStream inObj = new ObjectInputStream(in);
			Cow cow2 = (Cow)inObj.readObject();
			
			inObj.close();
			in.close();
			
			System.out.println("Collar size after");
			System.out.println(cow2.collar.getCollarSize());
			
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
}