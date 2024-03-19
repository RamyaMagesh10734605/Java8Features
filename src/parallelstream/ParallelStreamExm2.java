package parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

public class ParallelStreamExm2 {
	
	    public static void main(String[] args) {

	    	 Long stime = System.currentTimeMillis();
	    	System.out.println(EmployeeDB.getAllEmployees().stream().map(Employee::getTasks).flatMap(List::stream).distinct().sorted().collect(Collectors.toList()));
	    	 Long etime = System.currentTimeMillis();
	    	 System.out.println("Time taken in seq " + (etime-stime));
	    	  stime = System.currentTimeMillis();
	    	System.out.println(EmployeeDB.getAllEmployees().parallelStream().map(Employee::getTasks).flatMap(List::stream).distinct().sorted().collect(Collectors.toList()));
	    	  etime = System.currentTimeMillis();
	    	  System.out.println("Time taken in parallel " + (etime-stime));
	    }

}
