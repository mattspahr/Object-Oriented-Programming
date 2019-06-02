package edu.albany.person.employee;

import edu.albany.person.Person;

public class Employee extends Person {
	private int employeeId;
	
	public Employee(String firstName, String lastName, int employeeId) {
		super(firstName, lastName);
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + 
				"| EmployeeID: " + this.employeeId;
	}
}