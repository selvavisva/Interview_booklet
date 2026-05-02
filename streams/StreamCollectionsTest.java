package com.depth.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCollectionsTest {
	public static void main(String[] args) {			
		EmployeeStream e1 = new EmployeeStream("Guru", 1000000, 35,"Bangalore");
		EmployeeStream e2 = new EmployeeStream("Raj", 1900000, 40,"Bangalore");
		EmployeeStream e3 = new EmployeeStream("Ramu", 1100000, 35,"Hyderabad");
		EmployeeStream e4 = new EmployeeStream("Menau", 9000000, 34,"Mumbai");		
		EmployeeStream e5 = new EmployeeStream("Yashuyt", 1400000, 40,"Singapore");		
		EmployeeStream e6 = new EmployeeStream("Somnash", 8000000, 29,"Hyderabad");
		EmployeeStream e7 = new EmployeeStream("Pyushtor", 7000000, 34,"Mumbai");
		EmployeeStream e8 = new EmployeeStream("Farshut", 11022000, 35,"Singapore");
		
		List<EmployeeStream> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		
		
		List<EmployeeStream> filteredByAge = empList.stream().filter(emp -> emp.getAge()>35).collect(Collectors.toList());
		
		Map<Integer, List<EmployeeStream>> grpByAge = empList.stream().collect(
				Collectors.groupingBy(EmployeeStream::getAge));
		
		Map<Integer, Long> grpByAgeCount = empList.stream().collect(Collectors.groupingBy(
				EmployeeStream::getAge, Collectors.counting()));
		
		String persons = empList.stream().filter(emp -> emp.getAge() > 35)
				.map(EmployeeStream::getName)
				.collect(Collectors.joining(","));
		
		Map<Integer, List<String>> grpByAgeEmploees = empList.stream().collect(Collectors.groupingBy(EmployeeStream::getAge, 
				Collectors.mapping(EmployeeStream::getName, Collectors.toList())));
		
		Map<Boolean, List<EmployeeStream>> empPartitionList = empList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 35));
				
		Map<String, EmployeeStream> maxSalaryByLoc = empList.stream().collect(
				Collectors.groupingBy((EmployeeStream::getLocation),
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(EmployeeStream::getSalary)), 
								Optional::get)));
		
		
		Map<String,Double> sumByLoc = empList.stream().collect(
				Collectors.groupingBy((EmployeeStream::getLocation),
						Collectors.summingDouble(EmployeeStream::getSalary)));
		
		Map<String,Double> avgLoc = empList.stream().collect(
				Collectors.groupingBy((EmployeeStream::getLocation), 
						Collectors.averagingDouble(EmployeeStream::getSalary)));
		
		Map<String, DoubleSummaryStatistics> result = empList.stream().collect(
				Collectors.groupingBy((EmployeeStream::getLocation),
						Collectors.summarizingDouble(EmployeeStream::getSalary)
						));
		
		
		result.forEach((k,v) -> {
			System.out.println("Location ---> "+k);
			System.out.println(v.getMin());
			System.out.println(v.getMax());
			System.out.println(v.getAverage());
			System.out.println(v.getSum());
			System.out.println("--------------");
			
		});
		System.out.println("\n--------summing double------");
		System.out.println(sumByLoc);
		System.out.println("\n---------averaging double--------");
		System.out.println(avgLoc);
		System.out.println("\n ------- Filter by Age ------");
		System.out.println(filteredByAge);
		System.out.println("\n ------- Group by Age ------");
		System.out.println(grpByAge);
		System.out.println("\n ------- Group by Age Count ------");
		System.out.println(grpByAgeCount);
		System.out.println("\n ------- Persons age conditional based joining ------");
		System.out.println(persons);
		System.out.println("\n ------- Group by Age Employees ------");
		System.out.println(grpByAgeEmploees);
		System.out.println("\n ------- Employee Partition ------");
		System.out.println(empPartitionList);
		System.out.println("\n ------- Salary Group By Loc ------");
		System.out.println(maxSalaryByLoc);
	}
}
