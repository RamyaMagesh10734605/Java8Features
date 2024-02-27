package imperativevsdeclarative;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativePrg {

	
public static void main(String s[]) {
	
	int sum=0;
	for(int i=0;i<=100;i++)
	sum+=i;
	
	System.out.println("Imperative  :"+ sum);
	
	int sum1 = IntStream.rangeClosed(0, 100).sum();
	System.out.println("Declarative :"+sum1);
}
}
