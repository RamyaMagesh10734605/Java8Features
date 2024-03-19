package datetimeexample;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		time = LocalTime.of(12, 20); //hour:Min
		System.out.println(time);
		 
		time = LocalTime.of(12, 20,20); //hour:Min:sec
		System.out.println(time);

		time = LocalTime.of(12, 20,20,293333); //hour:Min::nanosec
		System.out.println(time);
		
		//GET
		System.out.println(time.get(ChronoField.MINUTE_OF_DAY)); //740
		System.out.println(time.getHour()); //12
		System.out.println(time.getLong(ChronoField.MINUTE_OF_DAY)); //740
		System.out.println(time.getMinute()); //20
		System.out.println(time.getNano()); //293333
		System.out.println(time.getSecond()); //20
		//with
		System.out.println(time.withHour(5)); 
		System.out.println(time.withMinute(5)); 
		System.out.println(time.withNano(5)); 
		System.out.println(time.withSecond(5)); 
		System.out.println(time.with(ChronoField.HOUR_OF_DAY,4)); 
		System.out.println(time.with(LocalTime.MIDNIGHT)); 
		//tosecondofDay - returns in second
		System.out.println(time.toSecondOfDay()); 
		//minus
		System.out.println(time.minus(5,ChronoUnit.HOURS)); 
		System.out.println(time.minusHours(5)); 
		System.out.println(time.minusMinutes(10)); 
		System.out.println(time.minusNanos(5)); 
		System.out.println(time.minusSeconds(5));
		//plus
		System.out.println(time.plus(5,ChronoUnit.HOURS)); 
		System.out.println(time.plusHours(5)); 
		System.out.println(time.plusMinutes(10)); 
		System.out.println(time.plusNanos(5)); 
		System.out.println(time.plusSeconds(5));
		//to
		System.out.println(time.toNanoOfDay()); 
		System.out.println(time.toSecondOfDay()); 
 
		//is
		System.out.println(time.isAfter(time));
		System.out.println(time.isBefore(time));
		System.out.println(time.isSupported(ChronoField.DAY_OF_MONTH));

		
		
		
		
		
	}

}
