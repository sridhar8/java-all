/*
 a number that is divisible only by itself and 1 
 (e.g. 2, 3, 5, 7, 11).
 */


package org.java.com;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the input Value: ");
        int b=a.nextInt();
 //c is used as a counter to check its have remainder 0 which b is divide by i
        int c=0;
        for(int i=1; i<=b; i++) {
        	if(b%i==0) {
        		c++;
        	}
        	
        }
        System.out.println("Count Value after iteration: "+c);
     
        
        //if-else condition not inside for loop
        if(c==1) {
        	System.out.println(b + " is a primeNumber");
        }
        else if(c==2) {
        	
        	System.out.println(b + "is a primeNumber");
        }
        else{
        	System.out.println(b + " is not a primeNumber");
        }
	}
}
        	
        			
