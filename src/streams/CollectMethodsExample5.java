package streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import data.Employee;
import data.EmployeeDB;

/*
 * summingInt & averagingInt - terminal operators. 
 * Returns sum and average as result.
 */
public class CollectMethodsExample5 {

	public static void main(String[] args) {
		
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.summingDouble(Employee::getSalary)));  
		
		System.out.println(EmployeeDB.getAllEmployees().stream().map(Employee::getSalary).reduce((x,y)->x+y).get()); 
		
		System.out.println(IntStream.of(1,3,5,6,7,8).sum());
		System.out.println(IntStream.of(1,3,5,6,7,8).average().getAsDouble());
		
		System.out.println(EmployeeDB.getAllEmployees().stream().map(Employee::getSalary).mapToDouble(x->x).sum());

	
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.averagingDouble(Employee::getSalary)));  
		
		
	}
	
}
