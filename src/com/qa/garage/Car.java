package com.qa.garage;

public class Car extends Vehicle {

	private String model;

	public Car(String colour, int engineSize, String fueltype, String model) {
		super(colour, engineSize, fueltype);
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
