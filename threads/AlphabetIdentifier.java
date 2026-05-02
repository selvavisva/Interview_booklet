package com.depth.threads;

public class AlphabetIdentifier {
	
	int counter=0;
	private int max;
	
	public AlphabetIdentifier(int max) {
		this.max=max;
	}
	
	public synchronized void print(char alphabet, int remainder) {		
		while(counter < max) {			
			while(counter%3!=remainder) {
				try {
					System.out.println("Entering wait state :: alphabet :: "+alphabet+ " :: remainder :: "+remainder);
					wait();
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
			System.out.println(alphabet);
			counter++;
			notifyAll();			
		}
	}

}
