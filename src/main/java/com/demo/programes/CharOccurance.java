package com.demo.programes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		String input = "ShahjadeA";
		
		char[] chArr = input.toCharArray();
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for(char item:chArr)
		{
			if(countMap.containsKey(item))
			{
				
				countMap.put(item, countMap.get(item)+1);
			}
			else
			{
				countMap.put(item, 1);
			}
		}
		
		countMap.forEach((w,c)->System.out.println(w+"-->"+c));
		
		Arrays.sort(chArr);
		System.out.println(chArr);
		
	}
}
