package com.depth.serialization;

import java.io.Serializable;

public class Collar implements Serializable{
	
	private static final long serialVerionUID=1L;
	private int collarSize;
	
	Collar(int collarSize){
		this.collarSize=collarSize;
	}

	public int getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}
	
	
}
