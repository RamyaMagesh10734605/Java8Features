package functionalinterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

import data.Employee;
import data.EmployeeDB;

 
public class UnaryOperatorFunctionalInterface {
	
	//UnaryOperator extends Function Functional Interface. The Function expects two parameters. One is input with some type, another 
	//as output with diff. type. If both the types are same, we can use UnaryOperator.
	//It also has only one static method overriden , identity(Function). It extends Function so it has apply, andThen and compose.
	
	public static void main(String[] args) {
	
		UnaryOperator<String> f1 = (name) -> "Hello "+name;
		
		System.out.println(f1.apply("Ramya"));  // output: Ramya Magesh
		
		
		
		
	}

}
