package com.depth.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;

public class FileWatcherService {	
	public static void main(String[] args) {		
		Path path = Paths.get("C:\\Users\\Public\\logs\\app1");		
		try {
			WatchService watcher = FileSystems.getDefault().newWatchService();
			path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
			while(true) {
				WatchKey key;				
				try {
					key = watcher.take();
				} catch (InterruptedException e) {					
					return;
				}			
								
				for(WatchEvent<?> event:key.pollEvents()) {
					
					Kind<?> kind = event.kind();
					System.out.println(kind.name());
					System.out.println(kind.type());
					String name = event.context().toString();
					if(name.contains("daily_report")) {
						System.out.println("GOT THE FILE");
						break;
					}				
					
				}
				key.reset();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
