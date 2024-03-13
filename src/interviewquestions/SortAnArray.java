package interviewquestions;

import java.util.Arrays;

public class SortAnArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,6,7,-9,-8,-5,2,0,1};
		
		for(int a:numbers)
		System.out.print(a+" ");
		
		Arrays.sort(numbers);
		System.out.println();
		for(int a:numbers)
			System.out.print(a+" ");
	}

}
