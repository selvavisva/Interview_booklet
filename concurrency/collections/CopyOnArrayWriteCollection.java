package com.depth.concurrency.collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayWriteCollection {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();		
		list.add("version-1");
		
		Thread reader = new Thread(() -> {			
			list.forEach(e -> {
				System.out.println(Thread.currentThread().getName()+" reading the data :: "+e);
			});
		});
		
		Thread reader2 = new Thread(() -> {			
			list.forEach(e -> {
				System.out.println(Thread.currentThread().getName()+" reading the data :: "+e);
			});
		});
		
		Thread admin = new Thread(() -> {	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {				
				e1.printStackTrace();
			}
			System.out.println("Writer updating the version");
			list.set(0, "version-2");
		});
		
		reader.start();reader.setName("Reader 1");
		reader2.start();reader2.setName("Reader 2");
		admin.start();
		
		try {
			reader.join();
			admin.join();
			
		}catch(InterruptedException exp) {
			exp.printStackTrace();
		}
		
		list.forEach(e -> {
			System.out.println("latest data value is :: "+e);
		});
		
	}

}
