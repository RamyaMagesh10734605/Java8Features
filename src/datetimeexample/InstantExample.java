package datetimeexample;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/*
 * This is to represent time in a machine readable format.
 * 
 */
public class InstantExample {

	/*
	 * The Epoch time or the Unix time in computer science is the number of seconds since January 1, 1970.
	 * To track the time, the computer needs to know from where to start.
	 * The Epoch time is a popular convention for computers to track the time. 
	 * The Epoch time starts at 00:00:00 Thu 01 Jan 1970 UTC and is measured in seconds. 
	 * The Epoch time is thus the number of seconds since Epoch zero.
	 * Unix system was developed between years 1969 and 1971. The first internal manual was released in 1971.
	 *
	 */
	public static void main(String[] args) {
		
		Instant ins = Instant.now();
		System.out.println(ins); //Time of the machine 
		
		//get

		System.out.println(ins.getEpochSecond());
		//System.out.println(ins.getLong(ChronoField.SECOND_OF_MINUTE));
		System.out.println(ins.getNano());
		System.out.println(ins.getClass());
		
		//with
		//System.out.println(ins.with(TemporalAdjusters.firstDayOfMonth()));
		//System.out.println(ins.with(ChronoField.SECOND_OF_MINUTE, 1));
		
		//plus
		//System.out.println(ins.plus(100,ChronoUnit.SECONDS));
		System.out.println(ins.plusMillis(100));
		System.out.println(ins.plusNanos(100));
		System.out.println(ins.plusSeconds(100));
	
		//minus
		System.out.println(ins.minusMillis(100));
		System.out.println(ins.minusNanos(100));
		System.out.println(ins.minusSeconds(100));

       //of
		System.out.println(Instant.ofEpochMilli(0)); //1970-01-01T00:00:00Z
		System.out.println(Instant.ofEpochSecond(0));
		System.out.println(Instant.ofEpochSecond(10, 0));
		
		//other methods
		System.out.println(ins.compareTo(ins));
		System.out.println(ins.isAfter(ins));
		System.out.println(ins.isBefore(ins));
		System.out.println(ins.isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(ins.isSupported(ChronoUnit.DAYS));
		System.out.println(ins.until(ins, ChronoUnit.DAYS));
		
			
		
	}
}
