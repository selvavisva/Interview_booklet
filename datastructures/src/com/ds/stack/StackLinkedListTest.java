package com.ds.stack;

public class StackLinkedListTest {
	public static void main(String[] args) {
		
		  StackLinkedList<Employee> stack = new StackLinkedList<>();
		  
		  Employee e1 = new Employee(11111); 
		  Employee e2 = new Employee(22222);
		  Employee e3 = new Employee(33333);
		  Employee e4 = new Employee(44444);
		  Employee e5 = new Employee(55555);
		  
		  System.out.println("---- Push operation ----");
		  
		  stack.push(e1); 
		  stack.push(e2); 
		  stack.push(e3); 
		  stack.push(e4);
		  stack.push(e5);
		  System.out.println(""); 
		//  stack.printStack();
		  System.out.println("\n\n---- Pop operation ----");
		  
		  stack.pop(); 
		  stack.pop(); 
		 
		  System.out.println(stack.peek());
		
	}
}
