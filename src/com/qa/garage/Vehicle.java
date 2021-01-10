package com.qa.garage;

public class Vehicle {
	private String colour;
	private int engineSize;
	private String fueltype;
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", engineSize=" + engineSize + ", fueltype=" + fueltype + "]";
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public Vehicle(String colour, int engineSize, String fueltype) {
		super();
		this.colour = colour;
		this.engineSize = engineSize;
		this.fueltype = fueltype;
	}
	
	

}
