package com.depth.streams;

public class Duck implements Comparable<Duck>{
	
	private String name;
	private String color;
	private int age;	
	private String nativeOrg;
	
	public Duck(String name, String color, int age,String nativeOrg) {
		this.name=name;
		this.color=color;
		this.age=age;
		this.nativeOrg=nativeOrg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getNativeOrg() {
		return nativeOrg;
	}

	public void setNativeOrg(String nativeOrg) {
		this.nativeOrg = nativeOrg;
	}

	public String toString() {
		return "Name :: "+name+ " -- "+
				"Age :: "+age+" -- "+
				"Color :: "+color+" -- "+
				"Origin :: "+nativeOrg;
	}
	
	public int compareTo(Duck o) {
		return this.name.compareTo(o.getName());
	}
}