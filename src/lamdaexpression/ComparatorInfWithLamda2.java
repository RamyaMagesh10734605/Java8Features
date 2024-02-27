package lamdaexpression;

import java.util.Comparator;

public class ComparatorInfWithLamda2 {

	public static void main(String[] args) {
		
		Comparator<String> ss = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2); //returns 0 / 1 / -1
			}
		};
		
		
		System.out.println(ss.compare("GOD", "god1"));
		
		Comparator<String> k = (a,b) -> a.compareToIgnoreCase(b);
		System.out.println(k.compare("test", "test"));
	}
}
