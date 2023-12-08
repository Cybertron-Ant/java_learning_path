package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// class 'TestHashMapClass3' shows how it stores unique key-value pairs, manages key overwrites, retrieves values by key, and iterates through the key set to print associated values
public class TestHashMapClass3 {

	public static void main(String[] args) {
		
		// creating a 'HashMap' with Integer keys and String values
		HashMap<Integer, String> testMap = new HashMap<>();
		
		// adding key-value pairs to the HashMap
		testMap.put(1, "test1");
		testMap.put(2, "test4");
		testMap.put(1, "test3"); // overwrites the value for key 1
		testMap.put(4, "test4");
		testMap.put(5, "test5");
		
		// printing the content of the 'HashMap'
		System.out.println(testMap);
		
		// printing the value associated with key 5
		System.out.println(testMap.get(5));
		
		// printing the set of keys in the 'HashMap'
		System.out.println(testMap.keySet());
		
		// iterating through the 'HashMap' and printing its values
		for(Integer key : testMap.keySet()) {
			System.out.println(testMap.get(key));
		}// end 'FOR'
    
	}// end method 'main'

}// end class 'TestHashMapClass3'
