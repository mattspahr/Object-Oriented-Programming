package edu.albany.hw2.car;

public class Odometer {
	private double mileage;
	private final double MAX_MILES = 999999.0; 
	
	public Odometer(double miles) {
		mileage = miles;
	}
	
	public Odometer() {
		this.mileage = 0.0;
	}
	
	public void setMileage(double miles) {
		this.mileage = miles;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void incrementMileage() {
		if (MAX_MILES == mileage) {
			mileage = 0;
		} else {
			mileage++;
		}
	}
}
