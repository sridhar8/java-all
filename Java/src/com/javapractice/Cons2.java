package com.javapractice;

public class Cons2 {
	
	public Cons2(String i) {
		System.out.println(i);
	}
	
	public Cons2(int o) {
		this (2.3f);
		System.out.println(o);
	}
public Cons2(float u) {
this ("australia");
System.out.println(u);
}

public Cons2() {
System.out.println("default 3");	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
//	new Cons2(4.1f);
new Cons2(4);
	//Cons2 a=new Cons2();    // or new Cons2();

}
}


//=========================================================
/*private ExceptionClaz() {
this("m2");
System.out.println("1");

}	

private ExceptionClaz(String w) {
this(4);
System.out.println("2");
}

private ExceptionClaz(int q) {
System.out.println("3");

try {
	int sum=4/0;
	System.out.println("4");
} 

catch (ArithmeticException e) {
System.out.println("5");

}
System.out.println("7");

}
public static void main(String[] args) {
	ExceptionClaz ec = new ExceptionClaz();
	//(OR)
	new ExceptionClaz();
	*/