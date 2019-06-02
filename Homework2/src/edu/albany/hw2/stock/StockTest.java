package edu.albany.hw2.stock;

public class StockTest {
	
	public static void main(String[] args) {
		Stock microsoftStock = new Stock(Stock.Symbol.MSFT);
		microsoftStock.setPreviousClosingPrice(58.9);

		microsoftStock.setCurrentPrice(59);
		System.out.println("The percent change in Microsoft stock is: " + microsoftStock.getPercentChange() + "%");
		
		Stock googleStock = new Stock(Stock.Symbol.GOOG);
		googleStock.setPreviousClosingPrice(100);
		googleStock.setCurrentPrice(98.5);
		System.out.println("The percent change in Google stock is: " + googleStock.getPercentChange() + "%");
	}	
}