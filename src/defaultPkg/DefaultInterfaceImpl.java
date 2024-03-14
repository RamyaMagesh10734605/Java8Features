package defaultPkg;

import java.util.Arrays;
import java.util.List;

public class DefaultInterfaceImpl  implements DefaultInterface{

	@Override
	public int Multiply(List<Integer> numbers) {
		
		return numbers.stream().reduce(1, (x,y)->x*y);
	}
	 @Override
	 //The keyword default is changed to public.
	 public int Size(List<Integer> numbers) {
		return numbers.size();
	}
	public static void main(String[] args) {
		
		DefaultInterface defaultt = new DefaultInterfaceImpl();
		System.out.println(defaultt.Multiply(Arrays.asList(2,4,5))); //usual method with overridden.
		System.out.println(defaultt.Size(Arrays.asList(2,4,5))); //calling default method from the overridden default method.
		System.out.println(DefaultInterface.isEmpty(Arrays.asList(2,4,5))); //calling static method from the interface.
		

		
	}
	

}
