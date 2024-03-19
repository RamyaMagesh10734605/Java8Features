package datetimeexample;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

 /*
  * LocalDAte instances are immutable. Cannot be changed.
  */
public class LocalDateExample3 {

	public static void main(String[] args) {
		
	 	LocalDate date = LocalDate.ofYearDay(2025,33); //passing year and Daysoftheyear(valid values 1 - 365/366) , gives the given day of the given date
	 	System.out.println(date); //2025-02-02
	 	System.out.println(date.plusDays(2));//2025-02-04
	 	System.out.println(date.plusMonths(2));//2025-04-02
	 	System.out.println(date.plusWeeks(2));//2025-02-16 (2+14)
		System.out.println(date.plusYears(2)); //2027-02-02
		System.out.println("-----------------------------");
		System.out.println(date.minusDays(3)); //2025-01-30
		System.out.println(date.minusMonths(3));//2024-11-02
		System.out.println(date.minusWeeks(3));//2025-01-12
		System.out.println(date.minusYears(3));//2022-02-02
		System.out.println(date.minus(2, ChronoUnit.DAYS)); //2025-01-31
		System.out.println(date.minus(2, ChronoUnit.DAYS)); //2025-01-31
		System.out.println("-----------------------------");
		System.out.println(date.withDayOfMonth(3)); //2025-02-03
		System.out.println(date.withDayOfYear(3));//2025-01-03
		System.out.println(date.withMonth(3));//2025-03-02
		System.out.println(date.withYear(3));//0003-02-02
		System.out.println(date.with(ChronoField.YEAR,2000));//2000-02-02
		System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));//2025-02-01


	}
}
