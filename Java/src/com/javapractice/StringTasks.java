package com.javapractice;

import java.util.Scanner;

public class StringTasks {
	public static void main(String[] args) {
		
/*	String s1 = "GreensTechnology";
	String s2 = "SeleniumAutomationtool";
	String s3 = "Velmurugan";					//find the length of the strings
	String s4 = "j a v a p r o g r a m";
	String s5 = "9095484678";

	int b =s1.length();
	System.out.println(b);
	
	int c= s2.length();
	System.out.println(c);
	
	int d =s3.length();
	System.out.println(d);
	
	int e = s4.length();
	System.out.println(e);
	
	int f =s5.length();
	System.out.println(f);

	
	*/
//===============================================================================================
	/*	String b1 = "GreensTechnology";			//index of last o			//find the index of the strings mentioined
		String b2 = "SeleniumAutomationtool";   //index of o
		String b3 = "Velmurugan";				//index of n
		String b4 = "j a v a p r o g r a m";	//index of last empty space
		String b5 = "9095484678";				//index of 8
	
	int g = b1.lastIndexOf("o");
	System.out.println(g);
	
	
	int h =b2.indexOf("o");
	System.out.println(h);
	
	int i =b3.indexOf("n");
	System.out.println(i);
	
	int j = b4.lastIndexOf(" ");
	System.out.println(j);
	
	int k = b5.indexOf("8");
	System.out.println(k);
*/	
		
	//================================================================================================	
	/*	
String b1 = "GreensTechnology";			//char h			//print the char of the strings mentioined
String b2 = "SeleniumAutomationtool";   //char of o
String b3 = "Velmurugan";				//char u
String b4 = "j a v a p r o g r a m";	//char of p
String b5 = "9095484678";				//char of 7

	char l= b1.charAt(9);
	System.out.println(l);
	
	char m =b2.charAt(11);
	System.out.println(m);
	
	char n =b3.charAt(4);
	System.out.println(n);
	
	char o =b4.charAt(8);
	System.out.println(o);
	
	char p =b5.charAt(8);
	System.out.println(p);
	
	int q =b5.indexOf("6");
	System.out.println(q);
*/
//	================================================================================
		
	Scanner a = new Scanner(System.in);
	System.out.println("enter the input of a ");	//get 2 input from the people and check the equality print in the output whether it is equal or not
	String z=a.next();
	
	Scanner b = new Scanner(System.in);
	System.out.println("enter the input of b");
	String y=b.next();
	
	boolean x=z.equals(y);
	System.out.println(x);
	
	 System.out.println(Boolean.valueOf(x));
//===================================================================================
		
		Scanner ac = new Scanner(System.in);
		System.out.println("enter the input of ac ");	//get 2 input from the people and check the equality print in the output whether it is equal or not
		String zy=ac.next();
		
		Scanner bd = new Scanner(System.in);
		System.out.println("enter the input of bd");
		String yx=bd.next();
		
		boolean xx=zy.equalsIgnoreCase(yx);
		System.out.println(xx);						//in if condition we have to use 
		
		if (xx){				//<------meaning Boolean.valueOf(xx) is true by default
//			if(zy.equalsIgnoreCase(yx)) {
		
			System.out.println("it is Equal");
			}
		else {
	System.out.println("not");
		}	
		
		
		//==============================================================================
	/*
	
		Scanner r = new Scanner(System.in);		//get email id from the user and chek '@' is present or not 
	System.out.println("enter a mail id");		//if @ their print vaild id and return true or false
	String g=r.next();
	boolean i=g.contains("@");
	System.out.println(i);
	
	if (Boolean.valueOf(i)) {
		System.out.println("valid email id");
		
	}
	else {
		System.out.println("not vaild email id");
	}
	*/
		//=============================================================================
	/*	
		Scanner a = new Scanner(System.in);			//get the address from the user and find "pincode" is their or not
		System.out.println("enther your address");
		String t=a.nextLine();
		
		 boolean d= t.contains("pincode");
		System.out.println(d);
	if (Boolean.valueOf(d)) {
		System.out.println("it is present");
		
	} else {
			System.out.println("not");
	}
	*/
	
	//=============================================================================		
		
	/*	Scanner a = new Scanner(System.in);
System.out.println("enter the email id");
String d= a.next();

boolean f= d.contains("@");

if (Boolean.valueOf(f)) {
	System.out.println("valid id");
	
} else {
System.out.println("not");
}

*/
	//===================================================================================

	
	
	}

	
	
}