package org.java.com;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your class prefered");
		String d=s.nextLine();
//		System.out.println(d);
	if (d=="com") {
		System.out.println("you choose :"+d);
		
	} 
//	else if (d=="mac") {
//		System.out.println("you choose :"+d);
//		
//		
//	} 
	else {
		System.out.println("ur choise is not in list");
	}
	}
}
