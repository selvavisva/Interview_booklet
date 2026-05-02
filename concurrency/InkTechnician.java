package com.depth.concurrency;

public class InkTechnician implements Runnable {

	private Printer printer;
	private int cartidges;
	
	InkTechnician(Printer printer, int cartidges){
		this.printer=printer;
		this.cartidges=cartidges;
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		printer.refillInk(cartidges);
	}
}
