
package com.depth.collections;

import java.util.ArrayList;

public class EqualityCheckInt {
	
	public static void main(String[] args) {
		
		  int x = 100; int y = 100;
		  
		  Integer objX = 100; Integer objY = 100;
		  
		  if(x==y) { System.out.println("X == Y"); } if(x!=y) {
		  System.out.println("X != Y"); }
		  
		  if(objX==x) { 
			  System.out.println("X == ObjX"); 
		  }
		  if(objX.equals(x)) 
		  {
			  System.out.println("X equals ObjX"); 
		  }		  
		
		  if(objX==objY) { System.out.println("Obj X and Obj Y are =="); }
		  
		  if(objX != objY) { System.out.println("Obj X and Obj Y are !="); }
		  
		  if(objX.equals(objY)) { System.out.println("Obj X and Obj Y are equals"); }
		 
		Integer i1 = 1000;
		Integer i2 = 1000;
		
		Integer i3=10;
		Integer i4=10;
		
		if(i1 != i2) {
			System.out.println("different objects");
		}
		
		if(i3==i4) {
			System.out.println("same objects");
		}
		
	}

}
