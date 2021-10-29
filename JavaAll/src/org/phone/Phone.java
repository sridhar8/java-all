package org.phone;

public class Phone {
public void phoneInfo(String z) {
System.out.println("My Phone Name is "+z);
}
private void phoneInfo(String z, int x) {
System.out.println("My Phone Name and Model number is "+z+" "+x);
}
public static void main(String[] args) {
	Phone pI = new Phone();
	pI.phoneInfo("redme");
	pI.phoneInfo("redme", 9);
}
}
