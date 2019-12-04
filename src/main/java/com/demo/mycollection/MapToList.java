package com.demo.mycollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("One", "Himanshu");
		map.put("Two", "Harry");
		map.put("Three", "Nagpal");
		map.put("Four", "Shahjade");
		List<String> name = new ArrayList<>();// map.values().stream().collect(Collectors.toList());
		name.addAll(map.keySet());
		name.addAll(map.values());
		name.forEach(System.out::println);
		
	}
}
