package org.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.constructor.com.B;

public class Lst2SetD8 {
	
public static void main(String[] args) {
	//create a hashset for the below values 					//converting list into set by using(use addAll()) method
	//input:list=10,20,30,40,50,60,70,80,90,10,20				//Hashset class
	
	//create a list of integer
	List<Integer>l=Arrays.asList(10,20,30,40,50,60,70,80,90,10,20);
	System.out.println(l);

	//cinverting to set 
	Set<Integer>s= new HashSet<Integer>(l);
	//s.addAll(s);
	System.out.println(s);//output print in random order
	for (Integer i : s) {
		System.out.println(i);
		
	}
}
}
//===============================================================
/*
public static void main(String[] args) {
	//create a Linkedhashset for the below values 
	//input:list=10,20,30,40,50,60,70,80,90,10,20
	
	//create a list of integer
	List<Integer>l=Arrays.asList(10,30,40,50,60,70,80,90,10,20);
	System.out.println(l);

	//cinverting to set 
	Set<Integer>s= new LinkedHashSet<Integer>(l);
	//s.addAll(s);
	System.out.println(s);//output print on insertion order
	for (Integer i : s) {
		System.out.println(i);
		
	}
}
}
*/
	//===========================================================
/*	
	public static void main(String[] args) {
		//create a hashset for the below values 
		//input:list=10,20,30,40,50,60,70,80,90,10,20
		
		//create a list of integer
		List<Integer>l=Arrays.asList(10,30,20,40,50,60,70,80,90,10,20);
		System.out.println(l);

		//cinverting to set 
		Set<Integer>s= new TreeSet<Integer>(l);
		//s.addAll(s);
		System.out.println(s);	//print in assending
		for (Integer i : s) {
			System.out.println(i);
			
		}
	}
	}
*/
//====================================================================================

//get the each value of set by using enhanced for loop 
//list= 105.205,305,405,505,605,705,805
/*
public static void main(String[] args) {
	
	//create a list of integer
List<Integer>j = Arrays.asList(105,205,305,405,5065,605,705,805);
System.out.println(j);
System.out.println(j.size());

//converting list into set
Set<Integer> r = new LinkedHashSet(j);
//r.addAll(j);
System.out.println(r);

for (Integer in : r) {
	System.out.println(in);
	
}
//for (int i =0; i < r.size(); i++) {		//for loop not able to create need to check
//	System.out.println(r(i));
}}
*/
//====================================================================================
/*
//create a treeSet and iterate each value in the set by using enhanced for loop 
//input :List = 10,20,40,30,50,60,70,80,90,10,20

public static void main(String[] args) {
	
	//create a list
	List<Integer> h= Arrays.asList(10,20,40,30,50,60,70,80,90,10,20);
	System.out.println(h);
	System.out.println(h.size());
	
	//for (Integer s : h) {		//we can access for each statement in list also 
	//	System.out.println(s);
	//}
	//converting list into set
	
	Set<Integer> o= new TreeSet();	//Set<Integer> o=new TreeSet(h) mean not necessary of o.addAll(h)
	o.addAll(h);
	System.out.println(o.size());
	System.out.println(o);

	//System.out.println(h.get(1));
	for (Integer u : o) {
		System.out.println(u);			//using foreach we get output
											//what is iterator
	}
	
	//List<Integer>y=new ArrayList<Integer>(o);
	//System.out.println(y);
	
	
	
//for (int i = 0; i < o.size(); i++) {	//using for loop we cant able able to access set value why?
//		System.out.println(h.get(i));
	//	System.out.println(i);
//	}
//	for (Iterator iterator = o.iterator(); iterator.hasNext();) {
//		Integer integer = (Integer) iterator.next();
//		System.out.println(iterator);
//	}
	
}}

*/
//==============================================================================
/*
//create a new hashset  with the values and return the common values
//input : List=10,20,30,90,10,10,40,50
//input : List=30,40,50,60,80

public static void main(String[] args) {
	//create a list
	List<Integer> u=Arrays.asList(10,20,30,90,10,10,40,50);
	System.out.println(u);
	System.out.println(u.size());
	
	//converte a list into set
	
	Set<Integer> eset1Hash= new HashSet(u);
	eset1Hash.addAll(u);
	System.out.println("eset1Hash is "+eset1Hash);
	
	//create a 2nd list
	List <Integer>u1=Arrays.asList(30,40,50,60,80);
	System.out.println(u1);
	System.out.println(u1.size());
	
	//convert u1 list into set2
	
	Set<Integer> eset2Hash= new HashSet(u1);
	eset2Hash.addAll(u1);
	System.out.println("eset2Hash is "+eset2Hash);
	System.out.println(eset2Hash.size());
	
	eset2Hash.retainAll(eset1Hash);
	System.out.println("retain of HashSet is "+eset2Hash);
	
//================================================================	
//set1-treeset
	Set<Integer>eset1tree=new TreeSet(u);
	System.out.println("eset1tree is "+eset1tree);
//set2-treeset
Set <Integer> eset2tree= new TreeSet(u1);
eset2tree.addAll(u1);
System.out.println("eset2tree is "+eset2tree);
System.out.println(eset2tree.size());

eset2tree.retainAll(eset1tree);
System.out.println("retain of eset2tree is "+eset2tree);

//remove

System.out.println(eset2tree.removeAll(eset2tree));
System.out.println(eset2tree);

	}
}
*/
//=========================================================================================}






