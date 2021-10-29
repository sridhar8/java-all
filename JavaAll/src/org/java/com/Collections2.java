package org.java.com;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Collections2 {
	public static void main(String[] args) {
		Set<Object> g = new TreeSet<Object>();
		g.add("sridhar");
		//g.add(23);
		//g.add('f');
//		g.add(null);
//		g.add(null);
		//g.add(23.7);
//		g.add(34);					//work in same data type
//		g.add(22);					//remain same
		g.add("g");					//print in ascending order
		g.add("re");
		
		
		
		System.out.println(g);
		//Collections.rotate("g", 2);
//		System.out.println(g.);
		g.add("ree");
		System.out.println(g);

	}

}
