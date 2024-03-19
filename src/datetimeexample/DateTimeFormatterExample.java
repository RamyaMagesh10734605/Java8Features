package datetimeexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Since 1.8
 * Part of java.time.format
 * Used to parse and format the LocalDate, LocalTime and LocalDateTime
 * 
 * Parse - converting a String to LocalDate/LocalTime or LocalDateTime
 * Format - Converting LocalDate/LocalTime or LocalDateTime to String.
 */
public class DateTimeFormatterExample {

	public static void main(String[] args) {
		
		String dat = "2024-03-18";

		LocalDate dat1 =LocalDate.parse(dat);
		System.out.println(dat1);
		dat1 =LocalDate.parse(dat,DateTimeFormatter
						 .ISO_DATE);
		System.out.println(dat1);
		
		dat = "20240318";
		System.out.println(LocalDate.parse(dat, DateTimeFormatter.BASIC_ISO_DATE));
		
		dat = "2024|03|18";
		System.out.println(LocalDate.parse(dat,
				DateTimeFormatter.ofPattern("yyyy|MM|dd")));	
		
		//LocalDate to String
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy|MM|dd")));
		
		LocalTime t1 = LocalTime.parse("11:36");
		System.out.println(t1);
		t1 = LocalTime.parse("11:36", DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(t1);
		
		System.out.println(LocalTime.parse("11*36", DateTimeFormatter.ofPattern("HH*mm")));
		
		//LocalTime to String
		System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH*mm")));
		
		//LocalDateTime to String
		LocalDateTime ldt = LocalDateTime.parse("2024-03-18T11:53");
		System.out.println(ldt);
		
		ldt = LocalDateTime.parse("2024-03-18T11:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(ldt);
		
		ldt = LocalDateTime.parse("2024|03|18T11*53",DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH*mm"));
		System.out.println(ldt);
		
		//String to LocalDateTime
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH*mm")));

	}	
}
