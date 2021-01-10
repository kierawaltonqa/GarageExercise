package com.qa.garage;

public class Boat extends Vehicle {
	
	private String type;

	@Override
	public String toString() {
		return "Boat [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boat(String colour, int engineSize, String fueltype, String type) {
		super(colour, engineSize, fueltype);
		this.type = type;
	}
	
	

}
