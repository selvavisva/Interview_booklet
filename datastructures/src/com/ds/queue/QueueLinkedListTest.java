package com.ds.queue;

public class QueueLinkedListTest {
	  public static void main(String[] args) {
			
		QueueLinkedList<Employee> queue = new QueueLinkedList<>();
		
		Employee e1 = new Employee(11111); 
		  Employee e2 = new Employee(22222);
		  Employee e3 = new Employee(33333);
		  Employee e4 = new Employee(44444);
		  Employee e5 = new Employee(55555);
		  System.out.println("-------ADD------");
		  queue.add(e1);
		  queue.add(e2);
		  queue.add(e3);
		  queue.add(e4);
		  queue.add(e5);
		  
		  System.out.println("\n---- REMOVE -----");
		  queue.remove();
		  queue.remove();
		  
		  System.out.println("\n---- PEEK -----");
		  System.out.println(queue.peek());
		  
	}
}
