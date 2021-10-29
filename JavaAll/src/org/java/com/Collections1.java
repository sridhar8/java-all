package org.java.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collections1 {
	
	public static void main(String[] args) {
		Set<Object> d=new LinkedHashSet<Object>();
		d.add("sridhar:");
		d.add(23);
		d.add(23.3);
		d.add('D');
		d.add(null);
		d.add(23);
								//same methods as hashset
//		print all				//print in insertion order
//		System.out.println(d);
//		size
//		System.out.println(d.size());
//		iterator
//		System.out.println(d.iterator());
//		
//=====================================================
	Set<Integer> las = new LinkedHashSet<>();
		las.add(10);
		las.add(20);
		las.add(50);
		las.add(40);
		las.add(23);
		//System.out.println(las);
		d.addAll(las);
		System.out.println(d);
		
	System.out.println(las);
	las.add(22);
	
		//Collections.reverseOrder((Comparator<?>) las);
		System.out.println(las);
	}

}
