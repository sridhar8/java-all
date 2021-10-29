package org.java.com;

import java.util.Scanner;

public class LoopConcept {
	/*

public static void main(String[] args) {			//factorial
	int a=1;

	for (int i = 5; i>0; i--) {
		a=i*a;
	}
	System.out.println(a);
}

}
*/
	//-------------------------------------------------------------------------

	/*
	public static void main(String[] args) {
	int a=0,s=1;
	for (int i = 1; i<=100; i++) {
	
		System.out.println(a);
	int z=a+s;								//fibanacci series
		a=s;								//here we have to print from the initial value 
		s=z;								//so have to put initial value variable in sysout
											//here break condition are applied so once a value exit to 100 it break the loop and stoped
	if (a>100) {						//a series in which the each number is the sum of the two preceding numbers
		break;							//it usually start from 0 and one. 
	}}
}}
	
	*/
	
	//-----------------------------------------------------------------------------
	/*
	public static void main(String[] args) {
		int t1=0;
		int t2=1;							//fibanacci series using while loop condition
		int i=1;
		while (i<=100) {
			i++;
			System.out.println(t1);
			int t3=t1+t2;
			t1=t2;
			t2=t3;
		
			if (t1>100) {
				break;
			}
		}}
	}
*/
//---------------------------------------------------------------------------------
	/*
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter a number ");
		int d=a.nextInt();								//pri
		
		int count=0;
		for (int i = 2; i <= d; i++) {
			if(d%i==0) {
			count++;
			}}if (count==1) {
System.out.println("prime");			
		} 
			else {
System.out.println("not");
		}
		
		*/
	//================================================================================
		public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			System.out.println("enter a number");			//print a number in reverse direction
			
			int b=a.nextInt();
			
			for (int i = b; i >0; i=i/10) {
			int	r=0;
			r=i%10;
			System.out.print(r);
				
			}
		}
	
	
		}
	