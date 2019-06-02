package edu.albany.person.customer;

import edu.albany.person.Person;
import edu.albany.Problem2.Sandwich;

public class Customer extends Person{
	
	private Sandwich order;
	private double moneyAmount;
	
	public Customer(String firstName, String lastName, double moneyAmount) {
		super(firstName, lastName);
		this.moneyAmount = moneyAmount;
	}
		
	public Customer(String firstName, String lastName, Sandwich order, double moneyAmount) {
		super(firstName, lastName);
		this.order = order;
		this.moneyAmount = moneyAmount;
	}
	
	public Sandwich getOrder() {
		return order;
	}
	
	public void setOrder(Sandwich order) {
		this.order = order;
	}
	
	public double getMoneyAmount() {
		return this.moneyAmount;
	}
	
	public void setMoneyAmount(double amount) {
		this.moneyAmount = amount;
	}
	
	/*
	 * returns 1 - If customer has enough money to pay for sandwich
	 * returns -1 - If customer does not have enough money to pay for sandwich
	 */
	public int pay() {
		double amountDue = order.getSandwichPrice();
		if (amountDue > moneyAmount) {
			System.out.println("Insufficient Funds");
			return -1;
		} else {
			moneyAmount -= amountDue;
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + 
				"| Order: " + this.order.getSandwichName();
	}
}