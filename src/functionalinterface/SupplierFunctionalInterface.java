package functionalinterface;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

import data.Employee;
import data.EmployeeDB;

 
public class SupplierFunctionalInterface {
	
	//Supplier Functional Interface has no input parameter and returns output.
	//It has a only on SAM, get(),
	
	public static void main(String[] args) {
	
		Supplier<Employee> emp = () -> {return new Employee("Ramya", 0, Arrays.asList("working", "cooking"), 0, "allrounder");};
		
		System.out.println(emp.get());
		
		Supplier<List<Employee>> emplist = () -> {return EmployeeDB.getAllEmployees();};
		System.out.println(emplist.get());
		
	}

}
