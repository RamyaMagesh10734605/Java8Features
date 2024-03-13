package streams;

import java.util.Optional;

import data.Employee;
import data.EmployeeDB;

/*
 * findAny and findfirst used to find an element in the stream.  returns the result of type
 * Optional. It returns the element found. 
 * findFirst returns first element in the stream.
 * on normal stream, both functions similarly. in parallel stream, we would see the difference.
 */
public class FindAnyAndfindFirstExample {
	
	public static void main(String[] args) {
		
		Optional<Employee> emp1 = EmployeeDB.getAllEmployees().stream().filter((emp)->emp.getSalary()>7000).findAny();
		System.out.println(emp1.get());
		
		Optional<Employee> emp2 = EmployeeDB.getAllEmployees().stream().filter((emp)->emp.getSalary()>7000).findFirst();
		System.out.println(emp2.get());
		
		
	}
}
