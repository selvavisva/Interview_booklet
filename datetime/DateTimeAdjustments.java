package com.depth.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAdjustments {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println("Current Day --> "+dateTime);
		
		
		ZoneId requiredZone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(requiredZone);
		zonedDateTime.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));	
		
		LocalDateTime requireddata = dateTime.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next Saturday of week --> "+requireddata);
		
		Period period = Period.ofMonths(1);		
		System.out.println(period);
		System.out.println("applying period ---> "+requireddata.minus(period));
		
		Period periodDiff = Period.between(date.minus(period),date);
		
		System.out.println(periodDiff);
		
		System.out.println(ChronoUnit.DAYS.between(dateTime,requireddata));
		
		
		
	}
}