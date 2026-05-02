package com.depth.collections;

public class EqualityCheck {
	public static void main(String[] args) {
		Car c1= new Car("TN99N4567","Tata","Nexon");
		Car c2= new Car("TN99N4567","Tata","Nexon");
		Car c3 =c1;
		
		if(c1==c3) {
			System.out.println("C1 & C3 Cars are ==");			
		}
		if(c1.equals(c3)) {
			System.out.println("C1 & C3 Cars are .equals");
		}
		
		if(c1==c2) {
			System.out.println("C1 & C2 Cars are ==");			
		}
		if(c1.equals(c2)) {
			System.out.println("C1 & C2 Cars are .equals");
		}
		
		
		
	}
}
