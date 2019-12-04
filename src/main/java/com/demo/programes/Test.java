package com.demo.programes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String input = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		input = sc.nextLine();

		getOccurance(input);
	}

	private static void getOccurance(String input) {

		Map<Character, Integer> myMap = new HashMap<>();
		char[] charArr = input.toCharArray();

		for (char key : charArr) {

			if (myMap.containsKey(key))
				myMap.put(key, myMap.get(key) + 1);
			else
				myMap.put(key, 1);
		}
		System.out.println("Char | Count");
		myMap.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}
