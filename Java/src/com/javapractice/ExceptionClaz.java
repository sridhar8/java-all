package com.javapractice;

import java.io.EOFException;
import java.io.IOException;

public class ExceptionClaz {
	public static void main(String[] args) {		
		try {
			System.out.println("1");
			int sum=9/0;
			System.out.println("2");
		}
		catch (ArithmeticException e) {
		System.out.println("3");			//using try and catch and finally
		}									//there is no system.exit in that program so finally print
	catch (Exception e) {
	System.out.println("4");
	}
		finally {
			System.out.println("5");
		}}

}

//=============================================	

/*	
private void m1() {
 m2;
System.out.println("1");

}	

private void m2() {
m3;
System.out.println("2");
}

private void m3() {
System.out.println("3");

try {
	int sum=4/0;
	System.out.println("4");
} 
									//using try and catch
catch (ArithmeticException e) {
System.out.println("5");

}
System.out.println("7");

}
public static void main(String[] args) {
	ExceptionClaz ec = new ExceptionClaz();
ec.m1();
}}
*/
//==========================================================
	/*
	public static void main(String[] args) {
		try {
		System.out.println("1");
		int d=5/0;					//exit is the last portion 
		} 							//using system.exit
		catch (Exception e) {		//using finally but finally not print
		System.out.println("2");
		System.exit(0);
		}
		finally {
			System.out.println("3");
		}
		System.out.println("4");
	}}
*/
//---------------------------------------------------------------------------
	/*
	public static void main(String[] args) {
		try {
			System.out.println("q");
			int s=4/0;
			
		} 
		catch (Exception e) {
Throwable d=new Throwable("Sample");
		try {
			throw d;
		} 
		catch (Throwable e1) {
		
		System.out.println("@");
		}
	 finally {
	System.out.println("3");
	}
System.out.println("34");
	}}}
*/
//---------------------------------------------------------------------------------
	/*
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int f=10/0;
			
			throw new IOException();
		} 
		catch (EOFException e) {
			System.out.println("2");
			}
		
		catch (ArithmeticException e) {
			System.out.println("3");
		}
		catch (NullPointerException e) {
			
			System.out.println("4");
		}
		catch (IOException e) {
			System.out.println("5");

		}
		catch (Exception e) {
		System.out.println("6");
	}	}
	}
*/
//==========================================================