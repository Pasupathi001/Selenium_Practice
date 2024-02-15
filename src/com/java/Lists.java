package com.java;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<Object> a = new ArrayList<Object>();
		
		a.add(20);
		a.add(30);
		a.add(40);
		a.add("abcd");
		a.add(10);
		a.add("Hello");
		System.out.println(a);
		
		//Size
		int size = a.size();
		System.out.println(size);
		
		//get
		Object object = a.get(4);
		System.out.println(object);
		
		//Set
		Object set = a.set(3, 45);
		System.out.println(a);
		
		//Indexof
		int indexOf = a.indexOf(30);
		System.out.println(indexOf);
		
		//contains
		boolean contains = a.contains(40);
		System.out.println(contains);
		
		List<Object> a1 = new ArrayList<Object>();
		
		a1.add(25);
		a1.add(10);
		a1.add("abc");
		a1.add(23);
		a1.add(49);
		a1.add("Hiii");
		System.out.println(a1);
		
		//addall
		
//		a.addAll(a1);
//		System.out.println(a);
//		
//		//retainAll
//		a.retainAll(a1);
//		System.out.println(a);
//		
		//removeall
		a.removeAll(a1);
		System.out.println(a);
		
		//remove
		a.remove(2);
		System.out.println(a);
		
		//Clear
		a.clear();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
