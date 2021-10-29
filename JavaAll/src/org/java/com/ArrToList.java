package org.java.com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrToList {
	
	//get the each value of list by using normal for loop
	//list=105,205,305,405,505,605,705,805
	
public static void main(String[] args) {
	int a[] = {105,205,305,405,505,605,705,805,60,70,80};
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	//using for each
	for (int i : a) {
		System.out.println(i);
		
	}
//print at index of 8
//System.out.println(a[8]);

//remove

List<Integer>g=new LinkedList<Integer>();
g.addAll(Arrays.asList(new Integer[] {105,205,305,405,505,605,705,805,60,70,80}));
System.out.println(g);
System.out.println(g.remove(2));
System.out.println(g);

g.add(2, 50);
System.out.println(g);

int b[]= {30,40,50,60,70,80};
List<Integer>l1=new LinkedList<Integer>();
l1.addAll(Arrays.asList(new Integer[] {30,40,50,60,70,80}));
System.out.println(l1);
System.out.println(l1.retainAll(g));
System.out.println(l1);
for (Integer i : l1) {
	System.out.println(i);
	
}

}
}
