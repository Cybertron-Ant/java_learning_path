package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* class 'testList' shows the usage of 'HashSet'
   to store unique elements and iterating through its contents */
public class TestHashSetClass {

	public static void main(String[] args) {
		
		// creating a HashSet 'testList' of 'Integer' type
		Set<Integer> testList = new HashSet<Integer>();
		
		// adding elements to the HashSet
		testList.add(1);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		
		// printing the content of the HashSet
		System.out.println(testList);
		
		// journeying through the 'testList' HashSet using for-each loop
		for(Integer tList : testList) {
			System.out.println(tList);
		}// end 'FOR'
    
	}// end method 'main'

}// end class 'TestHashSetClass'
