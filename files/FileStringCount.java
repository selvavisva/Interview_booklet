package com.depth.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FileStringCount {
	public static void main(String[] args) {
		Path path = Paths.get("myFile-path1.txt");	
		
		
		try(Stream<String> lines = Files.lines(path)){			
			AtomicInteger counter= new AtomicInteger(0);
			lines.forEach(line -> {				
				String[] arr = line.split(" ");				
				for(int i=0;i<arr.length;i++) {
					if(arr[i].equalsIgnoreCase("GOOD")) {
						counter.incrementAndGet();
					}
				}
			});
			System.out.println("Total occurence of GOOD :: "+counter);
		}catch(IOException exp) {
			exp.printStackTrace();
		}
		
		
		try(BufferedReader reader = Files.newBufferedReader(path)){
			int count=0;
			String line;
			while((line = reader.readLine())!=null) {
				String[] arr = line.split(" ");				
				for(int i=0;i<arr.length;i++) {
					if(arr[i].equalsIgnoreCase("GOOD")) {
						count++;
					}
				}
			}
			System.out.println("Total occurence of GOOD :: "+count);
			
		}catch(IOException exp) {
			exp.printStackTrace();
		}
		
		long countWords = 0;
		try(Stream<String> lines = Files.lines(path)){			
			countWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
			.filter(word -> word.equalsIgnoreCase("GOOD"))
			.count();
		}catch(IOException exp) {
			exp.printStackTrace();			
		}
		System.out.println(countWords);
	}
}
