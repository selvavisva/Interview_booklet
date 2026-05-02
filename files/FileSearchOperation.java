package com.depth.files;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileSearchOperation {
	
	public static void main(String[] args) {
		Path dir = Paths.get("C:\\Users\\Public\\logs");
		
		PathMatcher matcher1 = FileSystems.getDefault().getPathMatcher("glob:*error*");
				
		List<String> matchedFiles = new ArrayList<>();
		
		FileSearchVisitor visitor = new FileSearchVisitor(matcher1, "EXCEPTION", matchedFiles);
		
		try {
			Files.walkFileTree(dir, visitor);
			matchedFiles.forEach(fileName -> {
				System.out.println(fileName);	
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}