package functionalinterface;
import java.util.Comparator;
import java.util.function.BinaryOperator;

 
public class BinaryOperatorFunctionalInterface {
	
	//BinaryOperator extends BiFunction Functional Interface. The BiFunction expects two input parameters and one output.
	//It also has static methods , minBy(Comparator), maxBy(Comparator). It extends BiFunction so it has apply, andThen.
	
	public static void main(String[] args) {
	
		BinaryOperator<String> f1 = (name,lname) -> name+" "+lname;
		
		System.out.println(f1.apply("Ramya","Magesh"));  // output: Ramya Magesh
		
		Comparator<Integer> x= (k,v) -> k.compareTo(v);
		System.out.println(x.compare(3, 1));
		System.out.println(BinaryOperator.minBy(x).apply(2, 1));
		System.out.println(BinaryOperator.maxBy(x).apply(2, 1));
		
		
		
	}

}
