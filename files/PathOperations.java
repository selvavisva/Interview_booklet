package com.depth.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperations {
	
	public static void main(String[] args) {		
		Path path = Paths.get("myFile-path2.txt");		
	  try {		  
		  if(!Files.exists(path)) { Files.createFile(path); }else {
		  System.out.println("File already exist"); }		  
	  	} catch (IOException e) { e.printStackTrace(); 
	  	}
	 
		
	}

}
