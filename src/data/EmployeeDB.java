package data;

import java.util.Arrays;
import java.util.List;

public class EmployeeDB {

	public static List<Employee> getAllEmployees(){
		Employee emp1 = new Employee("Smith", 1001,Arrays.asList("Developing FrontEnd application","Certification","Code Review","Code Deployment") ,"Insurance", 110000, "Software Engineer");
		Employee emp2 = new Employee("Adam", 1002,Arrays.asList("Managing Team","Client Visit","Code Review","Interviewer"), "Insurance",800000, "Project Manager");
		Employee emp3 = new Employee("Tylor", 1003,Arrays.asList("Testing Application","TestCase Reviewer","Certification","Test Automation") ,"Healthcare", 70000, "Test Engineer");
		Employee emp4 = new Employee("Kennedy", 1004,Arrays.asList("Operations Automation","Terraform","CI/CD Pipeline","Code Deployment") ,"Healthcare", 100000, "Devops Engineer");
		
		List<Employee> allEmployees = Arrays.asList(emp1,emp2,emp3,emp4);
	
	return allEmployees;
	}
}