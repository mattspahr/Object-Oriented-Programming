package edu.albany.hw2.car;

public class FuelGauge {

	private double currentFuel;
	
	public FuelGauge(double currentFuel) {
		this.currentFuel = currentFuel;
	}
	
	public void setCurrentFuel(double cf) {
		this.currentFuel = cf;
	}
	
	public double getCurrentFuel() {
		return currentFuel;
	}
	
	public void fillUpFuel() {
		if (currentFuel < 15) {
			currentFuel++;
		}
	}
		
	public void useUpFuel() {
		if (currentFuel > 0) {
			currentFuel--;
		}
	}	
}
