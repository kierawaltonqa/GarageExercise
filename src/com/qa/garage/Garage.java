package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicleList = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}

	public void removeVehicle(Vehicle v) {
		vehicleList.remove(v);
	}

	public void empty() {
		vehicleList.clear();
	}

	public void vehicleBill() {
		int bill = 0;
		for (Vehicle v : vehicleList) {
			if (v instanceof Car) {
				bill = v.getEngineSize() * 100;
				System.out.println("bill for " + v + " is " + bill);
			}
			if (v instanceof Motorbike) {
				bill = v.getEngineSize() * 100;
				System.out.println("bill for " + v + " is " + bill);
			}
			if (v instanceof Boat) {
				bill = v.getEngineSize() * 100;
				System.out.println("bill for " + v + " is " + bill);
			}
		}
	}

	public void output() {
		for (Vehicle v : vehicleList) {
			System.out.println(v);
		}
	}

}
