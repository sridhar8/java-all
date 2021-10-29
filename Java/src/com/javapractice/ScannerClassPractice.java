package com.javapractice;

import java.util.Scanner;

public class ScannerClassPractice {

	private static int average;

	public static void main(String[] args) {
	
		Scanner aB = new Scanner(System.in);
		System.out.println("Enter your studen ID");
		long c = aB.nextLong();
		System.out.println("your student id is "+ c);
	
		System.out.println("Enter the student name");
		String d = aB.next();
		System.out.println("student name is "+ d);
		
		System.out.println("enter the mark in tamil paper");
		int e = aB.nextInt();
		System.out.println("tamil paper mark is "+ e);
		
		System.out.println("enter the mark in english paper");
		int f = aB.nextInt();
		System.out.println("english paper mark is "+f);
		
		System.out.println("enter the mark in science paper");
		int g = aB.nextInt();
		System.out.println("science paper mark is "+g);
		
		System.out.println("enter the mark in physics");
		int h = aB.nextInt();
		System.out.println("physics mark is "+ h);
		
		System.out.println("enter the mark french");
		int i =aB.nextInt();
		System.out.println("french paper mark is "+i);
		
		int t = e+f+g+h+i;
		average = (e+f+g+h+i)/5;
		System.out.println("Total is= "+t);
		System.out.println("avg is "+average);
	}
}
