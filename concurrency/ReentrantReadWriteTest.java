package com.depth.concurrency;

public class ReentrantReadWriteTest {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		Reader reader1 = new Reader(counter);
		Reader reader2 = new Reader(counter);
		Reader reader3 = new Reader(counter);
		
		Writer writer1 = new Writer(counter);
		Writer writer2 = new Writer(counter);
		
		Thread t1 = new Thread(reader1,"Reader 1");
		Thread t2 = new Thread(reader2, "Reader 2");
		Thread t3 = new Thread(reader3, "Reader 3");
		Thread t4 = new Thread(writer1,"Writer 1");
		Thread t5 = new Thread(writer2, "Writer 2");
				
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

				
	}

}
