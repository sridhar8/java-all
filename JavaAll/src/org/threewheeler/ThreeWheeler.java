package org.threewheeler;

import org.twowheelerr.TwoWheeler;

public class ThreeWheeler  extends TwoWheeler {

	public void Auto() {
		System.out.println("Share auto");
		
	}
	public static void main(String[] args) {
		ThreeWheeler tW = new ThreeWheeler();
		tW.Auto();
		tW.bike();
	
	}
}
