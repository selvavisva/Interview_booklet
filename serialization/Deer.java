package com.depth.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deer implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	private static int size;
	
	private transient Tracker tracker;
	
	public Deer(int size, Tracker tracker) {
		this.size =size;
		this.tracker = tracker;
	}
	
	private void readObject(ObjectInputStream in) {
		try {
			in.defaultReadObject();
			this.tracker = new Tracker(in.readInt(),in.readUTF());
			
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
		Tracker tracker = new Tracker(365,"Completed");
		Deer deer = new Deer(200,tracker);
		
		try {
			
			System.out.println("BEFORE");
			System.out.println("Deer 1 -> "+ deer.size + " Tracker Duration "+deer.tracker.getDeviceDuration());
			
			
			FileOutputStream out = new FileOutputStream("test-deer.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(deer);
			objOut.close();
			
			FileInputStream in = new FileInputStream("test-deer.ser");
			ObjectInputStream inObj = new ObjectInputStream(in);
			Deer deer2 = (Deer)inObj.readObject();
			
			System.out.println("AFTER");
			System.out.println("Deer 2 -> "+ deer2.size + " Tracker Duration "+ deer2.tracker.getDeviceDuration());
			
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}

}
