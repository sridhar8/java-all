package com.javapractice;

import java.util.Scanner;

public class ConditionStatement  {
														//also see practice session--org.test---Hello for some task 
	//private static Object factorial;

	//if(e.g:checking for pass)
	//nested if(e.g:cghecking for pass and distinction)
	//if else(e.g:checking for pass or fail)
	//if else if or if else lader(e.g:checking for mark with grade)
	//forloop
	//while loop
	//do while loop
	//switch
		//-break
		//-continue
	

/*public static void main(String[] args) {
	Scanner a =new Scanner(System.in);			//vote eligibility checking 
	System.out.println("enter your age");		//if the candidate age is equal and above the 18 they are eligibile to vote
	int b=a.nextInt();							//incase the candidate age is less than 18 then are not eligibile
	if (b>=18) {								//by using if else condition
		System.out.println("your major");
	} else {
System.out.println("your minor");
	}}
}
*/
//----------------------------------------------------------------------------------------------------------------
	
/*	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
			System.out.println("enter your age");
			int d=c.nextInt();
			if (d>=18) {
				System.out.println("eligible to vote");
				
			}
		
		else if (d==17) {
			System.out.println("your age is "+ d+ "next year you can vote");
		} 
		else {
			System.out.println("your not eligible");
		}

		}}

*/
//-----------------------------------------------------------------------------------------------------------

/*public static void main(String[] args) {
	for (int i = 1; i <=100; i++) {
		if (i %2 != 0) {
			System.out.println(i);
		
	
		} 
		}
	}
		
	}								//print even and odd number upto 100 by change i%2==0,i%2!=0


*/
	//-------------------------------------------------------------------------------------------------------
/*
	public static void main(String[] args) {
Scanner g = new Scanner(System.in);

System.out.println("enter a number");

int k=g.nextInt();

if (k%2==0) {

	System.out.println("entered number "+ k+" "+"is even");
}
 else {
System.out.println("enterd number "+k+" "+"is odd");						//find entered number is odd or even
}}
	
}
*/

//----------------------------------------------------------------------------------------------------------
	
	
/*
public static void main(String[] args) {
	
	

for (int i = 01; i <=10; i++) {
	if (i==5) {
		continue;						//try break,continue,and without break and continue
	}									//for better understanding
System.out.println(i);					//break used to terminate the action
}										//continue used to skip the particular action
}}

*/
	
//-----------------------------------------------------------------------------------------------------
	
/*	
	
public static void main(String[] args) {
	int sum=0;
	for (int i = 1; i<=100; i++) {			
		if (i%2!=0) 					//sum of odd number upto 100
		sum=i+sum;						//same to sum of even num upto 100 by changing i%2==0
		}
	System.out.println(sum);
	
}
		
	}
*/
//-----------------------------------------------------------------------------------------------------
	
/*	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <=100; i++) {				//print the count of even number upto100
			if (i%2==0) 
				count++;
		}	
		System.out.println(count);
		}
	}*/
//----------------------------------------------------------------------------------------------
	/*public static void main(String[] args) {
		int evencount=0,oddcount=0;
for (int i = 1; i <=100; i++) {
	if (i%2==0) 
	evencount++;
		
	else 				
	oddcount++;											//print the count of even number upto100 using if else condition in while loop statement
		}
			System.out.println("evencount is "+evencount);
			System.out.println("odd count is "+oddcount);
			
		}
		
	}

*/

//--------------------------------------------------------------------------------------------------


public static void main(String[] args) {
	for (int i = 1; i <= 3; i++) {
	for (int j = 1; j <=3; j++) {
	System.out.println(i);	
	}	
	}
}

}
	
	
	//--------------------------------------------------------------------------
	/*
	public static void main(String[] args) {
		int i;
		i=5;
		if (i==5) {
	continue;
			
		}
		System.out.println(i);				
						
		}
				
	}
*/

	//--------------------------------------------------------------------------
//	}
	