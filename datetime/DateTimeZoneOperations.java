package com.depth.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTimeZoneOperations {
	
	public static void main(String[] args) {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		
		zoneIds.forEach(zone -> {
			if(zone.contains("US")) {
				System.out.println(zone);
			}
		});
		
		ZoneId requiredZone = ZoneId.of("US/Eastern");
		ZonedDateTime.now(requiredZone);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime eclipseTimeIndia = LocalDateTime.parse("2027-10-02 16:20:09",formatter);
		System.out.println("eclipse Time in India --> "+eclipseTimeIndia);
		ZonedDateTime eclipseTimeUSEastern = ZonedDateTime.of(eclipseTimeIndia, requiredZone);
		System.out.println("eclipse Time in US Eastern --> "+eclipseTimeUSEastern);
		boolean daylightsavings = requiredZone.getRules().isDaylightSavings(eclipseTimeUSEastern.toInstant());
		System.out.println("Day light savings --> "+daylightsavings);
	}
}