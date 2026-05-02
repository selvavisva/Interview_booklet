package com.depth.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//USING CUSTOM SERIALIZATION
public class Elephant extends Animal implements Serializable{	
	
	private static final long serialVersionUID=1L;
	private int size;
	private transient Tracker tracker;
	
	Elephant(int size, Tracker tracker){		
		super("WILD"); // For serialization the superclass must have no-args constructor
		this.size=size;
		this.tracker=tracker;
		
	}
	
	private void readObject(ObjectInputStream in) {
		try {			
			in.defaultReadObject();
			tracker = new Tracker(in.readInt(), in.readUTF());			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	private void writeObject(ObjectOutputStream out) {
		try {			
			out.defaultWriteObject();
			out.writeInt(tracker.getDeviceDuration());
			out.writeUTF(tracker.getStatus());	
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	public static void main(String[] args) {		
		Tracker tracker = new Tracker(120,"Completed");
		Elephant elephant = new Elephant(1000,tracker);		
		elephant.setType("WILD");
		
		try {
			System.out.println("Before");
			System.out.println(elephant.getType());
			System.out.println(elephant.size);
			System.out.println(elephant.tracker.getDeviceDuration());
			
			FileOutputStream out = new FileOutputStream("test-3.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(elephant);
			
			
			FileInputStream in = new FileInputStream("test-3.ser");
			ObjectInputStream inObj = new ObjectInputStream(in);
			
			Elephant elephant2 = (Elephant)inObj.readObject();
			
			System.out.println("After");
			System.out.println(elephant2.getType());
			System.out.println(elephant2.size);
			System.out.println(elephant2.tracker.getDeviceDuration());
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
	
}
