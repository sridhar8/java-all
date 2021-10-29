package com.javapractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTask1 {
	/*
	public static void main(String[] args) {
	HashMap<Object, Object> h = new HashMap<>();	
	  h.put(10, "Java");
	  h.put(20, "sql");
	  h.put(30, "oops");
	  h.put(40, "Sql");
	  h.put(50, "DB");
	  h.put(60, "Oracle");
	  h.put(10, "Selenium");
	  h.put(50, "Psql");
	  h.put(40, "Hadoop");
	  
	  System.out.println(h.keySet());
	  System.out.println(h.values());
	  System.out.println(h);
	  Set<Entry<Object, Object>> entrySet = h.entrySet();
	for (Entry<Object, Object> entry : entrySet) {
		System.out.println(entry);
	}
	*/
//=====================================================================
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
//Scanner s = new Scanner(System.in);
System.out.println("emp.number: "+i);

System.out.println("Enter emp.Id: ");
String a=s.next();

System.out.println("enter your name: ");
String b=s.next();

System.out.println("Enter phone no: ");
int c=s.nextInt();

System.out.println("Enter DOB: ");
String d= s.next();

System.out.println("Enter your mail: ");
String e= s.next();

System.out.println("Enter your gender: ");
String f= s.next();

System.out.println("Enter your Salary: ");
int g=s.nextInt();

System.out.println("Enter your Address: ");
String h=s.next();

	lhm.put("empId", a);
	lhm.put("name", b);
	lhm.put("Phone", c);
	lhm.put("address", h);
	lhm.put("dob", d);
	lhm.put("doj", 23);
	lhm.put("mail", e);
	lhm.put("gender", f);
	lhm.put("salary", g);
	System.out.println(lhm);
//if (lhm.containsKey("Phone")) {
//	Object q=lhm.get("Phone");
//	System.out.println("Value of "+"\"Phone\" is:"+q);
//}

//System.out.println("emp.number: "+i);
		
			
		
	Set<Entry<Object, Object>> entrySet = lhm.entrySet();
	for (Entry<Object, Object> entry : entrySet) {
	System.out.println(entry);
		}
//	System.out.println(entry.getKey());
//	System.out.println(entry.getValue());
//	}
	
//System.out.println(entrySet.containsAll(entrySet));
//System.out.println(entrySet);
	
	}
	}
}


