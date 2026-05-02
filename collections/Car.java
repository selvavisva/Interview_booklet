package com.depth.collections;

public class Car {
	private String vechileNumber;
	private String brand;
	private String model;
	private String yearOfmake;
	private int tankCapacity;
	
	public Car(){
		
	}
	
	public Car(String vechileNumber,String brand,String model){
		this.vechileNumber=vechileNumber;
		this.brand=brand;
		this.model=model;
		
	}
		
	public boolean equals(Object obj) { 
		  if(this==obj) return true; 
		  if(!(obj instanceof Car)) return false; 
		  return (this.vechileNumber==((Car)obj).vechileNumber); 
	}	 
}
