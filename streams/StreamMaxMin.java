package com.depth.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMaxMin {
	public static void main(String[] args) {
		Path path = Paths.get("I:\\Interview-WS\\Java-Depth\\myFile.txt");
		List<EmployeeStream> result = getDetailsFromFile(path);
		EmployeeStream minSalary = filterBasedOnSalary(result);
		System.out.println(minSalary);
	}
	
	public static List<EmployeeStream> getDetailsFromFile(Path filePath){
		List<EmployeeStream> empList = new ArrayList<>();
		try(Stream<String> lines = Files.lines(filePath)){
			lines.forEach(line -> {
				String[] empArray = line.split(" ");
				EmployeeStream employee = new EmployeeStream(empArray[0],Integer.valueOf(empArray[1]),
						Integer.valueOf(empArray[2]),empArray[3]);
				empList.add(employee);
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empList;
	}
	
	public static EmployeeStream filterBasedOnSalary(List<EmployeeStream> employeeList) {
		return employeeList.stream().max(Comparator.comparing(EmployeeStream::getSalary)).get();
	}
}