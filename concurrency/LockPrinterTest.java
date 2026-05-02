package com.depth.concurrency;

public class LockPrinterTest {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		User user1 = new User(printer, "Guru");
		User user2 = new User(printer, "Ram");
		
		PaperTechnician technician1 = new PaperTechnician(printer, 10);
		
		InkTechnician technician2 = new InkTechnician(printer,20);
		
		Thread t1 = new Thread(user1);
		Thread t2 = new Thread(user2);
		
		Thread t3 = new Thread(technician1);
		Thread t4 = new Thread(technician2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}