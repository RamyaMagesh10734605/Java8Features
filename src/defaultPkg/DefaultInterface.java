package defaultPkg;

import java.util.List;

public interface DefaultInterface {
	
	int Multiply(List<Integer> numbers);
	/*
	 * only interface can use default keyword. the below method can be overridden in the sub classes.
	 * the default comes with method implementation to avoid the errors in the already used classes.
	 */
	default int Size(List<Integer> numbers) {
		return numbers.size();
	}
	/*
	 * The static method cannot be overridden.
	 * It comes with implementation and can be used in all its subclasses.
	 */
	static boolean isEmpty(List<Integer> numbers) {
		return numbers!=null && numbers.size()==0;
	}

}
