package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

/*
 * partitioningBy - terminal operator. 
 * Accepts the predicate as an input and returns Map.
 * The key of the return type is boolean, True and False.
 * Two different versions of partitioningBy
 * One with predicate as input and other one with two arguments predicate and downstream
 */
public class CollectMethodsExample7 {

	public static void main(String[] args) {
		
		Map<Boolean, List<Employee>> empMap = EmployeeDB.getAllEmployees().stream().collect(Collectors.partitioningBy((emp)->emp.getSalary()>70000));
		System.out.println(empMap);
		//false and True as the key, and Employee objects as value 

		Map<Boolean, Set<Employee>> empMap1 = EmployeeDB.getAllEmployees().stream().collect(Collectors.partitioningBy((emp)->emp.getSalary()>70000,Collectors.toSet()));
		System.out.println(empMap1);  
	}
	
		
}
