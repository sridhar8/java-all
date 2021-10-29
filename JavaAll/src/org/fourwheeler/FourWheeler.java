package org.fourwheeler;

import org.threewheeler.ThreeWheeler;

public class FourWheeler extends ThreeWheeler{
	
	public void car() {
System.out.println("Car");

	}
public void bus() {
System.out.println("bus");

}
public void lorry() {
System.out.println("lorry");	// TODO Auto-generated method stub

}
public static void main(String[] args) {
	FourWheeler fW = new FourWheeler();
	fW.Auto();
	fW.bus();
	fW.bike();
	
	
}
}
