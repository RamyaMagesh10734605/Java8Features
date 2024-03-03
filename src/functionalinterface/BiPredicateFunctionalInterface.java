package functionalinterface;
import java.util.List;
import java.util.function.*;

import data.Employee;
import data.EmployeeDB;

 
public class BiPredicateFunctionalInterface {
	
	//BiPredicate is an interface with test abstract method. test has two inputs and 
	//returns boolean.
	//It also has some default methods , and(BiPredicate after), or(BiPredicate after), negate().
	
	public static void main(String[] args) {
		
		
		
		List<Employee> empls = EmployeeDB.getAllEmployees();
		
		//Defining in several ways of Predicate
		
		//1.
		Predicate<Employee> salGT80000 = (X) -> X.getSalary()>80000;
		Predicate<Employee> designation = (X) -> X.getDesignation().equalsIgnoreCase("Project Manager");
		
		//2.
		Predicate<Employee> salAndDesg = (X) -> X.getSalary()>80000 && X.getDesignation().equalsIgnoreCase("Project Manager");
		
		//3.
		BiPredicate<Double, String> salAndDesgBi = (X,Y) -> X>80000 && Y.equalsIgnoreCase("Project manager");
		
		
		
        System.out.println("Output of 1.");
		empls.forEach(emp -> {
			if(salGT80000.and(designation).test(emp)) System.out.println(emp);
		});
		
		System.out.println("Output of 2.");
		empls.forEach(emp -> {
			if(salAndDesg.test(emp)) System.out.println(emp);
		});
			
		System.out.println("Output of 3.");
		empls.forEach(emp -> {
			if(salAndDesgBi.test(emp.getSalary(),emp.getDesignation())) System.out.println(emp);
		});
				
			
		
		
		
		
		
	
		
		
		
	  
		
		
	}

}
