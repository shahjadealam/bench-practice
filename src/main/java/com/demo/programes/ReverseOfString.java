package com.demo.programes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReverseOfString {
	public static void main(String[] args) {

		String s1 = "Shahjade";
		String s2 = "Alam";
		
		Map<String, String> myMap = new HashMap<>();
		myMap.put("one", "Shahjade");
		myMap.put("two", "Alam");
		
		//String str = "Shahjade";
		//reverse(str);
		
	}
	
	public static void reverse(String s)
	{
		int length = s.length();
		System.out.println(length);
		String newStr = null;
		if(length==0)
		{
			System.out.println("Result : "+newStr);
		}
		
		else
		{
		
		char ch=s.charAt(length-1);
		System.out.println("ch:"+ch);
		reverse(s.substring(0, length-1));
		}
	}

}
