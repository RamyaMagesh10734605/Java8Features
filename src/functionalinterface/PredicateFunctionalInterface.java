package functionalinterface;
import java.util.List;
import java.util.function.*;

import data.Employee;
import data.EmployeeDB;

/* 
 * It is present since java 1.0.
 * Functional interface are the interface with Single abstract method.
 * @FunctionalInterface is an optional annotation to check the contract of SAM.
 * The primary Functional Interfaces are Consumer, Supplier, Function, Predicate.
 * It also has extensions like BiConsumer, BiSupplier, BiFunction, UnaryOperator, 
 * BinaryOperator and BiPredicate
 * 
 */
public class PredicateFunctionalInterface {
	
	//Predicate is an interface with test abstract method. test has one input and 
	//returns boolean.
	//It also has some default methods , and(Predicate after), or(Predicate after), negate().
	
	public static void main(String[] args) {
		
		//Example1 with Integer
		Predicate<Integer> findEven= (x) -> x%2==0;
		
		Predicate<Integer> divisibleBy5 = (x) -> x%5==0;
		
		Predicate<Integer> divisibleBy4 = (x) -> x%4==0;
		
		System.out.println(findEven.and(divisibleBy5).test(10));
		System.out.println(findEven.and(divisibleBy5).or(divisibleBy4).test(10));
		System.out.println(findEven.and(divisibleBy5).or(divisibleBy4).negate().test(10));
		
		
		List<Employee> empls = EmployeeDB.getAllEmployees();
		//get the employees with salary > 80000.
		
		Predicate<Employee> salGT80000 = (X) -> X.getSalary()>80000;
		Predicate<Employee> designation = (X) -> X.getDesignation().equalsIgnoreCase("Project Manager");

		empls.forEach(emp -> {
			if(salGT80000.and(designation).negate().test(emp)) System.out.println(emp);
		});
		
		
		
		
		
	
		
		
		
	  
		
		
	}

}
