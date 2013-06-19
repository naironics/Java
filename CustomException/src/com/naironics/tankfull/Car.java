package com.naironics.tankfull;

public class Car {

	private double carFullTankCapacity;
	private double carCurrentTankCapacity;

	public Car(double fullCapacity, double currentCapacity) {
		this.carFullTankCapacity = fullCapacity;
		this.carCurrentTankCapacity = currentCapacity;
	}

	public void fillFuelOnCar(double fuelAmount) throws TankFullException {

		if ((this.carCurrentTankCapacity + fuelAmount) > this.carFullTankCapacity) {
			throw new TankFullException("Tank is Full. Stop Filling Gasoline");
		}
	}

	public static void main(String[] args) {
		// provide argument through command line
		double fuelAmountToFill = Double.parseDouble(args[0]);

		Car audi = new Car(45.0, 23.5);

		try {
			audi.fillFuelOnCar(fuelAmountToFill);
		} catch (TankFullException tfe) {
			tfe.printStackTrace();
		}
	}

}
