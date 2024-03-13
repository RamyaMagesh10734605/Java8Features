package Optional;

import java.util.Optional;

import data.Employee;

public class OptionalExample2{
	
	  public static void main(String[] args) {
	
		  //orElse, OrElseGet and orElseThrow
	
			Employee emp = null;
			//emp =new Employee("Adam");
			
			 Optional<Employee> empp=Optional.ofNullable(emp);
			 
			System.out.println(empp.map(Employee::getName).orElse("NoName"));
			 
			System.out.println(empp.map(Employee::getName).orElseGet(()->"NoName"));
			
			//empp.map(Employee::getName).orElseThrow();
			
			System.out.println(empp.map(Employee::getName).orElseThrow(NullPointerException::new));

			
		}
}

