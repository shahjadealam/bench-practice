package com.demo.mycollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	public static void main(String[] args) {
		String[] listOfName = { "Himanshu", "Harry", "Shahjade", "Mohneesh", "Nagpal" };
		Set<String> setOfNames = new HashSet<String>();
		setOfNames.addAll(Arrays.asList(listOfName));

		setOfNames.forEach(System.out::println);
		// -----------------------------------------------------
		Object[] arrayofName = setOfNames.toArray();
		for (Object name : arrayofName)
			System.out.println(name.toString());
	}
}
