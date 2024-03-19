package datetimeexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample1 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		//of
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
		System.out.println(LocalDateTime.of(2025,07,29,10,10));
		System.out.println(LocalDateTime.of(2025,07,29,10,10,10));
		System.out.println(LocalDateTime.of(2025,07,29,10,10,10,10));
		//get
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getLong(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getNano());
		System.out.println(ldt.getSecond());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getChronology());
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getMonth());
		//is
		System.out.println(ldt.isAfter(ldt));
		System.out.println(ldt.isBefore(ldt));
		System.out.println(ldt.isEqual(ldt));
		System.out.println(ldt.isSupported(ChronoField.DAY_OF_WEEK));
		System.out.println(ldt.isSupported(ChronoUnit.DAYS));
		//with
		System.out.println(ldt.with(ChronoField.DAY_OF_WEEK,4));
		System.out.println(ldt.withDayOfMonth(12));
		System.out.println(ldt.withDayOfYear(12));
		System.out.println(ldt.withHour(12));
		System.out.println(ldt.withMinute(2));
		System.out.println(ldt.withMonth(2));
		System.out.println(ldt.withNano(2));
		System.out.println(ldt.withSecond(2));
		System.out.println(ldt.withYear(2));
		//minus
		System.out.println(ldt.minus(2,ChronoUnit.DAYS));
		System.out.println(ldt.minusDays(2));
		System.out.println(ldt.minusHours(2));
		System.out.println(ldt.minusMinutes(2));
		System.out.println(ldt.minusMonths(2));
		System.out.println(ldt.minusNanos(2));
		System.out.println(ldt.minusSeconds(2));
		System.out.println(ldt.minusWeeks(2));
		System.out.println(ldt.minusYears(2));
		//plus
		System.out.println(ldt.plus(2,ChronoUnit.DAYS));
		System.out.println(ldt.plusDays(2));
		System.out.println(ldt.plusHours(2));
		System.out.println(ldt.plusMinutes(2));
		System.out.println(ldt.plusMonths(2));
		System.out.println(ldt.plusNanos(2));
		System.out.println(ldt.plusSeconds(2));
		System.out.println(ldt.plusWeeks(2));
		System.out.println(ldt.plusYears(2));
	
	}
}
