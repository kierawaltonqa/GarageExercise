package com.qa.garage;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.addVehicle(new Car("pink",2,"petrol","BMW"));
		g.addVehicle(new Motorbike("black", 1, "diesel", true));
		g.addVehicle(new Boat("white", 4, "petrol", "speed boat"));
		
		g.output();
		g.vehicleBill();
		
	}
	

}
