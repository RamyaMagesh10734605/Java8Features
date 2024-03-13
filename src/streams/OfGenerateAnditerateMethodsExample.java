package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfGenerateAnditerateMethodsExample {
	
	public static void main(String[] args) {
		
		//of is a static method of stream, which helps to create stream with its parameters.
		Stream<String> strstream = Stream.of("Joseph","Mary");
		strstream.forEach(System.out::println);
		
		//iterate is a infinity static method, which works for inifinity times, limit() helps to stop where we want. this is to iterate
		//through the integers from 1 and multiplies it by 2.
		Stream.iterate(1, (x)->x*2).limit(10).forEach(System.out::println);
		
		//generate is a infinity static method, which works for inifinity times, limit() helps to stop where we want. this is to generate 
				//desired values passed as a supplier. the below one generates random number for 10 times.
		Supplier<Integer> num = ()->new Random().nextInt();
		Stream.generate(num).limit(10).forEach(System.out::println);
		
		
		
	}

}
