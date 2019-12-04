package com.demo.stringbasic;

import java.util.Scanner;

public class SubstringOccurence {

	public static void main(String[] args) {

		String s = null, x = null;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n >= 200) {
			System.out.println(n + " : should be less than 200");
			System.exit(-1);
		}

		int i = 1;
		while (i <= n) {
			s = sc.next();
			x = sc.next();
			i++;
			if (s.contains(x)) {
				// System.out.println("TRUE");
				System.out.println(s.indexOf(x));
			} else {
				// System.out.println("FALSE");
				System.out.println(-1);
			}

		}

	}
}
