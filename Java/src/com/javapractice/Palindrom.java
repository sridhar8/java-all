package com.javapractice;

import java.util.Scanner;

public class Palindrom {
	
public static void main(String[] args) {			//palindrom and reverse number
													//Reverse number mean if you enter a input is 1234 that reverse number is 4321
													//if reversed number is same as input what you given is called palindrom	
	
	int n=1234,r;
	int n1=n;
	r=0;											//reverse number  by using while loop
	while(n>0) {
	
	r=(r*10)+n%10;
	
	n=n/10;
	
	}
	System.out.println(r);
	
	if (r==n1) {
		System.out.println("palindrom");
	} else {
System.out.println("not");
	}
}
}
		
//--------------------------------------------------------------------------
/*	public static void main(String[] args) {
  		
		Scanner h = new Scanner(System.in);				//reverse number by using for loop
		System.out.println("enter a number");
		int k=h.nextInt();
		int r=0;
		
	
		for (int n = k; n >0 ; n=n/10) {

			r=(r*10)+n%10;
	
			
		}
			System.out.println(r);
		}
	}

*/
//----------------------------------------------------------------------------------
