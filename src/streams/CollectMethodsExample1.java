package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * joining -terminal operator. 
 */
public class CollectMethodsExample1 {

	public static void main(String[] args) {
		
		//joining Collector performs the String concatenation on the elements in the stream.
		IntStream numbers = IntStream.rangeClosed(0, 12);
		List<String> rolnum =numbers.mapToObj((x)->"s"+x).toList();
		System.out.println(rolnum.stream().collect(Collectors.joining()));
		System.out.println(rolnum.stream().collect(Collectors.joining(",")));
		System.out.println(rolnum.stream().collect(Collectors.joining(",", "sed", "x"))); //sed is the beginning letter to add.
		//x is the last letter to add.
  // we can import Collectors.join as static and get rid of Collectors at the first. it is optional and it is not readable.
		
	}
}
