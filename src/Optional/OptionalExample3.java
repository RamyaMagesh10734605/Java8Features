package Optional;

import java.util.Optional;

import data.Employee;

public class OptionalExample3{
	
	  public static void main(String[] args) {
	
		  //map() - returns optional<input type>, filter() and flatMap()
	
		//Use map if the function returns the object you need or flatMap if the function returns an Optional. 
		  
		  Employee emp = new Employee("Adam");
		  emp.setBonus(Optional.of(3000.0));
			 Optional<Employee> empp=Optional.ofNullable(emp);
			 
			empp.filter((x)->x.getSalary()<70000).ifPresent((x)->System.out.println(x));
			 
			Optional<Double> sal = empp.map((x)->x.getSalary());
             System.out.println(sal.get());
             
             System.out.println(empp.map((x)->x.getBonus())); 
             //output: Optional[Optional[3000.0]]
             
             System.out.println(empp.flatMap((x)->x.getBonus()));
             //output: Optional[3000.0]
             
             
	  }
}

