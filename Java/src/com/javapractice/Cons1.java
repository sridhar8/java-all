package com.javapractice;

public class Cons1 extends Cons2 {
	//int g=3;
	public Cons1() {
		this("vadachennai");
System.out.println("Default cons1");

	}
public Cons1(int f) {
	//this.g=g;
	super(0);
	System.out.println(f);
	}
public Cons1(String k) {
	this (44,"south");
	System.out.println(k);

}

public Cons1(int l,String w) {
	this(6);
	System.out.println(l + w);
}
public static void main(String[] args) {
	new Cons1();
	//new Cons1(7);
}
}
