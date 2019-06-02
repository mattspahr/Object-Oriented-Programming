package edu.albany.Problem2;

public class Sandwich {
	private String sandwichName;
	private double sandwichPrice;
	
	public Sandwich(String sandwichName, double sandwichPrice) {
		this.sandwichName = sandwichName;
		this.sandwichPrice = sandwichPrice;
	}
	
	public String getSandwichName() {
		return this.sandwichName;
	}
	
	public double getSandwichPrice() {
		return this.sandwichPrice;
	}
	
	public void setSandwichName(String sandwichName) {
		this.sandwichName = sandwichName;
	}
	
	public void setSandwichPrice(double sandwichPrice) {
		this.sandwichPrice = sandwichPrice;
	}
}
