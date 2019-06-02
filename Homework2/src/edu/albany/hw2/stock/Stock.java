package edu.albany.hw2.stock;

public class Stock {

	Symbol symbol;
	private double previousClosingPrice;
	private double currentPrice;
	
	public enum Symbol {
		MSFT("Microsoft"),
		AAPL("Apple"),
		GOOG("Google"),
		AMZN("Amazon"),
		ATT("AT&T");
		
		private String name;
		
		private Symbol(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
	}
	
	public Stock(Symbol symbol) {
		this.symbol = symbol;
	}
	
	public Symbol getSymbol() {
		return this.symbol;
	}
	
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public void setPreviousClosingPrice(double prevClosingPrice) {
		this.previousClosingPrice = prevClosingPrice;
	}
	
	public void setCurrentPrice(double currPrice) {
		this.currentPrice = currPrice;
	}
	
	public double getPercentChange() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
