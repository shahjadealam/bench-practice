package com.demo.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("abc", 100);
		myMap.put("xyz", 200);
		myMap.put("def", 300);
		myMap.put("mno", 400);
		myMap.put("pqr", 500);

		//iterate on Map
		System.out.println("Before Sort :" + myMap);
		
		//way-1
		System.out.println("Iterate on Map by forEach()");
		myMap.forEach((k, v) -> System.out.println("Key : " + k + "\t" + "Value : " + v));

		//way-2
		System.out.println("Iterate on Map by EntrySet");
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "\t" + "Value : " + entry.getValue());
		}

		
		
		//1st way to sort
		System.out.println(" 1.After Sort : using TreeMap");
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.putAll(myMap);
		treeMap.forEach((k, v) -> System.out.println("Key : " + k + "\t" + "Value : " + v));

		System.out.println("2. After Sort : using List");

		// 2nd way to sort
		List<String> myList = new ArrayList<>(myMap.keySet());

		Collections.sort(myList);
		for (String key : myList) {
			System.out.println("KEY : " + key + "\t" + "Value :" + myMap.get(key));
		}
	}

}
