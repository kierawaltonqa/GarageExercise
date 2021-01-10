package com.qa.garage;

public class Motorbike extends Vehicle {

	private boolean offRoad;

	public boolean isOffRoad() {
		return offRoad;
	}

	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}

	public Motorbike(String colour, int engineSize, String fueltype, boolean offRoad) {
		super(colour, engineSize, fueltype);
		this.offRoad = offRoad;
	}

	@Override
	public String toString() {
		return "Motorbike [offRoad=" + offRoad + "]";
	}
	
	
}
