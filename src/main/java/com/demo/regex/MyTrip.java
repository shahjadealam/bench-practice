package com.demo.regex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTrip {
	public static void main(String[] args) {

		List<String> goodThings = Arrays.asList("matches", "jacket", "blanket", "compass", "pot", "hat", "screwdriver",
				"fork", "book", "penknife");

		List<String> badThings = Arrays.asList("smartphone", "sword", "axe", "radio", "walkman", "tv", "camera",
				"boombox", "skateboard", "smartwatch");
		String input = null;
		String regex = ".*[strk]|fe$";
		Pattern r = Pattern.compile(regex);
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		do {
			input = sc.next();

			Matcher m = r.matcher(input);
			System.out.println(m.lookingAt());
		} while (!input.equals("exit"));
	}
}
