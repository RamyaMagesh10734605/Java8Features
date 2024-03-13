package streams;

import java.util.stream.Collectors;

import data.EmployeeDB;

public class SkipAndLimitExample {
	
	public static void main(String[] args) {
		
		System.out.println(EmployeeDB.getAllEmployees()
				.stream()
				.limit(2)
				.collect(Collectors.toList()));  //limits to 2, starting from first
		
		System.out.println(EmployeeDB.getAllEmployees()
				.stream()
				.skip(2)
				.collect(Collectors.toList()));  //Skips 2 from first
	}

}
