package com.javapractice;

import java.util.Scanner;

public class Array {

	
	//Array store multiple values continuely with a single variable with same data type
	
	//syntax
	//inr a = new int[array length];
	//(data type variable= new datatype[length of array];
	

	//array has the fixed length
	//array is index based
	//array is done with same datatype
	//array is continuos memory allacation
	//array allows duplicate value
	//it doesn't allow index in twice it override the first value given by the second.
	//if there is no value, it will print the default value of the given datatyo
//array doesn't have any predefined function except length
	
	//===================================================================================================
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
	System.out.println("etnter a length of array");			//find the sum of the array values
	int g=n.nextInt();
	
	int i[]= new int [g];
	int sum=0;
	int l=i.length;
	System.out.println("enter that "+g+"values");
	 for (int j = 0; j <g; j++) {
		i[j]=n.nextInt();
		sum=sum+i[j];
	 }
	
System.out.println(sum);
		
	 }}

//-------------------------------------------------------------------------------------------
												//find that particular index value
	/*
	public static void main(String[] args) {
	int v[]= new int[4];					
	v [0]=1;
	v [1]=3;
	v [2]=2;
	v [3]=4;
	for (int i = 0; i < v.length; i++) {
		System.out.println(v[i]);
	}
}

*/
	
//---------------------------------------------------------------------------------
	
	
	/*
	public static void main(String[] args) {		//find that particular index value
		int a[]= {1,2,3,4};
		int l=a.length;
		System.out.println("length of l is "+l);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
*/

	
	//----------------------------------------------------------------------------------
/*
public static void main(String[] args) {
	String a[]= {"sri","kumar","chennai"};
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
*/


	
	//------------------------------------------------------------------------
	/*
	public static void main(String[] args) {
		String a[]=new String[3];
		a[0]="sri";
		a[1]="kumar";
		a[2]="chennai";
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}}

*/
//=============================================================

