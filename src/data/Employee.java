package data;

import java.util.List;
import java.util.Optional;

public class Employee {
	
	private String name;
	private int empNo;
	private List<String> tasks;
	private String domain;
	Optional<Double> bonus;
	
	public Optional<Double> getBonus() {
		return bonus;
	}
	public void setBonus(Optional<Double> bonus) {
		this.bonus = bonus;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	double salary;
	private String designation;
	public String getName() {
		return name;
	}
	public Employee(String name, int empNo, List<String> tasks, String domain, Optional<Double> bonus, double salary,
			String designation) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.tasks = tasks;
		this.domain = domain;
		this.bonus = bonus;
		this.salary = salary;
		this.designation = designation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public List<String> getTasks() {
		return tasks;
	}
	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee() {
		
	}
	
public Employee(String name) {
		this.name= name;
	}
	public Employee(String name, int empNo, List<String> tasks, String domain, double salary, String designation) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.tasks = tasks;
		this.domain = domain;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", tasks=" + tasks + ", domain=" + domain + ", bonus="
				+ bonus + ", salary=" + salary + ", designation=" + designation + "]";
	}
	

}
