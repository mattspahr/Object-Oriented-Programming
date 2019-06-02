package edu.albany.person.employee.sandwichmaker;

import edu.albany.person.employee.Employee;
import edu.albany.Problem2.Sandwich;

public class SandwichMaker extends Employee{
	private Sandwich currentOrder;
	
	public SandwichMaker(String firstName, String lastName, int employeeId, Sandwich currentOrder) {
		super(firstName, lastName, employeeId);
		this.currentOrder = currentOrder;
	}
	
	public Sandwich getCurrentOrder() {
		return this.currentOrder;
	}
	
	public void setCurrentOrder(Sandwich currentOrder) {
		this.currentOrder = currentOrder;
	}
	
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + 
				" | EmployeeID: " + this.getEmployeeId() + 
				" | Current Order: " + this.currentOrder;
	}
}
