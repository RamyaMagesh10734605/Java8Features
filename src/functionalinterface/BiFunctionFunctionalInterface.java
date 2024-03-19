package functionalinterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Employee;
import data.EmployeeDB;

 
public class BiFunctionFunctionalInterface {
	
	//Function is an interface with two parameters, one for input and another for output. Function is similar to methods 
	//in java and can be assigned to a variable with a functionality definition.
	//it has apply SAM, has one input and 
	//returns output parameter type.
	//It also has some default methods , andThen(Function), compose(Function ).
	//It also has static method identity() returns input parameter.
	
	public static void main(String[] args) {
	
		Function<String, String> f = (name) -> name.toUpperCase();
		Function<String, String> f1 = (name) -> name+" with another Function";
		Function<String, String> f2 = (name) -> name.concat(" end word");
		
		
		System.out.println(f.andThen(f1).apply("test"));  // output: TEST with another Function
		
		//Compose first do its parameter condition first and do the previous function next
		System.out.println(f.compose(f1).apply("test"));  // output: TEST WITH ANOTHER FUNCTION
		
		System.out.println(f.compose(f1).andThen(f2).apply("test"));  // output: TEST WITH ANOTHER FUNCTION end word
		
		System.out.println(f.compose(f1).compose(f2).apply("test"));  // output: TEST END WORD WITH ANOTHER FUNCTION

		
		Function<List<Employee>,Map<Integer,Double>> empSal = (employees) ->{
			Map<Integer, Double> salMap = new HashMap<>();
			employees.forEach(x->{
				salMap.put(x.getEmpNo(), x.getSalary());
			});
			
			return salMap;
			
		};
		
		System.out.println(empSal.apply(EmployeeDB.getAllEmployees()));
		
	}

}
