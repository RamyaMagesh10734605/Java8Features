package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

public class filtersExample {
	
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDB.getAllEmployees();
		
		System.out.println(employees.stream().filter((employee)-> employee.getSalary()>80000).collect(Collectors.toList()))	;
	}

}
