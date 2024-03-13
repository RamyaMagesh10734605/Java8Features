package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import data.Employee;
import data.EmployeeDB;

/*
 * Reduce is a terminal operation. Used to reduce the stream to a single value.
 * Two Parameters: Initial Value, BinaryOperator 
 * or Single Parameter: BinaryOpertor
 */
public class ReduceExample {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> add = (a,b) -> a*b;
		
		System.out.println(add.apply(2, 3));
		
		List<Integer> numbers = Arrays.asList(1000,9899,1,-10,9);
		System.out.println(numbers.stream().reduce(1,(a,b)->a*b)); // with an optional value or intial value
		
		Optional<Integer> addd = numbers.stream().reduce((a,b)->a*b); // without an optional value or intial value, returns optional.
		System.out.println(addd.get());
		
		//finding highest salary: passing default value
		List<Employee> employees = EmployeeDB.getAllEmployees();
		System.out.println(employees.stream().reduce(new Employee(), (emp1,emp2)->emp1.getSalary()>emp2.getSalary()?emp1:emp2));
		
		//finding highest salary: not passing default value, returning Optional<Employee>
		System.out.println(employees.stream().reduce((emp1,emp2)->emp1.getSalary()>emp2.getSalary()?emp1:emp2).get());
				
		
	}
}
