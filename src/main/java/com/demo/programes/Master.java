package com.demo.programes;

public class Master {

	public static void main(String[] args) {
		System.out.println();
		int n=10;
		
		try
		{
	
System.out.println(n/0);
//throw new Error();
		}catch(Exception e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finnaly");
		}
		System.out.println("out");
	}}