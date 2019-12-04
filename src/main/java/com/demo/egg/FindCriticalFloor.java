package com.demo.egg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindCriticalFloor {

	public static void main(String[] args) {

		Integer[] arrayInt = { 1, 2, 3, 1, 2, 3, 12, 12, 2, 5, 6, 9, 7, 10 };

		Set<Integer> setOfInt = new TreeSet<Integer>(Arrays.asList(arrayInt));

		//setOfInt.forEach(System.out::println);
		
		Object[] objArr = setOfInt.toArray();
		int i = 0;
		int size = setOfInt.size();
		Integer[] arrayIntNew = new Integer[size];
		for (Object x : objArr) {
			//arrayIntNew[i] = new Integer(0);
			arrayIntNew[i] = Integer.valueOf(x.toString());
			i++;
		}

		Arrays.asList(arrayIntNew).forEach(System.out::println);
		List<Integer> intList = Arrays.asList(arrayInt);
		
		intList.sort((a,b)-> a.compareTo(b));//Integer.compare(a, b));
		
Collections.sort(intList);	
System.out.println("=======================");
intList.forEach(System.out::println);
		}

}
