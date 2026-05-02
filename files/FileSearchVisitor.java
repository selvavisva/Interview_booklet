package com.depth.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class FileSearchVisitor extends SimpleFileVisitor<Path> {

	private PathMatcher matcher;
	private String searchText;
	private LocalDate localdate;
	private List<String> results;

	FileSearchVisitor(PathMatcher matcher, String searchText, List<String> results) {

		this.matcher = matcher;
		this.searchText = searchText;
		this.results = results;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		LocalDateTime cutoffTime = LocalDateTime.now().minusMonths(6);

		LocalDateTime fileTime =
		    attrs.creationTime()
		         .toInstant()
		         .atZone(ZoneId.systemDefault())
		         .toLocalDateTime();
		
		if (!matcher.matches(file.getFileName())) {
			return FileVisitResult.CONTINUE;
		}
		
		if (fileTime.isBefore(cutoffTime)) {
	        return FileVisitResult.CONTINUE;
	    }

		try (BufferedReader reader = Files.newBufferedReader(file)) {
			String line;
			while ((line = reader.readLine()) != null) {

				if (line.contains(searchText)) {
					results.add(file.getFileName().toString());
					break;
				}
			}
		}

		return FileVisitResult.CONTINUE;
	}

}
