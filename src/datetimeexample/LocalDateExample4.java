package datetimeexample;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

 /*
  * LocalDAte instances are immutable. Cannot be changed.
  */
public class LocalDateExample4 {

	public static void main(String[] args) {
		
	 	LocalDate date = LocalDate.ofYearDay(2024,33);  
	 	LocalDate date1 = LocalDate.ofYearDay(2024,33);  
		System.out.println(date.isLeapYear());//true, 2024 is a leap year
		System.out.println(date.isEqual(date1));//true
		System.out.println(date.isAfter(date1));//false
		System.out.println(date.isBefore(date1));//false
		System.out.println(date.isSupported(ChronoField.DAY_OF_MONTH));//true
		System.out.println(date.isSupported(ChronoUnit.DAYS));//true
		System.out.println(date.isSupported(ChronoUnit.MINUTES));//false
		
		/*
		 * Unsupported
		 *
		 * System.out.println(date.minus(2, ChronoUnit.MINUTES));
		 * The above one throws Unsupported unit: Minutes
		 * at java.base/java.time.LocalDate.plus(LocalDate.java:1270)
		 * Time function not allowed for Date. so we can use isSupported to check.
		 *
		*/


	}
}
