package com.depth.threadpools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	public static void main(String[] args) {
		
		//Executor exec = Executors.newCachedThreadPool();
		//Executor exec = Executors.newSingleThreadExecutor();
		Executor exec = Executors.newFixedThreadPool(10);
		
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		execService.execute(() -> {
			System.out.println(Thread.currentThread().getName()+ " processing");
		});
		
		exec.execute(() -> {
			System.out.println(Thread.currentThread().getName()+ " processing");
		});
		exec.execute(() -> {
			System.out.println(Thread.currentThread().getName()+ " processing");
		});
		exec.execute(() -> {
			System.out.println(Thread.currentThread().getName()+ " processing");
		});
		
		
	}

}
