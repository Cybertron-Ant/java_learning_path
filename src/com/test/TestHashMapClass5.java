package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// class shows the usage of 'HashMap' in Java, how to store key-value pairs, manage key overwrites, retrieve values by key, and iterate through the keys using an iterator to print associated values
public class TestHashMapClass5 {

	public static void main(String[] args) {
		
		// creating a 'HashMap' with Integer keys and String values
		HashMap<Integer, String> testMap = new HashMap<>();
		
		// adding key-value pairs to the 'HashMap'
		testMap.put(1, "test1");
		testMap.put(2, "test4");
		testMap.put(1, "test3"); // overwrites the value for key 1
		testMap.put(4, "test4");
		testMap.put(5, "test5");
		
		// printing the content of the 'HashMap'
		System.out.println(testMap);
		
		// printing the value associated with key 5
		System.out.println(testMap.get(5));
		
		// printing the set of keys in the HashMap
		System.out.println(testMap.keySet());
		
		// creating an iterator for the key set of the 'HashMap'
		Iterator<Integer> iterator = testMap.keySet().iterator();
		
		// iterating through the keys using the iterator and printing associated values
		while(iterator.hasNext()) {
			System.out.println(testMap.get(iterator.next()));
		}// end 'FOR'
    
	}// end method 'main'

}// end class 'TestHashMapClass5'
