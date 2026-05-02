package com.depth.collections2;

import java.util.PriorityQueue;

public class TestUsingPriorityQueue {
	public static void main(String[] args) {
		Employee e1 = new Employee("3333","CCC","150K",10);
		Employee e2 = new Employee("1111","AAA","100K",8);
		Employee e3 = new Employee("2222","BBB","120K",9);
		Employee e4= new Employee("5555","EEE","160K",12);
		Employee e5 = new Employee("4444","DDD","90K",6);
		
		PriorityQueue<Employee> queue = new PriorityQueue<>();		
		queue.offer(e1);
		queue.offer(e2);
		queue.offer(e3);
		queue.offer(e4);
		queue.offer(e5);
		
		for(int i=0;i<5;i++) {
			System.out.println(queue.poll());			
		}
	}
}