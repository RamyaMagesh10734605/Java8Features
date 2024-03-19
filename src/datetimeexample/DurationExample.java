package datetimeexample;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
 * A time based representation in hours, minutes, seconds and nanoseconds
 * 
 * Compatible with LocalTime and LocalDateTime
 * Duration.ofHours(3) 
 */
public class DurationExample {
	public static void main(String[] args) {
		LocalTime lt1 = LocalTime.of(12, 20);
		LocalTime lt2 = LocalTime.of(14, 20);
		System.out.println(lt1.until(lt2, ChronoUnit.HOURS));
		//between
		System.out.println(Duration.between(lt1, lt2));
		//of
		System.out.println(Duration.ofDays(10));
		System.out.println(Duration.ofHours(10));
		System.out.println(Duration.ofMillis(100));
		System.out.println(Duration.ofMinutes(10));
		System.out.println(Duration.ofNanos(20));
		System.out.println(Duration.ofSeconds(20));
		System.out.println(Duration.ofSeconds(40, 2));
		//compareto
		Duration duration = Duration.ofDays(10);
		Duration duration1 = Duration.ofDays(20);
		System.out.println(duration.compareTo(duration1));
		
		//get
		System.out.println(duration.get(ChronoUnit.SECONDS));
		System.out.println(duration.getNano());
		System.out.println(duration.getSeconds());
		System.out.println(duration.getUnits());
		System.out.println(duration.getClass());
		
		//is
		System.out.println(duration.isNegative());
		System.out.println(duration.isZero());
		
		//to
		System.out.println(duration.toDays());
		System.out.println(duration.toDaysPart());
		System.out.println(duration.toHours());
		System.out.println(duration.toHoursPart());
		System.out.println(duration.toMillis());
		System.out.println(duration.toMillisPart());
		System.out.println(duration.toMinutes());
		System.out.println(duration.toMinutesPart());
		System.out.println(duration.toNanos());
		System.out.println(duration.toNanosPart());
		System.out.println(duration.toSeconds());
		System.out.println(duration.toSecondsPart());
		
		//with
		System.out.println(duration.withNanos(30));
		System.out.println(duration.withSeconds(40));
		
		//plus
		System.out.println(duration.plus(duration1));
		System.out.println(duration.plus(10, ChronoUnit.HOURS));
		System.out.println(duration.plusDays(10));
		System.out.println(duration.plusHours(10));
		System.out.println(duration.plusMillis(10));
		System.out.println(duration.plusMinutes(10));
		System.out.println(duration.plusMillis(10));
		System.out.println(duration.plusMinutes(10));
		System.out.println(duration.plusNanos(10));
		System.out.println(duration.plusSeconds(10));
		
		//minus
		System.out.println(duration.minus(duration1));
		System.out.println(duration.minus(10, ChronoUnit.HOURS));
		System.out.println(duration.minusDays(10));
		System.out.println(duration.minusHours(10));
		System.out.println(duration.minusMillis(10));
		System.out.println(duration.minusMinutes(10));
		System.out.println(duration.minusMillis(10));
		System.out.println(duration.minusMinutes(10));
		System.out.println(duration.minusNanos(10));
		System.out.println(duration.minusSeconds(10));
	}

}		
