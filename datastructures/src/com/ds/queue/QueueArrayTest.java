package com.ds.queue;

public class QueueArrayTest {	
	public static void main(String[] args) {
		int[] x = new int[10];
		QueueArray queue = new QueueArray(10);
		Employee e1 = new Employee(11111);
		Employee e2 = new Employee(22222);
		Employee e3 = new Employee(33333);
		Employee e4 = new Employee(44444);
		Employee e5 = new Employee(55555);
		
		queue.add(e1);
		queue.add(e2);
		queue.add(e3);
		queue.add(e4);
		queue.add(e5);
		
		System.out.println("---- ADD ----");
		queue.printQueue();
		System.out.println("---- REMOVE ----");
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.printQueue();
	}
}
