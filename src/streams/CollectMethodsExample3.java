package streams;

import java.util.Comparator;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

/*
 * maxBy and minBy - terminal operators. 
 * Both is used in conjunction with Comparator. Returns the max/min element based on the
 * property passed to the comparator.
 * 
 */
public class CollectMethodsExample3 {

	public static void main(String[] args) {
	
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))); 
		
	}
}
