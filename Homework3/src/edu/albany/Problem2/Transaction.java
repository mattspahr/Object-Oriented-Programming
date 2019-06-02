package edu.albany.Problem2;

import edu.albany.person.customer.Customer;
import edu.albany.person.employee.sandwichmaker.SandwichMaker;
import edu.albany.person.employee.cashier.Cashier;

public class Transaction {
	
	private Customer customer;
	private Cashier cashier;
	
	public Transaction(Customer customer, Cashier cashier) {
		this.customer = customer;
		this.cashier = cashier;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public Cashier getCashier() {
		return this.cashier;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}
	
	public void exchange() {
		double customSandPrice = customer.getOrder().getSandwichPrice();
		
		int flag = customer.pay();
		if (flag > 0) {
			cashier.addMoney(customSandPrice);
		}
	}
}