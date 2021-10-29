package com.javapractice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	/*	System.out.println("enter a number");						//153
		Scanner l= new Scanner(System.in);							//1*1*1 + 5*5*5  + 3*3*3  =153 
		int n=l.nextInt();											//is called armstrong
	
		
		double sum=0,count=0;										//general concept input getting from customer
	
		for (int n1 = n;n1 !=0;count++) {
			n1=n1/10;
			
		}
	for (int n1 = n; n1 !=0; n1=n1/10) {
		int r=n1%10;
	sum +=Math.pow(r, count);
	}
	if (n==sum) {
		System.out.println("entered number is arm");
		
	} else {
		System.out.println("entered number is not arm");
		
		

	}}

}
*/

	
	//---------------------------------------------------------------------------------------------------------
	
/*	public static void main(String[] args) {
		
		for (int i =0; i <1000; i++) {						//Specified concept finding arm no's upto value what we given
			double c=0,s=0;
					for (int j = i; j !=0 ; c++) {				//c=count  s=sum
					j=j/10;
					}
					for (int j = i; j !=0;j=j/10) {
					int r=j%10;
					s+=Math.pow(r, c);
					}
					if (i==s) {
						System.out.println(i);
					}
		}}
					}
	
	*/	
		
	
	//-------------------------------------------------------------------------------------------------------------
	
	
/*	public static void main(String[] args) {
		System.out.println("enter a number");
Scanner o = new Scanner(System.in);
	int g=o.nextInt();
	int w,count=0,sum=0;
	w=g;
	
while (w>0) {
	count = w%10;
	sum = (count*count*count)+sum;
	w= w/10;
}
	if (g==sum) {
		System.out.println("arm");
	}
	else
		System.out.println("not");}
	}
	
	
*/	
	//===============================================================
	/*
System.out.println("enter a number");						//153
Scanner l= new Scanner(System.in);							//1*1*1 + 5*5*5  + 3*3*3  =153 
int n=l.nextInt();											//is called armstrong

double sum=0,count=0;										//general concept input getting from customer

for (int n1 = n;n1 !=0;n1=n1/10) {
	count++;
	
}
for (int n1 = n; n1 !=0; n1=n1/10) {
int r=n1%10;
sum +=Math.pow(r, count);
}
if (n==sum) {
System.out.println("entered number is arm");

} else {
System.out.println("entered number is not arm");
}}}

*/
//===============================================================================
	System.out.println("enter the number");	
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	String v=Integer.toString(a);
	int u=v.length();
	System.out.println(u);
	int b=a;
	int z=0;
	int y=1;
	int x=0;
	for (int i = b; i >0; i=i/10) {
		z=i%10;
		for (int j = 0; j < u; j++) {
			y=y*z;
		}
		x=x+y;
	}
	System.out.println(x);
	if (x==a) {
		System.out.println("arm");
	} else {
System.out.println("not");
	}
	}}
	
