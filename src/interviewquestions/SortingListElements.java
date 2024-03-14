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
		System.out.println("With no comparator: "+numbers);
		
		
		Collections.sort(numbers,Comparator.naturalOrder());
		System.out.println("With Natural order comparator: "+ numbers);
		
		Collections.sort(numbers,Comparator.reverseOrder());
		System.out.println("With reverse order comparator: "+ numbers);
		
		//Since 1.8, the list has a sort default method which accepts Comparator input
		numbers.sort(Comparator.naturalOrder());
		System.out.println("With list sort method: " + numbers);
		
		System.out.println("With Stream sorted"+numbers.stream().sorted().toList());
		System.out.println("With Stream sorted reverse order"+numbers.stream().sorted(Comparator.reverseOrder()).toList());

		
		List<Employee> employees = EmployeeDB.getAllEmployees();
		//Stream will not work on actual list
		System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getEmpNo)).collect(Collectors.toList()));
		
		//This works on actual list
		//employees.sort(Comparator.comparing(Employee::getName));
		//System.out.println(employees);
		
		Collections.sort(employees,Comparator.comparing(Employee::getName));
		System.out.println(employees);
		
	}
	
}
