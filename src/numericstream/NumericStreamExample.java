package numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
 * NumericStreams help to work with numbers with predefined methods.
 * IntStream will help to work with primitive datatypes. The example 1, does unboxing, Integer to int during stream operation. to 
 * avoid that, we can use Numeric Stream.
 * 
 */
public class NumericStreamExample {
	public static void main(String[] args) {
		
		//of, range, rangeclosed, sum, max,min and count
		List<Integer> 	numbers = Arrays.asList(1,4,5,3,2);
		System.out.println(numbers.stream().reduce(Integer::sum).get());
		
		IntStream num =  IntStream.of(1,4,5,3,2); //it works with list of numbers
		System.out.println(num.reduce(Integer::sum).getAsInt());
		
		int num1 =  IntStream.range(1, 5).sum();  //It has from 1 to 4
		 System.out.println(num1);
		 
		
		IntStream num2 =  IntStream.rangeClosed(1, 5); //It has from 1 to 5
		System.out.println(num2.reduce(Integer::sum).getAsInt());
		
		LongStream lnum = LongStream.range(0, 1); //It also has rangeClosed
		System.out.println(lnum.sum()); 
		//System.out.println(lnum.count());//only once we can use stream. err: stream has already been operated upon or closed
		System.out.println(LongStream.range(0, 1).count()); //returns no. of elements. as 1. "0"
		
		DoubleStream ds = IntStream.rangeClosed(1, 5).asDoubleStream();//no range and rangeclosed, we can make use of IntStream for that.
		System.out.println(ds.sum());
		
		
		IntStream nn = IntStream.rangeClosed(1, 5);
		OptionalInt a = nn.max();
		System.out.println(a.getAsInt());
		
		  nn = IntStream.rangeClosed(1, 5);
		OptionalInt b = nn.min();
		System.out.println(b.getAsInt());
		
		 nn = IntStream.rangeClosed(1, 5);
			OptionalDouble c = nn.average();
			System.out.println(c.getAsDouble());
	}
	

}
