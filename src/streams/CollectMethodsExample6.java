package streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

/*
 * groupingBy - terminal operator. 
 * same like groupBy in SQL, groups the elements based on a condition
 * it returns map with key as the groupingBy condition, and value as the collection it is passed as a stream
 */
public class CollectMethodsExample6 {

	public static void main(String[] args) {
		
		//Single parameter
		Map<String,List<Employee>> empmap = EmployeeDB.getAllEmployees().stream().collect(Collectors.groupingBy(Employee::getDomain));  
		System.out.println(empmap);
		
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.groupingBy(emp-> emp.getSalary()>120000?"LEAD AND ABOVE":"ASSOCIATE LEVEL")));
		
		//double parameter, two groupingBy
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.groupingBy(Employee::getDomain,
				Collectors.groupingBy(emp-> emp.getSalary()>120000?"LEAD AND ABOVE":"ASSOCIATE LEVEL"))));
		
		//group by domain and sum the salaries given on the particular domain
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.groupingBy(Employee::getDomain,
				   Collectors.summingDouble(Employee::getSalary))));
		
		//three parameter groupingBy
		System.out.println(EmployeeDB.getAllEmployees().stream().collect(Collectors.groupingBy(Employee::getDomain,LinkedHashMap::new, Collectors.toSet())));
		
		
		//Using maxby and groupingBy - finding max salary on both domains
		System.out.println(EmployeeDB.getAllEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDomain,Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
				);
		
		//Using minBy and groupingBy - finding min salary on both domains
		System.out.println(EmployeeDB.getAllEmployees().stream()
		.collect(Collectors.groupingBy(Employee::getDomain,Collectors.minBy(Comparator.comparing(Employee::getSalary))))
		);

		//above example with collectingAndThen() to collect as an object from Optional Return type
		System.out.println(EmployeeDB.getAllEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDomain,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getSalary)),Optional::get))))
				;
		
	}
	
		
}
