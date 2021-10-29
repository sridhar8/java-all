package org.edu.com;

public class Medicine extends Engg {
public void physiyo() {
System.out.println("allopathy");
System.out.println("homiopathy");
}
public void dental() {
System.out.println("Bds");

}
private void mbbs() {
System.out.println("surgenm");
}
public static void main(String[] args) {
	Medicine m = new Medicine();
	m.bA();
	m.bE();
	m.bsc();
	m.bEd();
	m.dental();
	m.mbbs();
}}
