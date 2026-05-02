package com.depth.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyOperations {

	public static void main(String[] args) {
		

		Path path1 = Paths.get("I:\\Interview-WS\\Java-Depth\\myFiles\\myNewFile.txt");
		Path path2 = Paths.get("I:\\Interview-WS\\Java-Depth\\myFiles2\\myNewFile.txt");

		try {
			Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES);
			//Files.delete(path2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
