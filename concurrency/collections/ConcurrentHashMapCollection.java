package com.depth.concurrency.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapCollection {	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		
		map.put("1", "Guru");
		map.put("2", "Prask");
		map.put("3", "Raj");
		map.put("4", "Moorthi");
		
		Thread t1 = new Thread(() -> {
			System.out.println(map.get("1"));
		});
		
		
		Thread t2 = new Thread(() -> {
			map.put("5", "Bishm");
		});
		
		Thread t3 = new Thread(() -> {
			map.put("1", "Kanish");			
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException exp) {
			exp.printStackTrace();
		}
	
		
		map.forEach((k,v)-> {
			System.out.println(k +" :: "+v);
		});
	}

}
