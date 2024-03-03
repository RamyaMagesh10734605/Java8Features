package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Employee;
import data.EmployeeDB;

public class ConsBiConsPredInOneExample {
	
	public static void main(String[] args) {
		
		
		 
		 List<Employee> employees = EmployeeDB.getAllEmployees();
		 
		 
		 BiConsumer<String, List<String>> list = (a,b)->System.out.println(a + " " + b );
		 Predicate<Employee> checkSal= (X) -> X.getSalary()>80000;
		 
		 
		 employees.forEach(x-> {
			 if(checkSal.test(x)) 
			 list.accept(x.getName(),x.getTasks());  //we can assign this condition in consumer as well.
		 });
		 
		 //Using Predicate and BiConsumer in Consumer
		 Consumer<Employee> testSal = (x)->{
			 if(checkSal.test(x)) 
				 list.accept(x.getName(),x.getTasks());
		 };
		 
		 employees.forEach(testSal);
		 
		 
		 
	}

}
