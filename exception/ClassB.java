package com.depth.exception;

import java.io.IOException;

public class ClassB implements AutoCloseable{

	private String name;
	public ClassB(String name){
		this.name=name;
	}
	@Override
	public void close() throws IOException {
		System.out.println("Closeable --> "+name);
		throw new IOException("Closable --> "+name);
	}	
}
