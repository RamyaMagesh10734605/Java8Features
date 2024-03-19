package functionalinterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import data.Employee;
import data.EmployeeDB;

 
public class FunctionFunctionalInterface {
	
	//BiFunction is an interface with three parameters, two for inputs and another for output. 
	//It also has one default method , andThen(Function).
	
	public static void main(String[] args) {
	
		BiFunction<String,String, String> f = (name,lname) -> name.concat(" "+lname);
		Function<String,String> f1 = (name) -> "Hello "+name;
		
		System.out.println(f.apply("Ramya","Magesh"));  // output: Ramya Magesh
		
		//Compose first do its parameter condition first and do the previous function next
		System.out.println(f.andThen(f1).apply("Ramya","Magesh"));  // output: Hello Ramya Magesh
		
	 
		
		BiFunction<List<Employee>, Predicate<Double>,Map<String,List<String>>> empSal = (employees, DesgCdn) ->{
			Map<String, List<String>> taskMap = new HashMap<>();
			employees.forEach(x->{
				if(DesgCdn.test(x.getSalary()))
					taskMap.put(x.getName(), x.getTasks());
			});
			
			return taskMap;
			
		};
		
		System.out.println(empSal.apply(EmployeeDB.getAllEmployees(), (x)->x>80000));
		
	}

}
