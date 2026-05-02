package com.depth.threads;

public class IdentifyNumber {	
	private int maxNum;	
	private int num=1;
	
	public IdentifyNumber(int maxNum){
		this.maxNum=maxNum;
	}
	
	public synchronized void oddNums() {
		while(num<maxNum) {
			if(num%2==0) {
				try {
					wait();
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
			}
			System.out.println(num +" is odd num");
			num++;
			notify();
		}		
	}
	
	public synchronized void evenNums() {
		while(num<maxNum) {
			if(num%2!=0) {
				try {
					wait();
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
			}
			System.out.println(num +" is even num");
			num++;
			notify();
		}		
	}
}