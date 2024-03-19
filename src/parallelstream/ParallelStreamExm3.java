package parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExm3 {
	//in case of mutable variable, parallel will not provide the expected result.
	public static void main(String[] args) {

	    	 Long stime = System.currentTimeMillis();
	    	System.out.println(IntStream.rangeClosed(1, 10000).boxed().reduce(1, (x,y)->x+y));
	    	 Long etime = System.currentTimeMillis();
	    	 System.out.println("Time taken in seq " + (etime-stime));
	    	  
	    	  stime = System.currentTimeMillis();
		    	System.out.println(IntStream.rangeClosed(1, 10000).parallel().boxed().reduce(1, (x,y)->x+y));
		    	 etime = System.currentTimeMillis();
	    	  System.out.println("Time taken in parallel " + (etime-stime));
	    }

}
