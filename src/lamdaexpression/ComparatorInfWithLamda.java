package lamdaexpression;

import java.util.Comparator;

public class ComparatorInfWithLamda {

	public static void main(String[] args) {
		
		//Prior Java 8
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				 return o1.compareTo(o2);
			}
		};
		
		System.out.println(c.compare(3, 1));
		
		//no return keyword needed.
		Comparator<Integer> dd =  (Integer o1,Integer o2) -> o1.compareTo(o2);

		System.out.println(dd.compare(2, 1));
		
		//no input parameter type  needed.
		Comparator<Integer> dd2 =  ( o1, o2) -> o1.compareTo(o2);

		System.out.println(dd2.compare(2, 1));
		
	}
}
