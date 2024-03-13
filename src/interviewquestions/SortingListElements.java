package interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

public class SortingListElements {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(100,33,4,5,3);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<Employee> employees = EmployeeDB.getAllEmployees();

		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getEmpNo)).collect(Collectors.toList()));
		
		//TODO: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
		
	}
	
}
