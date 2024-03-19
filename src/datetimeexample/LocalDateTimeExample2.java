package datetimeexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample2 {

	public static void main(String[] args) {
		/*
		 * Converting LocalDate/LocalTime to LocalDateTime
		 */
		
		LocalDate ldt =LocalDate.now();
		LocalDateTime ldtt = ldt.atTime(14, 04);
		System.out.println(ldtt);
		LocalTime lt =LocalTime.now();
		LocalDateTime ldtt1 = lt.atDate(LocalDate.now());
		System.out.println(ldtt1);
		
		//Extracting only date from LocalDateTime
		System.out.println(ldtt1.toLocalDate());
		System.out.println(ldtt1.toLocalTime());
		
	
		
	}
}
