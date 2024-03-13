package streams;

import data.EmployeeDB;

public class AnyMatchAllMatchNoneMatchExample {
	
	public static void main(String[] args) {
		
		//Anymatch, Allmatch and Nonematch accepts predicate and returns boolean
		
	System.out.println(EmployeeDB.getAllEmployees().stream().allMatch(x->x.getSalary()>7000)); //true, if all matches with this cdn.
	System.out.println(EmployeeDB.getAllEmployees().stream().anyMatch(x->x.getSalary()>7000)); //true, if any matches with this cdn.
	System.out.println(EmployeeDB.getAllEmployees().stream().noneMatch(x->x.getSalary()>7000));//false, if nonw matches with this cdn.

		
	}

}
