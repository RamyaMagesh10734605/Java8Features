package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Employee;
import data.EmployeeDB;

/*
 * We cannot add or modify elements in the stream. It is a fixed data set. Not like Collections.
 * Elements in the stream can be accessed only in sequence.
 * Streams are lazily constructed. Collections are eagerly constructed.
 * Streams can be traversed only once. 
 * Streams iterate internally. no foreach or loop to iterate.
 */
public class CollectionVsStream {
	
	//Debug peek() helps to see the streams output.
	public static void main(String[] args) {
		
		List<Employee> emps = EmployeeDB.getAllEmployees();
		emps.stream().peek(s->System.out.println(s))
		.filter(s->s.getSalary()>80000)
		.peek(s->System.out.println(s))
		.collect(Collectors.toList());
		
		//System.out.println(emps);
	}

}
