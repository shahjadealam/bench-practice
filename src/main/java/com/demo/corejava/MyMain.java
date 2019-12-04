package com.demo.corejava;

class Manipulation {

	public static void add() {

		System.out.println("Super");
	}

}

class Addition extends Manipulation { // Sub class

	public static void add() {
		System.out.println("Child");
	}

}

public class MyMain {
	public static void main(String args[]) {
		Manipulation addition = new Addition();
		// Manipulation is reference type and Addition is reference type
		addition.add();

		Overloading o = new Overloading();
		o.add("Hi");
	}
}

class Overloading {

	public static void add(String str) {
		System.out.println(str);
	}

	public void add() {
		System.out.println("Harry");
	}
}
