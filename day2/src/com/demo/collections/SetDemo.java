package com.demo.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//HashSet<String> fruits=new HashSet<>();
		
		TreeSet<String> fruits=new TreeSet<>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("guava");
		fruits.add("mango");
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
		
		fruits.forEach(System.out::println);
		
	}
}
