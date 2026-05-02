package com.depth.cloning;

public class ConstructorCloningTest {
	public static void main(String[] args) {
		Address2 address2 = new Address2("ADDRESS");
		Employee2 e = new Employee2("Guru",39,address2);
		Employee2 e2 = e.clone();
		System.out.println(e);
		System.out.println(e2);
	}
}
