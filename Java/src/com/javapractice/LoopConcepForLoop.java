package com.javapractice;

import java.util.Scanner;

public class LoopConcepForLoop {
	
	/* public void welcome() {
System.out.println("hi");							//for loop by using object 
	}
	
public static void main(String[] args) {
	LoopConcepForLoop l = new LoopConcepForLoop(); 	
	for (int i = 1; i < 5; i++) {
		l.welcome();
		System.out.println("welcome");
		
	}
	}}*/
//-------------------------------------------------------------------------	
	
	
	/*public static void main(String[] args) {
													//without object it is normal for loop
		for (int i = 1; i < 5; i++) {
	
			System.out.println("1");
	
	
	
}
}}
*/
//--------------------------------------------------------------------------
	
	//simple loop concept
/*	public static void main(String[] args) {
		for (int i =1 ; i <= 5; i++) {				//create 123 in 5 times in next next lines			
		
			for (int j = 1; j <=3; j++) {
				System.out.print(j);
														
			}								//inner for loop
		
			
		System.out.println();
	}} */
//--------------------------------------------------------------------------
	/*public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j<=i; j++) {			//create 1  12  123   1234   12345 in next next lines
				System.out.print(j);
				
			}
			System.out.println();
		}}
			
	
	}*/
//------------------------------------------------------------------------------

public static void main(String[] args) {
	for (int i = 5; i >=1; i--) {
		for (int j = 1; j<=i; j++) {			//create 12345  1234  123   12   1 in next next lines
			System.out.print(j);
			
		}
		System.out.println();
	}}
		

}

//---------------------------------------------------------------------------------
/*
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 5; j>=i; j--) {			//create 54321  5432 543   54   5 in next next lines
			System.out.print(j);
			
		}
		System.out.println();
	}
	}
		
*/

//-------------------------------------------------------------------------------------
	/*
	public static void main(String[] args) {			//create a program for factorial 5
		
		int h=1;
		
		for (int i = 5; i > 0; i--) {
			
			h=h*i;
		}
		System.out.println(h);
	}}
*/
//------------------------------------------------------------------------------------

/*	public static void main(String[] args) {
		
	
	int i=5;
	int j=1;
while (i>0) {											//create a program for factorial 5 by using while loop
	j=j*i;												//factorial is the product of all positive integes less than or equal to the given number	
	
	i--;
	
	
}System.out.println(j);
	}
	
}
*/
//----------------------------------------------------------------------------------------
		
	/*	
													//write a progrram to find fibanacci series upto 100
	public static void main(String[] args) {
	int t1=0,t2=1;									//here we have to print from the initial value 
		for (int i = 1; i < 100; i++) {				//so have to put initial value variable in sysout
													//here break condition are applied so once a value exit to 100 it break the loop and stoped
		System.out.println(t1);
													//a series in which the each number is the sum of the two preceding numbers
		int t3=t1+t2;								//it usually start from 0 and one. 
		
		t1=t2;
	
		t2=t3;
		
		if (t1>100) {			//<----break condition
			break;
		}}
	}}


*/


//------------------------------------------------------------------------------------
/*
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("enter the input number");
int r= p.nextInt();

int count=0;
for (int i = 1; i<=r;i++) {
	
	if (r%i==0) {
		count++;							//find entered number is prime or not see practice session for better clarification
		
	}} if (count==2) {
		System.out.println("given number is prime");
	} 

else {
	System.out.println("given number is not a prime");
	
}
	
//		
	}

	*/

//---------------------------------------------------------------------------------
/*

public static void main(String[] args) {
	Scanner p =new Scanner(System.in);
	System.out.println("enter the input number");
int r= p.nextInt();

for (int i = 2; i<=r;i++) {

	if (r%i==0) {
	System.out.println("given number is prime");
} 

else {
	System.out.println("given number is not a prime");
}

	
	
}}
}

*/
//--------------------------------------------------------------------------

