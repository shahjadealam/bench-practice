package com.demo.programes;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
	public static void main(String[] args) {
		String input = "AabcdBacdadc";
		char[] charArr = input.toCharArray();
		
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		for(char key : charArr)
		{
			if(myMap.containsKey(key)) {
				myMap.put(key, myMap.get(key)+1);
			}
			
			else {
				myMap.put(key, 1);
			}
		}
		
		System.out.println("Char\tCount");
		myMap.forEach((k,v)->System.out.println(k+"\t"+v));
		System.out.println("-------------------");
		
	}

}
