package com.depth.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {
	
	public static void main(String[] args) {
		String tradeTime = "2025-12-16 18:50:16";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime localDateTime = LocalDateTime.parse(tradeTime, formatter);
		System.out.println(localDateTime);
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getDayOfWeek());
	}

}
