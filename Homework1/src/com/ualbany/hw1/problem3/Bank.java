/*
 * @author Matthew Spahr
 * 001286580
 * CSI 405
 * 
 * Homework 1
 * Due: 2/28/19
 */

package com.ualbany.hw1.problem3;

import java.util.ArrayList;

public class Bank {
		
	private String name; 
	private Address address; 
	private ArrayList<CheckingBankAccount> bankAccounts = new ArrayList<CheckingBankAccount>();
	
	public Bank(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void addAccount(CheckingBankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}
	
	public void removeAccount(CheckingBankAccount bankAccount) {
		bankAccounts.remove(bankAccount);
	}
	
	public static void main(String[] args) {	
		Address personAddress = new Address("464 Hudson Ave", "Albany", "New York", "12203");
		Person person1 = new Person("Matt", "Spahr", personAddress);
		Address bankAddress = new Address("1400 Washington Ave", "Albany", "New York", "12222");
		Bank bank1 = new Bank("Teachers Federal Credit Union", bankAddress);
		
		System.out.println("Name: " + person1.getFirstName() + " " + person1.getLastName());
		System.out.println("Bank: " + bank1.getName());
		
		CheckingBankAccount acct1 = new CheckingBankAccount(1000, person1);
		bank1.addAccount(acct1);
		
		acct1.deposit(1000);
		
		System.out.println("\nDeposit:");
		System.out.println("Name: " + acct1.getPerson().getFirstName() + " " + acct1.getPerson().getLastName());
		System.out.println(acct1.getPerson().getAddress().toString());
		System.out.println("Account Balance: " + acct1.getValue());
		
		acct1.withdrawl(500);
		System.out.println("\nWithdrawl:");
		System.out.println("Name: " + acct1.getPerson().getFirstName() + " " + acct1.getPerson().getLastName());
		System.out.println(acct1.getPerson().getAddress().toString());
		System.out.println("Account Balance: " + acct1.getValue());
	}
}