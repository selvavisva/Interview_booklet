package com.depth.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Writer2 {
	
	public static void main(String[] args) {
		Path file = Paths.get("myProps.properties");
		Path writeFile = Paths.get("write-file-2.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(writeFile)){			
			Stream<String> data = Files.lines(file);
			data.forEach(d -> {				
				try {
					writer.write(d);
					writer.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}catch(IOException exp) {
			exp.printStackTrace();
		}
	
	}

}
