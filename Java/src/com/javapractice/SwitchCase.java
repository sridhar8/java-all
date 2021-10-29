package com.javapractice;

import java.util.Scanner;

public class SwitchCase {

	
	
	//it is used to perform the action only for customer whar they required
	
//	public static void main(String[] args) {
/*	Scanner a= new Scanner(System.in);

	System.out.println("enter train time: ");
	int g=a.nextInt();
	System.out.println("enter the class");
	String c =a.next();
	switch (g) {
	case 7 :
		
		System.out.println("Jansathapthi Express");
	switch(c) {
	case "z":
		System.out.println("non ac");
		break;
	case "e":
	System.out.println("Sleeper");
	break;
	case "b":
		System.out.println("ac");
		break;
	}
		
		break;
	
	case 8:
		System.out.println("pearl city");
		
		switch (c){
			case "h":
				System.out.println("sleeper");
			break;
			case "b":
				System.out.println("ac ");
			break;
		}
		
		break;
	
	case 9:
	
		System.out.println("chennai superfast");
		
		break ;
	
	default:
		
		System.out.println("no trains are available");
		
		nbreak;
	}
	


*/

//======================================================================
	public static void main(String[] args)throws Exception {
		
	
Scanner h= new Scanner(System.in);

System.out.println("enter train time: ");
String q=h.next();
//System.out.println("enter the name train");
//String tN=h.next();
//System.out.println("enter the class");
//String r= h.next();
//for (String i = q; i < e; i++) {
	
	switch (q) {
													//for 1 switch 1 default
	case "7":										//for 1 case 1 break
		Scanner tN = new Scanner(System.in);		//while using break in after the statement else stsement not applicable 
		System.out.println("enter the tN");			//so if statement only applicable
		String tn=tN.nextLine();					//so throw not able to used
		
		if (tn.equalsIgnoreCase("anadhapur express")) {
			System.out.println("tn is "+tn);
		}
//		break;
		
		else if (tn.equalsIgnoreCase("first train")) {
			System.out.println("tn is: "+tn);
		}
//		break;
//		}
		
		else {
			throw new railway("ypur choice is invalid");
		}
		break;
		
	case "7.15":
		Scanner t = new Scanner(System.in);
		System.out.println("enter the train name");
		String a=t.nextLine();
		
		if (a.equalsIgnoreCase("jolly s.f")) {
			System.out.println("tn is "+a);
		}
//	break;
		else if (a.equalsIgnoreCase("first mail")) {
			System.out.println("tn is: "+a);
		}
		
		else {
			throw new railway("no chooise");
		}
	break;
	
	default: 
		throw new railway ("your choise is invalid");
	
	}
System.out.println("enter the class");
String r= h.next();

	switch (r) {
		case "n":
			System.out.println("NON AC");
			break;
		
		case "S":
		System.out.println("SLEPPER");
		break;
		
		case "C":
			System.out.println("AC");
		
		break;
	
//break;

default: 
			throw new railway ("your choise is invalid");
//			break;
			
			}
	}}
	
	


