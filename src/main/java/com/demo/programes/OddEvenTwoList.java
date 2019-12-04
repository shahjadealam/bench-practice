package com.demo.programes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenTwoList {

	public static void main(String[] args) {
		int number = 100;
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
int nuber=40;
		System.out.println(IntStream.range(1, nuber).filter(a -> a % 2 == 0).boxed().collect(Collectors.toList()));

		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0)
				evenList.add(i);
			// System.out.println(i+" :Even");

			else
				oddList.add(i);
			// System.out.println(i+" : Odd");
		}

		System.out.println("===== Even Number List ====");
		evenList.forEach(a -> System.out.print(a + " "));

		System.out.println("===== Odd Number List ====");
		oddList.forEach(o -> System.out.print(o + " "));

	}

}
