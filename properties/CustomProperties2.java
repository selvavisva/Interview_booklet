package com.depth.properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class CustomProperties2 {
	public static void main(String[] args) {
		
		Properties prop2 = new Properties();
		try {
			FileInputStream inputStream = new FileInputStream("myprops.properties");
			prop2.load(inputStream);			
			prop2.setProperty("New Key 1", "New Value 1");
			inputStream.close();
			prop2.list(System.out);
			
			FileOutputStream outStream = new FileOutputStream("myprops.properties");
			prop2.store(outStream,"---- Update entries ---");
			outStream.close();
			
			
		}catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}

}
