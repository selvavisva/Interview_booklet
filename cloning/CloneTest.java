package com.depth.cloning;

public class CloneTest {
	
	public static void main(String[] args) {
		Address a1 = new Address("building street city pincode");
		Employee e1 = new Employee("Guru", 30,"R579860",a1);
		
		System.out.println(e1.toString());
		
		try {
			Employee e2 = (Employee) e1.clone();
			System.out.println(e2.toString());
			
			if(e1==e2) {
				System.out.println("BOTH are Equal");
			}else {
				System.out.println("Not Equal");
			}
			
			
			e2.getAddress().setFullAddress("building 2 street 2 city 2 pincode 2");
			
			System.out.println("-- After address update --");
			
			System.out.println(e1.toString());
			System.out.println(e2.toString());
			
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}
		
		
		
	}

}
