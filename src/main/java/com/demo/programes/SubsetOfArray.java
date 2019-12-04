package com.demo.programes;

import java.util.Scanner;

public class SubsetOfArray {
	public static void main(String[] args) {

		int m, n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first array size");
		m = sc.nextInt();
		int[] array1 = new int[m];

		System.out.println("Now enter elements");
		for (int i = 0; i < m; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter second array size");
		n = sc.nextInt();
		int[] array2 = new int[n];

		System.out.println("Now enter elemens");
		for (int i = 0; i < n; i++) {
			array2[i] = sc.nextInt();
		}

		boolean result = isSubset(array1, array2, m, n);
		System.out.println(result);
		
		sc.close();

	}

	private static boolean isSubset(int[] array1, int[] array2, int m, int n) {
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (array1[j] == array2[i])
					break;
			}
			if (j == m)
				return false;
		}
		return true;
	}
}