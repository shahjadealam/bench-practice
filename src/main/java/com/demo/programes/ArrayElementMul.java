package com.demo.programes;

import java.util.Scanner;

// write a program to update current value with multiplication of previour ans next element and their addition
public class ArrayElementMul {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");

		int length = sc.nextInt();

		int[] inputArr = new int[length];
		System.out.println("Now enter element");
		for (int i = 0; i < length; i++) {
			inputArr[i] = sc.nextInt();
		}
		// int[] input = { 1, 3, 5, 6, 8 };
		// output [3,18,45,78,48]
		arrMul(inputArr);

	}

	private static void arrMul(int[] input) {
		int length = input.length;
		int[] output = new int[length];

		output[0] = input[0] * input[1];

		output[length - 1] = input[length - 1] * input[length - 2];

		for (int i = 1; i < length - 1; i++) {

			output[i] = input[i] * input[i - 1] + input[i] * input[i + 1];
		}

		System.out.println("OUTPUT");
		for (int i : output)
			System.out.print(i + " ");
	}
}
