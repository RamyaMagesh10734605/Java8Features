package Optional;

import java.util.Optional;

import data.Employee;

public class OptionalExample1{
	
	  public static void main(String[] args) {
	
		  //ifPresent and isPresent
	
			Employee emp = null;
			emp =new Employee("Adam");
			
			 Optional<Employee> empp=Optional.ofNullable(emp);
			 
			 	if(empp.isPresent())
			 	{
			 		System.out.println(empp.get().getName());
			 	}

			 	empp.ifPresent((em)->System.out.println(em.getName()));
		}
}

