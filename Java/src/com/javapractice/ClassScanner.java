package com.javapractice;

import java.util.Scanner;

public class ClassScanner {
	
	/*for getting customer info we use Scanner Class
	 * Syntax: Class type variable=new Class type(System.in);
	 * after the void main string type Scanner to import Scanner util
	 */
public static void main(String[] args) {
	Scanner a = new Scanner( System.in);
	System.out.println("enter your bike name");
	String b = a.nextLine();						//nextLine : print after the space
	System.out.println("your bike name is "+ b);	//concordination after string we can add something it is called concordination
	
	System.out.println("enter your full name");
	String c = a.nextLine();						//next: not print after the space
	System.out.println("your full name is "+ c);
	
	System.out.println("Enter your post code");
	int d = a.nextInt();
	System.out.println("your post code is "+ d);
	


	System.out.println("What is the time now");
	byte e = a.nextByte();
    System.out.println("so the time is "+ e );

    System.out.println("what is your bike number");
    short f = a.nextShort();
    System.out.println("your bike number is " + f);
    
    System.out.println("what is your expected salary");
    float g = a.nextFloat();
    System.out.println("your expected salary is "+ g);
    
    System.out.println("Enter your mob number");
    long h = a.nextLong();
    System.out.println("your mobile number is "+ h);
    
    System.out.println("enther your percentahe uoto 6 decimals");
    double i = a.nextDouble();
    System.out.println("your percentage iz" + i);
    
    
    //int t = e+f+g+h+i;  to add the numbers use int directly like mention 
	//average = (e+f+g+h+i)/5; for avg use like that
}	
	
}