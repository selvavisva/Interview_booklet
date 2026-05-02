package com.depth.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeOperations {
	
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	
	LocalDateTime.now();
	
	LocalDateTime localdatetime = LocalDateTime.of(date, time);
		
	System.out.println(LocalDateTime.now());
	System.out.println(localdatetime);
	
	LocalDate date1 = LocalDate.of(2025, 12, 18);
	LocalDate date2 = LocalDate.parse("2025-12-18");
	
	System.out.println("without parse  ---> "+ date1);
	System.out.println("with parse  ---> "+ date2);
	
	LocalTime time1 = LocalTime.of(20, 30, 15);
	LocalTime time2 = LocalTime.parse("20:30:15");
	
	System.out.println("Without parse time --> "+time1);
	System.out.println("with parse time --> "+time2);	
	
	}	

}
