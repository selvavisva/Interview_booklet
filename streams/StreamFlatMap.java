package com.depth.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMap {
	
	public static void main(String[] args) {
		try(Stream<String> lines = Files.lines(Paths.get("I:\\Interview-WS\\Java-Depth\\myFiles\\stream-test.txt"))){
			long result = lines.
					map(line -> line.split(" ")).
					flatMap(arrays -> Arrays.stream(arrays)).
					filter(w->w.contains("Java")).count();
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
