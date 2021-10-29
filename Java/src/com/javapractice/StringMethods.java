package com.javapractice;

import java.util.Scanner;

public class StringMethods {
	//public static void main(String[] args) {
/*		Scanner a = new Scanner(System.in);
	System.out.println("enter the code");
	
	String b= a.nextLine();
	
			int c=b.length();		//length
			System.out.println(c);
			
String tU=b.toUpperCase();		//to uppercase
System.out.println(tU);

	char d=b.charAt(4);			//charAt
	System.out.println(d);
	
	String e=b.replace("kumar", "k");
	System.out.println(e);
	
	boolean f=b.contains("e");
	System.out.println(f);
	
	*/
	//===============================================================
	// is empty
		
/*	String s1="";
	String s2=" ";
	String s3=null;
	String s4="welcome";
	
	boolean j= s1.isEmpty();
	System.out.println(j);
	
	boolean i=s2.isEmpty();
	System.out.println(i);
	
	boolean o =s3.isEmpty();	//exception is there java.lang.NullpointerException
	System.out.println(o);
	
	boolean p=s4.isEmpty();
			System.out.println(p);
			
	*/		
	//==========================================================================
		
	public static void main(String[] args) {
		String sss="         Welcome to Java          ";
		System.out.println(sss);
		System.out.println(System.identityHashCode(sss));	// to find the memory location place we can use this code
		
		int j=sss.length();
		System.out.println(j);
		
		int l= sss.indexOf("e");
		System.out.println(l);
		
		//trim											//used to trim the starting empty space and ending empty space
														//inbetween the words space can not be trim
		String f = sss.trim();
		System.out.println(f);
		System.out.println(System.identityHashCode(f));
		
		int k=f.length();
		System.out.println(k);
		
		//indexOf					//used to find the index number
		
		int u=f.indexOf("e");
		System.out.println(u);
		
		//subString with begin		//used to print from where you want
		String p= sss.substring(4);
		System.out.println(p);
		
		//subString with begin and end	//used to print from where you want and where it has to be end
		String i=f.substring(3, 9);
		System.out.println(i);
		
		CharSequence s=f.substring(3, 9);
		System.out.println(s);
		
		CharSequence t= f.subSequence(3, 9);
		System.out.println(t);
		
		//
		
		
	}
	
	//===========================================================================
		
	
	
	
}
