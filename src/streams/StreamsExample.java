package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

/**
 * 
 * Streams are sequence of elements which can be created out of a collections or I/O resources.
 * Streams operation can be performed sequentially or parallel
 * It works in a declarative way, dont need to explain how to perform. 
 */
public class StreamsExample {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDB.getAllEmployees();
		
		//Example 1: convert List to Map
		System.out.println(employees.stream().collect(Collectors.toMap(Employee::getEmpNo, Employee::getTasks)));
		
		//Example 2: Applying filter condition
		Predicate<Employee> empsal = employee->employee.getSalary()>80000;
		System.out.println(employees.stream() //gives stream of employees
				.filter(empsal) //gives stream of filtered employees
				.collect(Collectors.toMap(Employee::getEmpNo, Employee::getTasks) //gives the desired result. employees as map.
						));
		
		//The stream works in a pipeline. We have stream() as first, filter as intermediate and collect and terminal operation.
		//Without terminal, the above streams wouldnt have run. 
		System.out.println(employees.stream().filter(empsal));
		
		//Streams are lazy, no intermediate operation will operate until the terminal operation is invoked.
		
	}

}
