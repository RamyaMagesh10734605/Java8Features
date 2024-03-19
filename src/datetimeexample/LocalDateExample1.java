package datetimeexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * DateTime is part of java.time package.
 * Prior to JAva 8, it was Date and Calendar.
 * LocalDate is for Date.
 * LocalTime is for Time.
 * LocalDateTime is for DateTime.
 */
public class LocalDateExample1 {

	public static void main(String[] args) {
		
		LocalDate datee = LocalDate.now(); //gives the system's date
		System.out.println(datee);
		
		LocalTime time = LocalTime.now(); //gives the system's time
		System.out.println(time);
		
		LocalDateTime datete = LocalDateTime.now(); //gives the system's datetime
		System.out.println(datete);
		
		datee = LocalDate.of(2025,03,14); //gives the system's date
		System.out.println(datee);
		
		datee = LocalDate.ofYearDay(2025,33); //passing year and Daysoftheyear(valid values 1 - 365/366) , gives the given day of the given date
		System.out.println(datee);
		
		
	}
}
