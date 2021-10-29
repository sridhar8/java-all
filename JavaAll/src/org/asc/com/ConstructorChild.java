package org.asc.com;

import com.javapractice.Constructor;

public class ConstructorChild extends Constructor{

	public ConstructorChild() {
super(45);
this.d();
}
	private void d() {
		System.out.println("f");

	}
	public ConstructorChild(String g) {

	}
	public static void main(String[] args) {
		new ConstructorChild();
		
		
	}
}
