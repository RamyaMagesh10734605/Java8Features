package defaultPkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import data.Employee;
import data.EmployeeDB;

public class ComparatorExmp {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(100,33,4,5,3);
		Collections.sort(numbers);
		System.out.println("With no comparator: "+numbers);
		
		
		Collections.sort(numbers,Comparator.naturalOrder());
		System.out.println("With Natural order comparator: "+ numbers);
		
		Collections.sort(numbers,Comparator.reverseOrder());
		System.out.println("With reverse order comparator: "+ numbers);
		
		//Since 1.8, the list has a sort default method which accepts Comparator input
		numbers.sort(Comparator.naturalOrder());
		System.out.println("With list sort method: " + numbers);
		
		//Using Collections.sort to sort list elements
		List<Employee> employees = EmployeeDB.getAllEmployees();
		Collections.sort(employees,Comparator.comparing(Employee::getName));
		System.out.println(employees);
		
		//Using List.sort to sort list elements
		employees = EmployeeDB.getAllEmployees();
		employees.sort(Comparator.comparing(Employee::getName));
		System.out.println(employees);
		
		//Using List.sort to sort list elements
		employees = EmployeeDB.getAllEmployees();
		employees.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println(employees);
		
		//Comparator with null value sorting
		//if the list has null values, it will throw NullPointerException
		//using nullsFirst and nullsLast, this can be taken care
		employees = Arrays.asList(new Employee("Zack"), new Employee("Adam"),null);
		employees.sort(Comparator.nullsFirst(Comparator.comparing(Employee::getName)));
		System.out.println(employees);
		
		employees = Arrays.asList(new Employee("Zack"), new Employee("Adam"),null);
		employees.sort(Comparator.nullsLast(Comparator.comparing(Employee::getName)));
		System.out.println(employees);
	}
}
