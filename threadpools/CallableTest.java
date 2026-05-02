package com.depth.threadpools;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	
	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newCachedThreadPool();
		SumCallable sum = new SumCallable();
		Future<Integer> result = exec.submit(sum);
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("GOT Exception");
			e.printStackTrace();
		}
	}

}
