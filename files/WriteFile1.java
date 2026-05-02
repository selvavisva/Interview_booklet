package com.depth.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile1 {	
	public static void main(String[] args) {
			
		Path path = Path.of("I:\\Interview-WS\\Java-Depth\\write-file.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path)){
			writer.write("Created new file with data");			
		}catch(IOException exp) {
			exp.printStackTrace();			
		}
	}
}
