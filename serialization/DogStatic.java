package com.depth.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DogStatic implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	private static int count=0;
	
	//private int count=0;
	
	private String name;
	
	DogStatic(String name){
		this.name=name;
		count++;
	}
	
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public static void main(String[] args) {
		DogStatic dog1 = new DogStatic("Bull-dog");
		DogStatic dog2 = new DogStatic("German-Shephard");
		DogStatic dog3 = new DogStatic("Rajapalya-dog");
		
		System.out.println("Dogs count before serialization ---> "+dog1.getCount());
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test-static.ser"))){			
			out.writeObject(dog1);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
		//dog1.incrementCount();
		//count=100;
		//System.out.println("Increment count --> "+dog1.incrementCount());
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("test-static.ser"))){			
			DogStatic d2 = (DogStatic)in.readObject();
			System.out.println("Dogs count after serialization ---> "+d2.getCount());
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
	
	private int incrementCount() {
		
		for(int i=0;i<100;i++) {
			count++;	
		}
		return count;
		
	}

}
