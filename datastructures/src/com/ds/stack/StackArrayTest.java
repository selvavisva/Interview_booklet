package com.ds.stack;

public class StackArrayTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(11111);
		Employee e2 = new Employee(22222);
		Employee e3 = new Employee(33333);
		Employee e4 = new Employee(44444);
		Employee e5 = new Employee(55555);
		
		ArrayStack<Employee> arrStack = new ArrayStack(10);
		System.out.println("Top --> "+arrStack.size());		
		arrStack.push(e1);
		arrStack.printStack();	
		System.out.println("Top --> "+arrStack.size());		
		arrStack.push(e2);
		arrStack.printStack();	
		System.out.println("Top --> "+arrStack.size());
		arrStack.push(e3);
		arrStack.printStack();	
		System.out.println("Top --> "+arrStack.size());
		arrStack.push(e4);
		arrStack.printStack();	
		System.out.println("Top --> "+arrStack.size());
		arrStack.push(e5);
		arrStack.printStack();	
		System.out.println("Top --> "+arrStack.size());
		
		System.out.println("---- Push operation ----");
		arrStack.printStack();
		
		  System.out.println("---- Pop operation ----");
		  arrStack.pop();
		  arrStack.printStack(); System.out.println("Top --> "+arrStack.size());
		  arrStack.pop(); arrStack.printStack();
		  System.out.println("Top --> "+arrStack.size()); arrStack.pop();
		  arrStack.printStack(); System.out.println("Top --> "+arrStack.size());
		  arrStack.printStack();
		 
		System.out.println("---- Peek operation ----");		
		Employee e = (Employee)arrStack.peek();
		System.out.println(e.toString());
	}
}
