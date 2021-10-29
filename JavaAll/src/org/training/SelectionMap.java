package org.training;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SelectionMap {

	public static void main(String[] args) {
		Map<String,Object> mm= new LinkedHashMap<String,Object>();
		
		mm.put("Sridhar", 819098388);
		mm.put("kumar", 999435000);
		mm.put("Santhi", 904375724);
		mm.put("Sarvesh", 979020569);
		mm.put("Hema",801571334);
		
		System.out.println(mm);
		
		System.out.println(mm.containsKey("Sarvesh"));
		
		System.out.println(mm.keySet());
		
		System.out.println(mm.values());
		
		Set<Entry<String,Object>> es=mm.entrySet();
		for (Entry<String, Object> entry : es) {
			System.out.println(entry);
		}
		
	}
}
