package com.demo.mycollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author shahjade.a
 *
 *         Two ways to implement sorting using Comparable--> compareTo() and
 *         Comparator-->compare() if you are using Comarable. you need to
 *         implement inside same class. if you are using Comparator you need to
 *         implement in another class. or you can pass comparator using lambda
 *         function
 */
public class Example {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList("Shahjade", "Alam", "Himanshu", "Nagpal");

		System.out.println("=========LIST==============");
		System.out.println("Using For each Loop");
		for (String name : myList)
			System.out.println("Name : " + name);

		System.out.println("Using Java 8");
		myList.forEach(System.out::println);

		System.out.println("using Iterator");

		Iterator itr = myList.iterator();
		while (itr.hasNext())
			System.out.println("Name : " + itr.next());

		System.out.println("=========SET==============");

		Set<String> mySet = new HashSet<String>();
		mySet.addAll(myList);
		mySet.forEach(System.out::println);

		System.out.println("=========MAP==============");
		Map<String, String> myMap = new HashMap<String, String>();

		myMap.put("one", "AAA");
		myMap.put("two", "BBB");
		myMap.put("three", "CCC");

		myMap.forEach((k, v) -> System.out.println("KEY : " + k + "\t" + "VALUE : " + v));

		for (Map.Entry<String, String> mapEntry : myMap.entrySet()) {
			System.out.println("Key : " + mapEntry.getKey() + "\t Value : " + mapEntry.getValue());
		}

		Collections.sort(myList);
		myList.forEach(System.out::println);

		System.out.println("=========Comprable Example==============");
		Employee emp1 = new Employee("Alam", 24, "Delhi");
		Employee emp2 = new Employee("Shahjade", 25, "Delhi");
		Employee emp3 = new Employee("Himanshu", 24, "Noida");
		Employee emp4 = new Employee("Nagpal", 12, "Mumbai");

		Set<Employee> treeSet = new TreeSet<Employee>((i, j) -> i.getCity().compareTo(j.getCity()));

	//	Set<Employee> treeSet = new TreeSet<Employee>((o1, o2) -> o1.getName().compareTo(o2.getName()));

		treeSet.addAll(Arrays.asList(emp1, emp2, emp3, emp4));

		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		treeSet.add(emp4);

		treeSet.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("=========Map Example==============");

		Map<Employee, String> myMap2 = new TreeMap<Employee, String>((o1, o2) -> o1.getName().compareTo(o2.getName()));

		myMap2.put(emp1, "AAA");
		myMap2.put(emp2, "BBB");
		myMap2.put(emp3, "CCC");
		myMap2.put(emp4, "DDD"); // myMap2.put("five", "aaa"); // myMap2.put("six","zzz");

		myMap2.forEach((k, v) -> System.out.println(k + "\t" + v));

		List<Employee> listEmp = Arrays.asList(emp1, emp2, emp3, emp4);
		Collections.sort(listEmp, (e1, e2) -> e1.getCity().compareTo(e2.getCity()));
		System.out.println("00--------------------------------00");
		listEmp.sort((a, b) -> a.getAge() - b.getAge());
		listEmp.forEach(System.out::println);

	}

}
