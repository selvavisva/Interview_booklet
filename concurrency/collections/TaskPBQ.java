package com.depth.concurrency.collections;

public class TaskPBQ implements Comparable<TaskPBQ>{

	private int priority;	
	private String name;
	
	TaskPBQ(int priority, String name){
		this.priority=priority;
		this.name=name;
	}
	
	public int compareTo(TaskPBQ other) {
		return Integer.compare(this.priority, other.priority);
	}
	
	
	public String toString() {
		return "Name :: "+name+", Priority :: "+priority;
	}
}