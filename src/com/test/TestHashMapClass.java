package com.test;

import java.util.HashMap;

// class 'TestHashMapClass' shows the usage of 'HashMap' to store key-value pairs and print its contents.
public class TestHashMapClass {

	public static void main(String[] args) {
		
		// creating a HashMap with Integer keys and String values
		HashMap<Integer, String> testMap = new HashMap<>();
		
		// adding key-value pairs to the 'HashMap'
		testMap.put(1, "test1");
		testMap.put(2, "test2");
		testMap.put(3, "test3");
		testMap.put(4, "test4");
		testMap.put(5, "test5");
		
		// printing the content of the 'HashMap'
		System.out.println(testMap);
    
	}// end method 'main'

}// end class 'TestHashMapClass'
