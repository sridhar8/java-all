package com.javapractice;

public class PolyInheriOverriding extends Polymorpism {
	
	@Override
		public void empName() {
System.out.println("kumar");
super.empName();
		}
@Override
	public void empName(String a) {
	System.out.println("sri");
		super.empName(a);
	}


public static void main(String[] args) {
	PolyInheriOverriding pIOA = new PolyInheriOverriding();
pIOA.empName();
pIOA.empName("IKUJ");
pIOA.empName();

}
}