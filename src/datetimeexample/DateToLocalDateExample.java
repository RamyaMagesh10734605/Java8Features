package datetimeexample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToLocalDateExample {

	public static void main(String[] args) {
		
		//util.Date to ZonedDateTime/LocalDate/LocalDateTime
		Date date = new Date();
		System.out.println(date);
		
		ZonedDateTime zd = date.toInstant().atZone(ZoneId.systemDefault());
		System.out.println(zd);
		System.out.println(zd.toLocalDate());
		System.out.println(zd.toLocalDateTime());
		
		// LocalDate+LocalTime+Zone to util.Date
		LocalDate dd = zd.toLocalDate();
		Date date1 = new Date().from(dd.atTime(LocalTime.now()).atZone(
				ZoneId.systemDefault()).toInstant());
		System.out.println(date1);
		
		//LocalDate to java.sql.Date
		java.sql.Date dds =  java.sql.Date.valueOf(dd);
		System.out.println(dds); 
		
		//java.sql.Date to LocalDate
		dd = dds.toLocalDate();
		System.out.println(dd);
	}
}