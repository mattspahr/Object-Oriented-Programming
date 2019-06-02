/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem3;

public class Person {
	private String firstName;
	private String lastName;
	private Address address;
	private CheckingBankAccount bankAccount;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public Person(String firstName, String lastName, Address address, CheckingBankAccount bankAccount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.bankAccount = bankAccount;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setCheckingBankAccount(CheckingBankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public CheckingBankAccount getBankAccount() {
		return bankAccount;
	}
}