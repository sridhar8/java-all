package org.java.com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LstLinkd {
public static void main(String[] args) {
	
	List<Integer>l1=new LinkedList<Integer>();
	
	l1.add(101);
	l1.add(200);
	l1.add(10);
	l1.add(40);
	System.out.println(l1);
	
	Collections.sort(l1);	//sort used to print in ascending order values
		System.out.println(l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		
		Collections.reverse(l1);
		System.out.println(l1);
		
		System.out.println(l1.subList(0, 3));
		
		l1.add(2, null);		//add by using this is possible
		System.out.println(l1);
//		System.out.println(l1.add(2, 23)); //add by using this method is not possible
		
	}}


