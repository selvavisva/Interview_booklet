package com.depth.threadpools;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FileSearchTask extends RecursiveTask<List<Path>>{

	private Path dir;
	private String keyword;
	
	FileSearchTask(Path dir, String keyword){
		this.dir=dir;
		this.keyword=keyword;
	}
	
	public List<Path> compute(){
		
		List<FileSearchTask> tasks = new ArrayList<>();
		List<Path> results = new ArrayList<>();
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){			
			for(Path path : stream) {
				if(Files.isDirectory(path)) {
					FileSearchTask task = new FileSearchTask(dir, keyword);
					task.fork();
					tasks.add(task);					
				}else {					
					if(contentSearch(path,keyword)) {
						results.add(path);
					}
				}
			}
			
			for(FileSearchTask task:tasks) {
				results.addAll(task.join());
			}
			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return results;
		
	}
	
	
	public boolean contentSearch(Path file, String keyword) throws IOException {		
		return Files.lines(file).anyMatch(line -> line.contains(keyword));
		
	}
}
