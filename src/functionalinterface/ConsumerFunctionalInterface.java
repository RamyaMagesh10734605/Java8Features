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
public class ConsumerFunctionalInterface {
	
	//Consumer is an interface with accept abstract method. accept has one input and 
	//returns void.
	//It also has a default method , andThen(Consumer after) and returns Consumer.
	
	public static void main(String[] args) {
		
		//Example1 with String
		Consumer<String> ss= (x) -> System.out.println(x.toUpperCase());
		ss.accept("hello");
		
		//Example2 - get the employee names
		List<Employee> emps = EmployeeDB.getAllEmployees();
		
		Consumer<Employee> ccc = (emp) -> System.out.println(emp.getName());
		emps.forEach(ccc); //forEach accepts Consumer input. forEach is from 1.8 in list interface.
		
		//Example3 - get the employee names and Tasks
		Consumer<Employee> cc = (emp) -> System.out.print(emp.getName());
		Consumer<Employee> ccc1 = (emp) -> System.out.println(emp.getTasks());
		emps.forEach(cc.andThen(ccc1)); // Consumer Chaining, we can use andThen 'N' number of times. andThen(ccc1).andThen(cc2).andThen(x)
		
		System.out.println("---------------------------------");
		//Example4 - get the employees with salary > 80000.
         emps.forEach(employee -> {
        	 if(employee.getSalary()>80000) {
        		 cc.andThen(ccc1).accept(employee); //NOTE THAT andThen FIRST AND LAST accept
        	 }
         });
		
	  
		
		
	}

}
