package com.javapractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSelection {
	
	public static void main(String[] args) {
		String s="To the people for the people by the people";
		String[] split =s.split(" ");
		Map<String,Integer>m=new LinkedHashMap<String,Integer>();// from else statement to,the,people,for,by(map input)
		for (String str : split) {				// to,the,people,for,the,people,by,the,people(str split)
		System.out.println(str);
//		System.out.println(s);
	if (m.containsKey(str)) {					//input of m.(to,the,people,for,by
		Integer value =m.get(str);				//to,the,people,for,by(m.get input) //initialization
		m.put(str+1,value+1);						//to,the,people,for,the,people,by,the,people (m.put input)

		//in map memor already have the value of to,the,people,for,and by.so when it comes again value has been added by 1
	}
	else{
		m.put(str, 1);//output :to the people for by
		}
	}
System.out.println(m);

Set<Entry<String,Integer>>entrySet=m.entrySet();
for (Entry<String, Integer> entry : entrySet) {
	System.out.println(entry);
	}	
}}




