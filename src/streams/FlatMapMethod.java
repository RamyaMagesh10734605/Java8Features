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

import javax.swing.ListCellRenderer;

import data.Employee;
import data.EmployeeDB;

public class FlatMapMethod {
	
	public static void main(String[] args) {
		
		//List<List<Employees>> to List<String> holding employee tasks
		//flatmap() helps to extract the list of list of streams and flatten as one list
		
		List<Employee> employees = EmployeeDB.getAllEmployees();
		
		System.out.println(employees
								.stream() //stream of employees
								.map(Employee::getTasks) //Stream<List<String>>
								//output [[Developing FrontEnd application, Certification, Code Review, Code Deployment], [Managing Team, Client Visit, Code Review, Interviewer], [Testing Application, TestCase Reviewer, Certification, Test Automation], [Operations Automation, Terraform, CI/CD Pipeline, Code Deployment]]
								.flatMap(List::stream)
								//output:[Developing FrontEnd application, Certification, Code Review, Code Deployment, Managing Team, Client Visit, Code Review, Interviewer, Testing Application, TestCase Reviewer, Certification, Test Automation, Operations Automation, Terraform, CI/CD Pipeline, Code Deployment]
								.collect(toList()));
								
		
	}

}
