/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem1;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee() {
		firstName = "";
		lastName = "";
		monthlySalary = 0.0;
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = 0.0;
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary < 0)
			this.monthlySalary = 0.0;
		else 
			this.monthlySalary = monthlySalary;
	}
	
	// Setter Method for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Setter Method for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Setter Method for monthlySalary
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary < 0)
			this.monthlySalary = 0.0;
		else 
			this.monthlySalary = monthlySalary;
	}
	
	// Getter Method for firstName - returns firstName
	public String getFirstName() {
		return this.firstName;
	}
	
	// Getter Method for lastName - returns lastName
	public String getLastName() {
		return this.lastName;
	}
	
	// Getter Method for monthlySalary - returns monthlySalary
	public double getMonthlySalary() {
		return this.monthlySalary;
	}
}
