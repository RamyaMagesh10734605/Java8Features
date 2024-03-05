package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import data.Employee;

/*
 * Method Reference is the shortcut for lamda expression. As name suggests, it is referring to a method.
 * It is to simplify the implementation of Functional Interface.
 *
 * Syntax of method reference
 * --------------------------
 * ClassName::staticMethodName
 * ClassName::InstanceMethodName
 * ClassName::new
 * 
 */
public class MethodReferenceExample {
	
	public static String toLowerCasemtd(String ss) {
		return ss.toLowerCase();
	}
	
	public static void main(String[] args) {
		
		//What I know before I start learning
		Consumer<Integer> p= System.out::println;//System is a final class, out is the Printstream instance println is a method. 
		p.accept(2); //className::Instancemethodname
		
		//What I know before I start learning
		Function<String,String> s =  String::toUpperCase; //1.Class::InstanceMethodName
		System.out.println(s.apply("Ramya")); 
		
		
		UnaryOperator<String> aa = (x)-> MethodReferenceExample.toLowerCasemtd(x); 
		
		System.out.println(aa.apply("TEST"));
		//Replacing above lamda function to this
		UnaryOperator<String> a = MethodReferenceExample::toLowerCasemtd;  //2.Class::StaticMethodName
		
		System.out.println(a.apply("TEST"));
		
		//className::new - it is related to constructor, as it is invoked during instance creation.
		//It is applicable for functional interface, not for general instantiation.
		Supplier<Employee> emp = ()-> {
			return new Employee(); 
		};
		System.out.println(emp.get());
		
		
		//To change the above lamda to method reference
		Supplier<Employee> xx = Employee::new;
		System.out.println(xx.get());  //calling the empty constructor.
		
		
		Function<String,Employee> xxq = Employee::new; //Calling Constructor with String input parameter Employee(String name)
		System.out.println(xxq.apply("Ramya"));  //calling the empty constructor.
		
		
		//Employee xxx = Employee::new;  // this is not possible. the method reference is only for lamda.
		
		}

}
