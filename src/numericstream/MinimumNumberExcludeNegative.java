package numericstream;

import java.util.Arrays;

public class MinimumNumberExcludeNegative {
	
	public static void main(String[] args) {
		int[] array = {1,3,4,-1,-2};
		
		int min = Arrays.stream(array).filter(i -> i >= 0).min().orElse(0);
		System.out.println(min);
	}

}
