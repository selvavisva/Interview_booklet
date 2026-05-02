package com.depth.threadpools;

import java.util.concurrent.CompletableFuture;

public class CompatableFutureTest1 {
	
	public static void main(String[] args) {
		
		CompletableFuture.supplyAsync(()->10).thenAccept(result -> System.out.println("result -> "+result));
		
		CompletableFuture.supplyAsync(() -> 10)
		.thenApply(x -> x * 10)
		.thenApply(x -> x+5)
		.thenAccept(result -> System.out.println("result :: "+result));
		
		
		CompletableFuture<Integer> c1 = CompletableFuture.supplyAsync(() -> 10);
		CompletableFuture<Integer> c2 = CompletableFuture.supplyAsync(() -> 20);
		
		c1.thenCombine(c2,Integer::sum).thenAccept(result -> {System.out.println("result "+result);});
		
		/*
		 * CompletableFuture<Integer> result = CompletableFuture.runAsync(() -> 10/0)
		 * .exceptionally(e -> System.out.println("Exception in processing :: ");)
		 */
	}

}
