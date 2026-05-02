package com.depth.oops;

public class Frog {
	
private static int frogCount=0;
	
	public Frog() {
		frogCount+=1;
	}
	
	public static int getFrogCount() {
		return frogCount;
	}
}
