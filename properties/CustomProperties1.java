package com.depth.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CustomProperties1 {	
	public static void main(String[] args) {		
		Properties prop = new Properties();
		prop.setProperty("Key 1", "Value 1");
		prop.setProperty("Key 2", "Value 2");
		prop.setProperty("Key 3", "Value 3");
		
		try {
			FileOutputStream fout = new FileOutputStream("myprops.properties");
			prop.store(fout, "List of properties");
			fout.close();
		}catch(IOException exp) {
			exp.printStackTrace();
		}		
	}
}