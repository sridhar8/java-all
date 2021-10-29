package org.java.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSelections {
	public static void main(String[] args) {
		Map<Integer,Object>m=new LinkedHashMap<Integer,Object>();
			//key,value
		m.put(1, "Sridhar");
		m.put(2, 32.32);
		m.put(4, 'm');
		m.put(null, true);
		m.put(null,322);
		
		System.out.println(m);	//null true override by null 322
								//map doesnt allow duplicate key but it allow duplicate values
	//containskey
		System.out.println(m.containsKey(4));
		System.out.println(m.containsKey(5));

	//containsvalue
		System.out.println(m.containsValue(322));

	//size
	System.out.println(m.size());
	
	//get
	System.out.println(m.get(3));
	
	//get
	//System.out.println(m.getOrDefault(7, m));
	
	//keyset							//read the different  between get and containkey
	System.out.println(m.keySet());
	
	//keyValues
	System.out.println(m.values());
	
	//entryset
	Set<Entry<Integer,Object>> es =m.entrySet();
	for (Entry<Integer, Object> entry : es) {
		System.out.println(entry);
	}
}
}