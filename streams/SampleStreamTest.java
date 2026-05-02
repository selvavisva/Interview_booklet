package com.depth.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleStreamTest {	
	public static void main(String[] args) {
		EmployeeStream e1 = new EmployeeStream("Guru", 1000000, 35,"Bangalore");
		EmployeeStream e2 = new EmployeeStream("Raj", 95000000, 40,"Bangalore");
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
		
		
	}

}
