package com.javapractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClaz {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(4, "sridhar");
		hm.put(1, 23);
		hm.put(3, 23.3);	//output print in random order and its based on initial capacity
		hm.put(2, 'a');		//only one null key allowed
		hm.put(5, null);	//null value allow
		hm.put(null, null);
		hm.put(null, 5);
		hm.put("string", "String");
		System.out.println(hm);
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		lhm.put(0, "sarvesh");
		lhm.put(5, 43);
		lhm.put(7, 34.6);		//output print in insertion order
		lhm.put(9, null);		//only one null key allowesd
		lhm.put(null, null);	//null value allow
		lhm.put(null, 5);
		lhm.put(10, 'a');
		lhm.put("string", "String");
		System.out.println(lhm);
		
		TreeMap<Object, Object> tm = new TreeMap<>();
	tm.put(13, "haha");
	tm.put(12, 77);				//output print in ascending order
	tm.put(15, 'f');			//not even one null key allowed
	tm.put(14, null);			//null value allow
	//tm.put(null, null);		//key data type oriented
	//tm.put(null, null);
	tm.put(18, 23.2);
	//tm.put("string", "String");
	System.out.println(tm);
	
	Hashtable<Object, Object> ht = new Hashtable<>();
	ht.put(21, "hi");
	ht.put(24, 100);
	ht.put(22, 23.32);				//random order 
	//ht.put(null, null);			//null not allowed in key and value also
	ht.put(26, 'h');
	//ht.put(27, null);
	//ht.put(null, 4);
	System.out.println(ht);
	
	System.out.println(ht.size());
	System.out.println(ht.contains("hi"));
	if (ht.containsKey(26)) {
		Object d= ht.get(26);
		System.out.println("value of key"+"\"26\" is: "+d);
		} 

	}
	

}
