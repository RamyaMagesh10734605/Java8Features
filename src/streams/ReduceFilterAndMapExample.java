package streams;

import data.Employee;
import data.EmployeeDB;

public class ReduceFilterAndMapExample {

	public static void main(String[] args) {
		
		//Summing all the salaries except project manager
		System.out.println(
				EmployeeDB.getAllEmployees().stream()
				 .filter((emp)->!emp.getDesignation().equalsIgnoreCase("Project Manager"))
				 .map(Employee::getSalary)
				// .reduce(0.0, (sal,sa)->sal+sa)); //moving regular exp to Double::sum 
				 .reduce(0.0, Double::sum)); 
		
		//Finding min of salary
		System.out.println(
				EmployeeDB.getAllEmployees().stream()
				 .map(Employee::getSalary)
				 .reduce((x,y)->(x<y)?x:y).get());  //do not use default value for the min or max 
		
		
		//Finding max of salary
		System.out.println(
				EmployeeDB.getAllEmployees().stream()
				 .map(Employee::getSalary)
				 .reduce((x,y)->(x>y)?x:y).get());  //do not use default value for the min or max 
		
		
		
	}
}
