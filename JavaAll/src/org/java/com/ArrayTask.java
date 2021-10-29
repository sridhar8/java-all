package org.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayTask {
/*	
public static void main(String[] args) {		//find the lenght and sum of the array
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b= a.length;
		System.out.println(b);
		System.out.println(a);
		int sum=0;
		for (int i = 0; i <b; i++) {
			sum=sum+a[i];
		}System.out.println(sum);
}
}*/
 //====================================================
	
/*	public static void main(String[] args) {		//find the sum and avg of a array
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b=a.length;
		System.out.println(b);
		System.out.println(a.length);
		int sum=0,avg=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			avg=sum/a.length;
			
		}
			System.out.println(sum);
			System.out.println(avg);
		}
	}
*/
//================================================================
/*	
	//Write a Java program to remove duplicates from array
	public static void main(String[] args) {
		//input a[]= {10,20,30,90,10,10,40,50};
		//int b=a.length;
		Set <Integer> l= new HashSet<Integer>();
		
		l.addAll(Arrays.asList(	new Integer [] {10,20,30,90,10,10,40,50}));
	
		//print all
		System.out.println(l);		//normally array and list allow the duplicates so we go for set class
		//size
		int b=l.size();
		System.out.println(l.size());
		//or
		System.out.println(b);
		
	}	}
	
	*/
//==================================================================
/*
//create a new arraylist and find the length of it
public static void main(String[] args) {
	List<Integer> b= new ArrayList<Integer>();
	
	//add all element to list
	b.addAll(Arrays.asList(new Integer[] {10,20,20,50,60,80,60}));
	
	//priny All
	System.out.println(b);
	
	//size
	System.out.println(b.size());
	
}
}

*/
	//=======================================================
	
	//create a new LinkedList List with the value and find the length of it
	//intput: List=100,200,300,400,500,600,700
/*
public static void main(String[] args) {
	List <Integer> d= new LinkedList<Integer>();
	
	 
	d.addAll(Arrays.asList(new Integer[] {100,200,300,400,500,600,700}));
	
	System.out.println(d);
	System.out.println(d.size());
}}
	*/
	//===========================================================================
	/*
	//create a new vector with the values  and find the length of it
	//input :List=105,205,305,405,505,605,705,805
	public static void main(String[] args) {
		List<Integer> f= new Vector<Integer>();
f.addAll(Arrays.asList(new Integer[] {105,205,305,405,505,605,705,805}));
System.out.println(f);
System.out.println(f.size());


}}*/
//===================================================================================
//get the first index of the value 10
	//input: list=10,20,30,90
	/*
	public static void main(String[] args) {
		List<Integer> g =new LinkedList<Integer>();
		g.addAll(Arrays.asList(new Integer[] {10,20,30}));
		System.out.println(g.size());
		System.out.println(g);
		System.out.println(g.indexOf(10));
		
	}
		}
*/	
	//============================================================================

/*	
//get the last index value of 10
//input :List=10,20,30,90,10,10,40,50
public static void main(String[] args) {
	List <Integer> j= new LinkedList<Integer>();
	j.addAll(Arrays.asList(new Integer[] {10,20,30,90,10,10,40,50}));
	System.out.println(j.lastIndexOf(10));
	
	for (Integer integer : j) {
		
	}
if (j==10) {
	System.out.println(j);
	
}}
	
}*/
	
	//===============================================================================
	/*
	//get the index value of 50 
	//input: 'List=10,20,30,90,10,10,40,50
	
	public static void main(String[] args) {
		List <Integer> u= new LinkedList<Integer>();
		u.addAll(Arrays.asList(new Integer[] {10,20,30,90,10,10,40,50}));
		System.out.println(u.indexOf(50));
		System.out.println(u.indexOf(90));
		System.out.println(u.indexOf(10));
	}
	}
*/
//====================================================================================
	
	//get the each index value of 10 in present below list 
	//input List=10,20,30,90,10,10,40,50,10
	
	public static void main(String[] args) {
		int a[]= {10,20,30,90,10,10,40,50,10};
		for (int i = 0; i < a.length; i++) {
//			if (a[i]==10) {
//				System.out.print(i);
//			}
			System.out.println(a[i]);
	}}}

	//=================================================================================