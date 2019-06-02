package edu.albany.person.employee.cashier;

import edu.albany.person.employee.Employee;

public class Cashier extends Employee {
	
	private double cashAmount;
	
	public Cashier(String firstName, String lastName, int employeeId, double cashAmount) {
		super(firstName, lastName, employeeId);
		this.cashAmount = cashAmount;
	}
	
	public double getCashAmount() {
		return this.cashAmount;
	}
	
	public void setCashAmount(double cashAmount) {
		this.cashAmount = cashAmount;
	}
	
	public void addMoney(double amount) {
		this.cashAmount += amount;
	}
	
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + 
				" | EmployeeID: " + this.getEmployeeId() + 
				" | Cash Amount: " + this.cashAmount;
	}
}
