package com.depth.threads;

public class DeadlockRisk {	
	private static class Resource{
		int value;
	}	
	private Resource resourceA = new Resource();	
	private Resource resourceB = new Resource();
	
	public int read() {		
		synchronized(resourceA){
			synchronized(resourceB) {
				return resourceA.value+resourceB.value;
			}
		}
	}
	
	public void write (int a, int b) {
		synchronized(resourceB) {
			synchronized(resourceA) {
				resourceA.value=a;
				resourceB.value=b;
			}			
		}
	}
}