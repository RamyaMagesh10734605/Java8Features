package streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;

import data.Employee;
import data.EmployeeDB;

public class DistinctCountAndSortedMethods {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDB.getAllEmployees();
		System.out.println(employees.stream()
		.map(Employee::getTasks)
		.flatMap(List::stream)
		.collect(toList()));
		
		//output: [Developing FrontEnd application, Certification, Code Review, Code Deployment, Managing Team, Client Visit, Code Review, Interviewer, Testing Application, TestCase Reviewer, Certification, Test Automation, Operations Automation, Terraform, CI/CD Pipeline, Code Deployment]
		
		System.out.println(employees.stream()
		.map(Employee::getTasks)
		.flatMap(List::stream)
		.distinct()
		.collect(toList()));
		
		//output: [Developing FrontEnd application, Certification, Code Review, Code Deployment, Managing Team, Client Visit, Interviewer, Testing Application, TestCase Reviewer, Test Automation, Operations Automation, Terraform, CI/CD Pipeline]

		System.out.println(employees.stream()
				.map(Employee::getTasks)
				.flatMap(List::stream)
				.count() //output: 16
				);
		
		System.out.println(employees.stream()
				.map(Employee::getTasks)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(toList()));
		//output: [CI/CD Pipeline, Certification, Client Visit, Code Deployment, Code Review, Developing FrontEnd application, Interviewer, Managing Team, Operations Automation, Terraform, Test Automation, TestCase Reviewer, Testing Application]

		
		System.out.println(employees.stream()
				.sorted(Comparator.comparing(Employee::getEmpNo)) //sorts with empno
				.collect(toList()));
		
		System.out.println(employees.stream()
				.sorted(Comparator.comparing(Employee::getName)) //sorts with emp name
				.collect(toList()));
		
		System.out.println(employees.stream()
				.sorted(Comparator.comparing(Employee::getName).reversed()) //sorts with emp name in reverse order
				.collect(toList()));
				
	}

}
