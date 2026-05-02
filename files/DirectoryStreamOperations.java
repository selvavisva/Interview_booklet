package com.depth.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamOperations {
	
	public static void main(String[] args) {
		
		Path dir = Paths.get("C:\\Users\\selva\\OneDrive\\Desktop\\Revision_Paper\\Revision");
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir,"[E]*")){
			
			stream.forEach(path -> {
				System.out.println(path);
				System.out.println(path.getFileName());
			});
		} catch (IOException e) {
			
		}
	}

}