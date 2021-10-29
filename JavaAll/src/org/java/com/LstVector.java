package org.java.com;

import java.util.Vector;

public class LstVector {
	private static Object Object;

	public static void main(String[] args) {
		Vector<Object>vl=new Vector<Object>();
	vl.add("string");
	vl.add(22);
	vl.add('t');
	vl.add(43.3f);
	vl.add(22);
	vl.add("kannu");
	vl.add(null);
	//prnt all
	System.out.println(vl);					//capacity is their remains two list not have
	//contains
	System.out.println(vl.contains(22));	//first element method is their remain two doesnt have
	//Capacity
	System.out.println(vl.capacity());		//elementAt and get methods is their only in vectorlist but set method their in remain 2 list
	//Clone
	System.out.println(vl.clone());			//index of (o,int) used to search the element or object from the index number mentioned
	//System.out.println(vl.containsAll());	//insert at particular index is not possible adding at last index only possible
	
	Object =vl.elementAt(2);
	System.out.println(Object);
	//elementAt
	System.out.println(vl.elementAt(3));
	//firstElemnt
	System.out.println(vl.firstElement());
	//equals
	//System.out.println(vl.equals("kannu"));
	//get
	System.out.println(vl.get(4));
	//indexOf
	System.out.println(vl.indexOf(22));	
	//indexOf(o,int)
	System.out.println(vl.indexOf(22, 1));	//<----used to print duplicate vavlues
	//Last Index Of
	System.out.println(vl.lastIndexOf(22));
	//get
	System.out.println(vl.getClass());
	//add
	System.out.println(vl.add(22));
	System.out.println(vl);
	
	vl.add(2, 33);		//add by this kind is possible
	System.out.println(vl);

	//System.out.println(vl.add(3, 33));// add by this kind not possible
	
	//System.out.println(vl.add(2, 54));
	System.out.println(vl);
	System.out.println(vl);
	System.out.println(vl.indexOf(22, 5));
	
	//deletion
	System.out.println(vl.remove(6));
	System.out.println(vl);
	}

}
