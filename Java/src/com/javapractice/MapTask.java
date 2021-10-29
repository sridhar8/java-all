package com.javapractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {

	//create a hashMap with the key  and values
	//Keys:10,20,30,40,50,60,10,50,40
	//Values:java,sql,oops,Sql,oracle,db,selenium,psql,hadoop.
	public static void main(String[] args) {
/*		Map<Object, Object> hm = new HashMap<>();
		hm.put(20, "java");
		hm.put(10, 23);
		hm.put(40, 'e');
		hm.put(30, 23.3);		//print in random order
		hm.put(60, "DB");		//its related to initial capacity
		hm.put(50, "Oracle");	//null key allowed in one time 
		hm.put(null, null);		//key and values print seperately and directly
		hm.put("string", "String");
		//hm.put(10, "Selenium");
		//hm.put(50, "psql");
		//hm.put(40, "hadoop");
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		Set<Entry<Object, Object>> entrySet = hm.entrySet();
		
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}*/
//=======================================================================		
	/*	Map<Object, Object> h = new HashMap<>();
		h.put(4, "sridhar");
		h.put(1, 23);
		h.put(3, 23.3);		//output print in ascending order
		h.put(2, 'a');		//only one null key allowed
		h.put(5, null);		//null value allow
		h.put(null, null);	//null key allowed in one time
		h.put(null, 5);		//keys and values print seperately and directly
		h.put("string", "String");
		System.out.println(h);
		
		Set<Entry<Object, Object>> entrySet2 = h.entrySet();
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		for (Entry<Object, Object> entry : entrySet2) {
		System.out.println(entry);	
		}*/
//=====================================================================		
	/*	LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		lhm.put(10, 10);
		lhm.put(20, 20);
		lhm.put(40, 30);		//print in insertion order
		lhm.put(30, 40);		//null key allowed in one time
		lhm.put(60, 50);		//keys and values print seperately and directly
		lhm.put(50, 60);
		lhm.put(10, 10);
		lhm.put(50, 50);
		lhm.put(40, 40);
		lhm.put("tstring", "String");
		lhm.put(null, null);
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		Set<Entry<Object, Object>> entrySet3 = lhm.entrySet();
		
		for (Entry<Object, Object> entry : entrySet3) {
			System.out.println(entry);
		}
//=========================================================================		
		TreeMap<Object, Object> tm = new TreeMap<>();
		tm.put("!", 10);
		tm.put("@", 20);
		tm.put("#", 30);
		tm.put("$", 40);		//its datatype object oriented
		tm.put("%", 50);		//keys and values print seperately and directly
		tm.put("^", 60);
		tm.put("&", 50);
		tm.put("*", 10);
		tm.put("(", 40);
		//tm.put(4, "String");
		//tm.put(null, null);
		System.out.println(tm);
		
		Set<Entry<Object, Object>> entrySet4 = tm.entrySet();
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		for (Entry<Object, Object> entry : entrySet4) {
			System.out.println(entry);
		}
		*/
//==========================================================		
		Hashtable<Object, Object> hT = new Hashtable<>();
		hT.put("string", "String");
		hT.put(2, 22);
		hT.put('d', 25);	//random order
		hT.put(50, 's');	//null key and value not allowed at even one time
		//hT.put(null, 4);	//keys cannot print alone(directly )
		//hT.put(5, null);	//values cab be print
							//but after entryset key and value can be print 
		System.out.println(hT);
		System.out.println(hT.keys());
		System.out.println(hT.values());
		Set<Entry<Object, Object>> entrySet6 = hT.entrySet();
		
		for (Entry<Object, Object> entry : entrySet6) {
			System.out.println(entry);
		}
	
//===========================================================		
		Hashtable<Object, Object> hTb = new Hashtable<>();
		hTb.put("Vel", "Selenium");
		hTb.put("Ganesh","Framework");
		hTb.put("Dinesh", "Oracle");
		hTb.put("Venkat", "CoreJava");
		hTb.put("Subash", "jira");
	System.out.println(hTb);
	System.out.println(hTb.keys());
	System.out.println(hTb.values());
	
	Set<Entry<Object, Object>> entrySet5 = hTb.entrySet();
	
	for (Entry<Object, Object> entry : entrySet5) {
		System.out.println(entry);
		System.out.println(entry.getKey());
//		System.out.println(entry.getValue());
	}
//======================================================================	
	}
	
}
