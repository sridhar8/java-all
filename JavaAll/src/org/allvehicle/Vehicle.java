package org.allvehicle;

import org.fourwheeler.FourWheeler;

public class Vehicle extends FourWheeler {
	
	private void vehicle() {
	System.out.println("Bike");
	System.out.println("Bus");
	System.out.println("Car");
	}
public static void main(String[] args) {
	Vehicle v = new Vehicle();
	v.vehicle();
	v.Auto();
	v.bike();v.bus();
	v.car();
}
}
