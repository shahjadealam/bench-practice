package com.demo.stringbasic;

import java.util.Scanner;

public class MyStringCompare {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int testCount = sc.nextInt();

			while (testCount != 0) {
				int len1 = sc.nextInt();
				int len2 = sc.nextInt();
				String str1 = sc.next();
				String str2 = sc.next();
				int maxlength = 0;
				int result = 0;
				if (str1.length() == len1 && str2.length() == len2) {
					for (int i = 0; i <= len1 - 1; i++) {
						for (int j = 0; j <= len2 - 1; j++) {

							if (str1.charAt(i) == str2.charAt(j)) {
								maxlength++;
								i++;

								result = maxlength;
							} else
								maxlength = 0;
						}
					}

				} else
					System.out.println("Invalid Length Entered");

				testCount--;
			}

		} catch (

		Exception e) {

		}
	}
}
