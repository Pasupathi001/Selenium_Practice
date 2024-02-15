package com.java;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		
		Map<Integer, Object> a = new LinkedHashMap<Integer, Object>();
		
		//put
		a.put(10, 'a');
		a.put(20, 'b');
		a.put(30, "hii");
		a.put(40, 'a');
		a.put(10, "hello");
		a.put(null, 30);
		
		System.out.println(a);
		
		//size
		int size = a.size();
		System.out.println(size);
		
		//get
		Object object = a.get(30);
		System.out.println(object);
		
		//key set.
		Set<Integer> keySet = a.keySet();
		System.out.println(keySet);
		
		//values
		Collection<Object> values = a.values();
		System.out.println(values);
		
		//Contains key
		boolean containsKey = a.containsKey(40);
		System.out.println(containsKey);
		
		//ContainsValues
		boolean containsValue = a.containsValue("h");
		System.out.println(containsValue);
		
		//Entry set
		Set<Entry<Integer, Object>> entrySet = a.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
