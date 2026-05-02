package com.depth.properties;

import java.util.Properties;

public class TestSystemProperties {
	
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		
		properties.setProperty("key 1", "value 1");
		properties.list(System.out);
	}

}
