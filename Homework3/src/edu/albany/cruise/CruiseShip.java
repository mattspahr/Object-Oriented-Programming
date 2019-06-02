package edu.albany.cruise;


import edu.albany.Problem1.Ship;

public class CruiseShip extends Ship {

	private int maxPassengers;
	
	public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
		super(shipName, yearBuilt);
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers() {
		return this.maxPassengers;
	}
	
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public String toString() {
		return "Ship Name: " + this.getShipName() + " | Max Passengers: " + this.maxPassengers;
	}
}
