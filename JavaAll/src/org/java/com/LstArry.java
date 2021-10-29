package org.java.com;

import java.util.ArrayList;
import java.util.Collections;

public class LstArry {

	public static void main(String[] args) {
	//<Integer> we can give only Integer Datatype/Objects
	//<String> we can give only String Datatype/Objects
	//<Object>we can give different datatypes/Objects {
	
	
		ArrayList <Object>arrlst=new ArrayList<Object>();
		arrlst.add("sridhar");
		arrlst.add(33);
		arrlst.add(2.3f);
		arrlst.add('r');
		arrlst.add(null);					//clone we can access
		arrlst.add("");						//trim method is their
	//print all
	System.out.println(arrlst);
	//add element
	System.out.println(arrlst.add("arial"));
	//add print all
	System.out.println(arrlst);
	//Clone
	System.out.println(arrlst.clone());
	//contains
	System.out.println(arrlst.contains(null));
	//get
	System.out.println(arrlst.get(3));
	//hashcode
	System.out.println(arrlst.hashCode());
	//indexOf
	System.out.println(arrlst.indexOf('r'));
	//lastindexOf
	System.out.println(arrlst.lastIndexOf(""));
	//remove									//inserting is not possible/difficult insert at last is only possible(appande)
												//while inserting the object, it replace the object which is already in that index number
	System.out.println(arrlst.remove(2));		//remove or deletion is easy
	//print all
	System.out.println(arrlst);
	//set 
	System.out.println(arrlst.set(2, "arrlst"));
	System.out.println(arrlst);
	//size
	System.out.println(arrlst.size());
	//toString
	//System.out.println(arrlst.toString());
	//toArray
	//System.out.println(arrlst.toArray());
	//deletion
	System.out.println(arrlst.remove(null));
	System.out.println(arrlst);
	
	arrlst.add(2, 22);		//insertion is possible by usibng this method but directly add in sysout is not possible
System.out.println(arrlst);	

	Collections.reverse(arrlst);		//---->used to print in reverse order
	System.out.println(arrlst);
	
	//Collections.sort(arrlst);			//not able to use sort in object type its single data type oriented
	}	}								//see in lstlinkd


