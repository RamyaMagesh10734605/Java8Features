package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * counting - terminal operator. 
 */
public class CollectMethodsExample2 {

	public static void main(String[] args) {
		
		// Collectors collecting method returns the no. of elements
		IntStream numbers = IntStream.rangeClosed(0, 12);
		List<String> rolnum =numbers.mapToObj((x)->"s"+x).toList();
		System.out.println(rolnum.stream().collect(Collectors.counting()));
		System.out.println(rolnum.stream().count());
		
	}
}
