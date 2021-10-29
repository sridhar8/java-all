package org.java.com;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Collection {
	
	public static void main(String[] args) {
		Set<Object> s=new HashSet<Object>();
		s.add("sridhar:");
		s.add(23);
		s.add(23.4);
		s.add('d');
		s.add(null);
		s.add(true);
		s.add(23.4);
		
		//printall
		System.out.println(s);						//not allow the duplicate value so deletion happend in roll 16
		//contains									//its value based not index based so addoition of value is append only not possible in between values
		System.out.println(s.contains(23.4));		//print in random ordr
		//equals			
		//System.out.println();						//equals are used to compare with one set to other set
		//hastcode
		System.out.println(s.hashCode());
		//isEmpty
		System.out.println(s.isEmpty());
		//remove
		System.out.println(s.remove(23.4));
		System.out.println(s);
		//size
		System.out.println(s.size());
		//get class library
		System.out.println(s.getClass());	//inset,index number,get subsequence methods not availab,e in set but available in list
		
		//Collections.reverseOrder();		//collections are nto accessible in set 
		//System.out.println(s);
		//Collections.emptySet();
		System.out.println(s.isEmpty());
		System.out.println(s.removeAll(s));
		System.out.println(s);
		
		
		
		
		

	}

}
