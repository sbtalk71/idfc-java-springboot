package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<String> fruits=new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add(1,"banana");
		fruits.add("banana");
		fruits.add("guava");
		
		System.out.println(fruits);
		
		//fruits.remove(1);
		System.out.println(fruits);
		
		fruits.remove("banana");
		System.out.println(fruits);
		
		
		Iterator<String> itr=fruits.iterator();
		
		while(itr.hasNext()) {
			String fruit=itr.next();
			System.out.println(fruit);
		}
		
		for(String s:fruits) {
			System.out.println(s);
		}
		
		fruits.forEach(s->System.out.println(s));
		
	
		Collections.sort(fruits, (s1,s2)->s1.compareTo(s2));
		
		System.out.println(fruits);
		
	}
}

/*
 * class MyDataSorter implements Comparator<String>{
 * 
 * @Override public int compare(String o1, String o2) {
 * 
 * return o1.compareTo(o2); } }
 */
