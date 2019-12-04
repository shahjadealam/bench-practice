package com.demo.programes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindElementInArrCount {
public static void main(String[] args) {
	
	int[] input = {1,2,1,3};
	
	Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
	for(int key : input) {
		
		if(myMap.containsKey(key)) {
			myMap.put(key, myMap.get(key)+1);
		}
		else
			myMap.put(key, 1);
	}
	
	System.out.println("Element\tCount");
	myMap.forEach((k,v)->System.out.println(k+"\t"+v));
for(Map.Entry<Integer, Integer> my :myMap.entrySet() )
{
if(my.getValue() > input.length/2) {
	System.out.println("Output : "+my.getKey());
break;	
}

else
	System.out.println("Output :"+ -1);
}
}
}
