package org.constructor.com;

public class SecB {

	
	public SecB() {		//constructor 1
		this(80);		//invoke constructor 2 or call contructor 2
		System.out.println("deena");
		
	}
	
	
public  SecB(int f) {		//constructor 2
	this(45,"sri");     //call constructor 3
System.out.println("total mark is "+f);	
}

public SecB(int a, String b) {		//constructor 3
	System.out.println("my id and named "+b+" "+a);
}


public static void main(String[] args) {
	new SecB();
	
	
}
}
