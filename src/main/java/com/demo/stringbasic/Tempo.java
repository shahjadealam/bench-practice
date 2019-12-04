package com.demo.stringbasic;

import java.util.Scanner;

public class Tempo {
	static int i=5;
	static int j=7;
	public static void main(String[] args) {

		Tempo t= new Tempo();
		t.test();
		System.out.println(i);
		System.out.println();
	AnotherClass obj=new AnotherClass();
	obj.swap(i,j);
	
	System.out.println("i : "+i);
	System.out.println("j : "+j);
	}
	
	public void test()
	{
		i++;
	
	}
	
	
}
class AnotherClass{
	public static void swap(int i, int j) {
		int temp=i;
		Tempo.i=j;
		Tempo.j=temp;
		
	}
}