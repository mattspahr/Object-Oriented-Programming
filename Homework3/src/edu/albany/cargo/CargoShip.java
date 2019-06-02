package edu.albany.cargo;

import edu.albany.Problem1.Ship;

public class CargoShip extends Ship {
	private int cargoCapacity;
	
	public CargoShip(String shipName, String yearBuilt, int cargoCapacity) {
		super(shipName, yearBuilt);
		this.cargoCapacity = cargoCapacity;
	}
	
	public int getCargoCapacity() {
		return this.cargoCapacity;
	}
	
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	public String toString() {
		return "Ship Name: " + super.getShipName() + " | Cargo Capacity (tonnage): " + this.cargoCapacity;
	}
}
