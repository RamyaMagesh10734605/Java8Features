package streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/*
 * In Java, static import concept is introduced in 1.5 version. With the help of static import, we can access the static members
 *  of a class directly without class name or any object. 
 * For Example: we always use sqrt() method of Math class by using Math class i.e. Math.sqrt(), but by using static import we can 
 * access sqrt() method directly. 
 * According to SUN microSystem, it will improve the code readability and enhance coding. But according to the programming experts, 
 * it will lead to confusion and not good for programming. If there is no specific requirement then we should not go for static import.
 */

import java.util.List;

import data.Employee;
import data.EmployeeDB;

public class FlatMapMethod {
	
	public static void main(String[] args) {
		
		//List<Employees> to List<String> holding employee names
		//map() helps to extract the stream in a different datatypes and also to perform different operations to the stream elements
		
		List<Employee> employees = EmployeeDB.getAllEmployees();
		
		System.out.println(employees
								.stream()
								.map(Employee::getName) //Changing List<Employees> to List<String>
								.map(String::toUpperCase) //It performs string operations. not changing the types
								.collect(toList())); // to use toList(), need to use static import of java.util.stream.Collectors.toList
								
								
		//Another example for toSet operation
								
		System.out.println(employees
									.stream()
									.map(Employee::getName) //Changing List<Employees> to List<String>
									.map(String::toUpperCase) //It performs string operations. not changing the types
									.collect(toSet()) // to use toList(), need to use static import of java.util.stream.Collectors.toList
		);
	}

}
