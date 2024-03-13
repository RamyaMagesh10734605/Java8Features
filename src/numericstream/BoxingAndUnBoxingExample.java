package numericstream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class SampleData{
	String value;
	public SampleData(String value) {
		this.value = value;
}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

/*
 * 
 * mapToInt (its a stream method), Intstream methods like mapToObj, mapToDouble, mapToLong helps for unboxing: wrapper to primitive
 */
public class BoxingAndUnBoxingExample {

	public static void main(String[] args) {
		
	 System.out.println(IntStream.rangeClosed(1, 5).boxed().toList()); //boxing: primitive to wrapper
	 List<Integer> a = Arrays.asList(1,24,3,2,2);
	 a.stream().mapToInt(Integer::intValue).forEach(System.out::println); //unboxing: Wrapper to primitive
	 
	 Integer aa = 1;
	 System.out.println(aa.intValue()); //Wrapper to primitive - unboxing
	 
	 //Convert String to BigDecimal - interview question
	 List<SampleData> data = Arrays.asList(new SampleData("13.6666"),new SampleData("34.4444"));
	 
	 System.out.println(data.stream().map((dd)->new BigDecimal(dd.getValue())).toList());
	 
	 IntStream numbers = IntStream.rangeClosed(0, 12);
	 System.out.println(numbers.mapToObj((x)->x).toList()); //converting int to Integer object
	 
	 IntStream.rangeClosed(0, 12).mapToLong((x)->x).forEach(System.out::print); //converting int to Long object
	 
	 IntStream.rangeClosed(0, 12).mapToDouble((x)->x).forEach(System.out::print); //converting int to Double object
	 

	}
}
	