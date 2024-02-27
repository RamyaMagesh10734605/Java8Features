package imperativevsdeclarative;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativePrg2 {

	
public static void main(String s[]) {
	
	
	List<Integer> numbers = Arrays.asList(1,3,3,3,5,6,6);
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	for(Integer num:numbers) {
		if(!list.contains(num)) list.add(num);
	}
	
	System.out.println("unique list with imperative: "+ list);
	
	System.out.println("unique list with declarative: "+numbers.stream().distinct().collect(Collectors.toList()));
	


}
}
