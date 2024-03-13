package streams;

import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

/*
 * mapping - terminal operator. 
 */
public class CollectMethodsExample4 {

	public static void main(String[] args) {
		
		// Collectors mapping method collects the diff. datatype stream and converts to any collection type
		System.out.println(EmployeeDB.getAllEmployees().stream().map(Employee::getName).toList()); //changing to string list
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.mapping(Employee::getName, Collectors.toList()))); 
		//instead of using map and collect as tolist, we directly use mapping in the collect method.
	}
}
