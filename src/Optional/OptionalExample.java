package Optional;

import java.util.Optional;

import data.Employee;

/*
 * Introduced as part of java 8 to represent a Non-null value.
 * to Avoid Null pointer Exception and unnecessary Null Checks.
 */
public class OptionalExample {
	
	public static String getStudentName() {
		
		Employee emp = null;
		//emp =new Employee("Adam");
		
		if(emp!=null)
			return emp.getName();
		
		return null;
	}
	
	//OfNullable is helpful if the value is going to have null, it will check for null and send empty.
public static Optional<String> getStudentNameOfNullable() {
		
		Employee emp = null;
		emp =new Employee("Adam");
		
		 Optional<Employee> empp=Optional.ofNullable(emp);
		 if(empp.isPresent())
			 return empp.map((empd)-> empd.getName());
		 else
			return Optional.empty();
		 
	}
	
public static Optional<String> getStudentNameOf() {
	
	Employee emp = null;
	emp =new Employee("Adam");
	
	 Optional<Employee> empp=Optional.of(emp);
	 if(empp.isPresent())
		 return empp.map((empd)-> empd.getName());
	 else
		return Optional.empty();
	 
}

	public static void main(String[] args) {

		Optional<String> name = getStudentNameOfNullable();
		if(name.isPresent())
			System.out.println(name.get().length());
		else
			System.out.println("Name not found!");
	}

}
