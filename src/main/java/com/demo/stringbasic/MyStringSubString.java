package com.demo.stringbasic;

import java.util.Scanner;

public class MyStringSubString {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int testCount = sc.nextInt();

			while (testCount != 0) {
				String str1 = sc.next();
				String str2 = sc.next();

				int result = 0;
				System.out.println(str1.contains(str2));

				testCount--;
			}

		} catch (Exception e) {

		}
	}
}
