package edu.albany.Problem1;

public class Ship {
	private String shipName;
	private String yearBuilt;
	
	public Ship(String shipName, String yearBuilt) {
		this.shipName = shipName;
		this.yearBuilt = yearBuilt;
	}
	
	public String getShipName() {
		return this.shipName;
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public String getYearBuilt() {
		 return this.yearBuilt;
	}
	
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	public String toString() {
		return "Ship Name: " + shipName + " | Year Built: " + yearBuilt;
	}
}
