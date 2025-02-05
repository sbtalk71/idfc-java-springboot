package com.demo.collections;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> mapData = new HashMap<>();

		mapData.put(1, "Lion");
		mapData.put(2, "Tiger");
		mapData.put(3, "Fox");
		mapData.put(4, "Elephant");
		mapData.put(5, "Dog");
		mapData.put(2, "Leopard");
		
		System.out.println(mapData.get(2));
		
		System.out.println(mapData.remove(3));
		
		System.out.println(mapData);
		
		Set<Integer> keys=mapData.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+"---->"+mapData.get(key));
		}
		
		keys.stream().map(key->mapData.get(key)).forEach(System.out::println);
		
		
	}
}
