package org.edu.com;

public class Engg extends Arts {
	
	public void bE() {
		System.out.println("CSC");
		System.out.println("Mech");
		System.out.println("ECE");
		
	}
public void mE() {
System.out.println("M.Tech");
System.out.println("M.E");

}
public static void main(String[] args) {
	Engg e = new Engg();
	e.bE();
	e.mE();
	e.bA();
	e.bsc();
	e.bEd();

}
}
