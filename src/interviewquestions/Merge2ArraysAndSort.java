package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2ArraysAndSort {
	
	public static void main(String[] args) {
		
		//Sort an array of numbers
		int[] numbers = {1,6,7,-9,-8,-5,2,0,1};
		
		for(int a:numbers)
		System.out.print(a+" ");
		
		Arrays.sort(numbers);
		System.out.println();
		for(int a:numbers)
			System.out.print(a+" ");
		
		
		//Merge two arrays and Sort
		int[] numbers1 = {9,10};
		
	 
		  Integer[] x= Arrays.stream(numbers).boxed().toArray( Integer[]::new);
		  Integer[] y= Arrays.stream(numbers1).boxed().toArray( Integer[]::new);
		  List<Integer[]> num= Arrays.asList(x,y);
		System.out.println(num.stream().flatMap(Stream::of).sorted().collect(Collectors.toList()));
		
		
		
		
		 
		 
		 
	}

}
