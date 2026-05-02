package com.depth.concurrency;

public class User implements  Runnable{

	private Printer printer;
	private String name;
	
	User(Printer printer, String name){
		this.printer=printer;
		this.name=name;
	}
	
	public void run() {
		printer.print(name);
	}
}
