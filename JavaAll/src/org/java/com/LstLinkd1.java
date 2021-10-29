package org.java.com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LstLinkd1 {
private static Object Object;

public static void main(String[] args) {
	List<Object> a=new LinkedList<Object>();
a.add(10);
a.add("string");
a.add(2.2f); 
a.add(null);
a.add('b');
a.add("");							//clone not coming in linkedlist
									//trim not coming
//size								//insert at index number in direct sysout is not possible 3 list 
System.out.println(a.size());
//indexOf
System.out.println(a.indexOf(null));
//contains
System.out.println(a.contains('b'));
//get
System.out.println(a.get(3));
//all
System.out.println(a);
//set/replace
System.out.println(a.set(2, "replce"));
System.out.println(a);

Object = a.get(3);
System.out.println(Object);

a.add(23);
System.out.println(a.contains(23));

//insert add(index,element)
a.add(2, "hi");		//add is possible by this way
System.out.println(a);

//System.out.println(a.add(2, 43));// add is not possible by this way
//System.out.println(a);

//remove
System.out.println(a.remove(5));

List<Object> arr=new LinkedList<Object>();
arr.add("hi");
arr.add("world");
arr.add("welcome");
arr.add(23);
arr.add(12);


a.addAll(arr);
System.out.println(a);

//last indexOf
System.out.println(a.lastIndexOf(23));
System.out.println(a.iterator());

//remove indexOf
System.out.println(a.remove(1));
System.out.println(a);

//remove of Object 
System.out.println(a.remove(null));
System.out.println(a);

//retain of arr from a( it allows to retain add indually)
//here hi and 23 added at line 38 and 42 so its retain
System.out.println(a.retainAll(arr));
System.out.println(a);

//getClass(used to find the library where we used from)
System.out.println(a.getClass());

//subList(used to print the list from where you want to where you end)
System.out.println(a.subList(1, 06));

System.out.println(a.hashCode());
System.out.println(a.lastIndexOf(12));

Collections.disjoint(a, arr);//<--- need to check the purposes
System.out.println(a);
System.out.println(arr);
}}










