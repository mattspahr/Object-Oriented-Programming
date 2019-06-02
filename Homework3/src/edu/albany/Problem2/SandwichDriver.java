package edu.albany.Problem2;

import edu.albany.person.customer.Customer;
import edu.albany.person.employee.cashier.Cashier;
import edu.albany.person.employee.sandwichmaker.SandwichMaker; 

public class SandwichDriver {
	
	public static void main(String[] args) {
		System.out.println("Testing Program: \n");
	
		Sandwich turkeySandwich = new Sandwich("Turkey Sandwich", 5.00);
		Sandwich bbqChickenSandwich = new Sandwich("BBQ Chicken Sandwich", 7.50);
		Sandwich pulledPorkSandwich = new Sandwich("Pulled Pork Sandwich", 10.00);
		Sandwich chickenCutletSandwich = new Sandwich("Chicken Cutlet Sandwich", 8.00);
		Sandwich italianSandwich = new Sandwich("Italian Sandwich", 7.50);
		
		Customer customer1 = new Customer("Matt", "Spahr", pulledPorkSandwich, 20.0);
		Customer customer2 = new Customer("Chris", "Spahr", turkeySandwich, 30.0);
		Customer customer3 = new Customer("Davis", "Diamond", chickenCutletSandwich, 40.0);
		Customer customer4 = new Customer("Steve", "Kunz", italianSandwich, 50.0);
		Customer customer5 = new Customer("Doug", "Goldsmith", bbqChickenSandwich, 5.0);
		
		System.out.println("5 Customers enter the Sandwich Shop and place orders: ");
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		System.out.println(customer3.toString());
		System.out.println(customer4.toString());
		System.out.println(customer5.toString());
		
		System.out.println("\nThe 3 Sandwich Makers begin making the sandwiches: ");
		SandwichMaker sMaker1 = new SandwichMaker("Connor", "Flip", 1, pulledPorkSandwich);
		SandwichMaker sMaker2 = new SandwichMaker("Pat", "Barrow", 2, turkeySandwich);
		SandwichMaker sMaker3 = new SandwichMaker("Dylan", "Rohme", 3, chickenCutletSandwich);
		
		System.out.println("The Sandwich Makers finish the first 3 sandwiches and"
				+ " give them to the respective customers to go pay.\nThey begin on the last two sandwiches.\n");
		
		sMaker1.setCurrentOrder(italianSandwich);
		sMaker2.setCurrentOrder(bbqChickenSandwich);
		 
		Cashier cashier = new Cashier("Nate", "S", 4, 100.0);
		
		System.out.println("Cashier Amount: $" + cashier.getCashAmount() + "\n");
		System.out.println(customer1.getFirstName() + " " + customer1.getLastName() + " paying $" 
				+ customer1.getOrder().getSandwichPrice() + " for " + customer1.getOrder().getSandwichName() + ":");
		System.out.println("Cashier amount before: " + cashier.getCashAmount());
		System.out.println("Customer amount before: " + customer1.getMoneyAmount());
		System.out.println("Transaction: ");
		Transaction trans1 = new Transaction(customer1, cashier);
		trans1.exchange();
		System.out.println("Cashier amount after: " + cashier.getCashAmount());
		System.out.println("Customer amount after: " + customer1.getMoneyAmount());
		
		System.out.println("*********************************");
		
		System.out.println(customer2.getFirstName() + " " + customer2.getLastName() + " paying $" 
				+ customer2.getOrder().getSandwichPrice() + " for " + customer2.getOrder().getSandwichName() + ":");
		System.out.println("Cashier amount before: " + cashier.getCashAmount());
		System.out.println("Customer amount before: " + customer2.getMoneyAmount());
		System.out.println("Transaction: ");
		Transaction trans2 = new Transaction(customer2, cashier);
		trans2.exchange();
		System.out.println("Cashier amount after: " + cashier.getCashAmount());
		System.out.println("Customer amount after: " + customer2.getMoneyAmount());
		
		System.out.println("*********************************");
		
		System.out.println(customer3.getFirstName() + " " + customer3.getLastName() + " paying $" 
				+ customer3.getOrder().getSandwichPrice() + " for " + customer3.getOrder().getSandwichName() + ":");
		System.out.println("Cashier amount before: " + cashier.getCashAmount());
		System.out.println("Customer amount before: " + customer3.getMoneyAmount());
		System.out.println("Transaction: ");
		Transaction trans3 = new Transaction(customer3, cashier);
		trans3.exchange();
		System.out.println("Cashier amount after: " + cashier.getCashAmount());
		System.out.println("Customer amount after: " + customer3.getMoneyAmount());
		
		System.out.println("*********************************");
		
		System.out.println("\nThe last 2 sandwiches are finished.\n");
		
		System.out.println("*********************************");
		
		System.out.println(customer4.getFirstName() + " " + customer4.getLastName() + " paying $" 
				+ customer4.getOrder().getSandwichPrice() + " for " + customer4.getOrder().getSandwichName() + ":");
		System.out.println("Cashier amount before: " + cashier.getCashAmount());
		System.out.println("Customer amount before: " + customer4.getMoneyAmount());
		System.out.println("Transaction: ");
		Transaction trans4 = new Transaction(customer4, cashier);
		trans4.exchange();
		System.out.println("Cashier amount after: " + cashier.getCashAmount());
		System.out.println("Customer amount after: " + customer4.getMoneyAmount());
		
		System.out.println("*********************************");
		
		System.out.println(customer5.getFirstName() + " " + customer5.getLastName() + " paying $" 
				+ customer5.getOrder().getSandwichPrice() + " for " + customer5.getOrder().getSandwichName() + ":");
		System.out.println("Cashier amount before: " + cashier.getCashAmount());
		System.out.println("Customer amount before: " + customer5.getMoneyAmount());
		System.out.println("Transaction: ");
		Transaction trans5 = new Transaction(customer5, cashier);
		trans5.exchange();
		System.out.println("Cashier amount after: " + cashier.getCashAmount());
		System.out.println("Customer amount after: " + customer5.getMoneyAmount());
		
	}
	
}
