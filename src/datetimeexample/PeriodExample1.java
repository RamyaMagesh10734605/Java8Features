package datetimeexample;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * Period is a date-based representation of time in Days, Months and Years
 * It is part of java.time package.
 * 
 * Compatible with LocalDate.
 * It represents a period of Time (Period.ofDays(10)), in 10 days period.
 * 
 * It is mainly used to calculate the differences between the dates.
 */
public class PeriodExample1 {
public static void main(String[] args) {

	LocalDate dat = LocalDate.of(1983, 07, 29);
	LocalDate dat1 = LocalDate.of(2024, 03, 15);
	
	Period d= dat.until(dat1);
	//get
	System.out.println(d.getDays());
	System.out.println(d.get(ChronoUnit.YEARS));
	System.out.println(d.getMonths());
	System.out.println(d.getYears());
	System.out.println(d.getChronology());
	System.out.println(d.getUnits());
	
	//of
	d=Period.of(2000, 10, 30);
	System.out.println(d);
	d=Period.ofDays(30);
	System.out.println(d);
	d=Period.ofMonths(10);
	System.out.println(d);
	d=Period.ofWeeks(3);
	System.out.println(d);
	d=Period.ofYears(10);
	System.out.println(d);
	
	//to
	System.out.println(d.toTotalMonths()); 
	//is
	System.out.println(d.isNegative());
	System.out.println(d.isZero());
	//with
	System.out.println(d.withDays(10));
	System.out.println(d.withMonths(10));
	System.out.println(d.withYears(10));
	//plus
	System.out.println(d.plusDays(10));
	System.out.println(d.plusMonths(10));
	System.out.println(d.plusYears(10));
	//minus	
	System.out.println(d.minusDays(10));
	System.out.println(d.minusYears(10));
	System.out.println(d.minusMonths(10));
	
	//between
	System.out.println(Period.between(dat, dat1));
	
}
}
