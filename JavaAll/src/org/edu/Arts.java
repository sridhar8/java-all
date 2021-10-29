package org.edu;

public class Arts extends Education {

private void bSc() {
System.out.println("full form of bSc is ");
}

private void bEd() {
System.out.println("Bachilour of education");
}
private void bA() {
System.out.println("Bachilour of arts");

}
private void bBA() {
System.out.println("admin");
}

@Override
	public void ug(String m) {
System.out.println("hgf");
super.ug(m);
	}
@Override
	public void pg(String n) {
System.out.println("yhv");
super.pg(n);
	}
public static void main(String[] args) {
	Arts a = new Arts();
	a.bA();
	a.bBA();
	a.bEd();
	a.bSc();
	a.pg("jgvfjh");
	a.ug("kblib");

}

}
