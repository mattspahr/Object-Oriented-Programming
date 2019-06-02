/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem3;

public class CheckingBankAccount {
	private double value; 
	private Person person;
		
	public CheckingBankAccount(double value, Person person) {
		this.value = value;
		this.person = person;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}

	public double getValue() {
		return this.value;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public void withdrawl(double amount) {
		value = value - amount;
	}
	
	public void deposit(double amount) {
		value = value + amount;
	}
}