package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import data.Employee;
import data.EmployeeDB;

public class BiConsumerFunctionalInterface {
	
	public static void main(String[] args) {
		
		 //Example 1: BiConsumer accepts two inputs.
		 BiConsumer<String, String> str = (a,b) -> System.out.println(a.concat(b));
		 str.accept("Hello ", "world");
		 
		 //Example 2: BiConsumer with Integers
		 BiConsumer<Integer, Integer> ints = (a,b) -> System.out.println(a*b);
		 
		 BiConsumer<Integer, Integer> div = (a,b) -> System.out.println(a/b);
		 
		 ints.andThen(div).accept(10, 5);
		 
		 //Example 3
		 
		 List<Employee> employees = EmployeeDB.getAllEmployees();
		 
		 
		 BiConsumer<String, List<String>> list = (a,b)->System.out.println(a + " " + b );
		 
		 employees.forEach(empl-> list.accept(empl.getName(), empl.getTasks())); //Note that we can pass BiConsumer also to the forEach

		 
		 Consumer<Employee> xx = (x)-> list.accept(x.getName(), x.getTasks());  //What is it trying to do???? 
		 //it is calling the biconsumer and sysouts the inputs.
		 
		 Consumer<Employee> xxs = (xs) -> System.out.println(xs.getName() + "" + xs.getTasks()); 
		 
		 employees.forEach(x-> xxs.accept(x));
		 
		 
		 
		 
		 
		 
		 
	}

}
