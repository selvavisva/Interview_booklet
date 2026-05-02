package com.depth.concurrency;

public class PaperTechnician implements Runnable{

	private Printer printer;
	private int sheets;
	
	PaperTechnician(Printer printer, int sheets){
		this.printer=printer;
		this.sheets=sheets;
	}
	public void run() {
		printer.refillPaper(sheets);
	}
}
