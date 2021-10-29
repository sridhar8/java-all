package org.edu.com;

public class Arts {
	
	public void bsc() {
System.out.println("computer science");
System.out.println("maths");
System.out.println("physics");
	}

	public void bEd() {
System.out.println("teacher training");

	}
public void bA() {
System.out.println("litrature");
System.out.println("english");
System.out.println("tamil");

}
private void bBA() {
System.out.println("communication");
}

public static void main(String[] args) {
	Arts a = new Arts();
	a.bA();
	a.bBA();
	a.bEd();
	a.bsc();
	
}
}
