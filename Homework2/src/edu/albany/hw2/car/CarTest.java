package edu.albany.hw2.car;

public class CarTest {
	
	public static void main(String[] args) {
		Odometer odo = new Odometer();
		FuelGauge fg = new FuelGauge(0.0);
		int mileCount = 0;
		
		System.out.println("Filling up gas tank");
		fg.setCurrentFuel(15.0);
		
		while (fg.getCurrentFuel() != 0) {
			if (mileCount == 22) {
				fg.useUpFuel();
				mileCount = 0;
				odo.incrementMileage();
			} else {
				odo.incrementMileage();
				mileCount++;
			}
			System.out.println("Current Mileage: " + odo.getMileage());
			System.out.println("Current Amount of Fuel: " + fg.getCurrentFuel());
		}
	}
}
