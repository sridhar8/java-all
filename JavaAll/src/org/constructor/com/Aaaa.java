package org.constructor.com;

public class Aaaa extends Bbbb{
	private Aaaa() {
super(12);
System.out.println("default Aaaa");
}
	public static void main(String[] args) {
		new Aaaa();//Aaaa u=new Aaaa();
	}
}
