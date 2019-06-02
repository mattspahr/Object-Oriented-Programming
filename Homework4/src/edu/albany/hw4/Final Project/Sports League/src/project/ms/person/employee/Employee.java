package project.ms.person.employee;

import project.ms.person.Person;

public abstract class Employee<T> extends Person{
	private int employeeId;
	protected static int count = 0;
	
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
		this.employeeId = count++;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		Employee.count = count;
	}
}