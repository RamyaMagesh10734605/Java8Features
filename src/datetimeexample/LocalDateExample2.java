package datetimeexample;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/*
 * DateTime is part of java.time package.
 * Prior to JAva 8, it was Date and Calendar.
 * LocalDate is for Date.
 * LocalTime is for Time.
 * LocalDateTime is for DateTime.
 */
public class LocalDateExample2 {

	public static void main(String[] args) {
		
	 	LocalDate date = LocalDate.ofYearDay(2025,33); //passing year and Daysoftheyear(valid values 1 - 365/366) , gives the given day of the given date
	 	System.out.println(date); //2025-02-02
	 	System.out.println(date.getMonth());  //FEBRUARY
		System.out.println(date.getDayOfMonth()); //2 (Day)
		System.out.println(date.getDayOfYear()); //33 (no. of days from jan1 to the given day
		System.out.println(date.getMonthValue()); //2 
		System.out.println(date.getYear()); //2025
		System.out.println(date.getClass()); //class java.time.LocalDate
		System.out.println(date.getChronology()); //ISO
		System.out.println(date.getDayOfWeek()); //SUNDAY
		System.out.println(date.getEra()); //CE
		System.out.println(date.get(ChronoField.DAY_OF_WEEK)); //7
		//ChronoField is an enum public enum ChronoField implements TemporalField 
		//TemporalField is an interface.
		
		
		
	}
}
