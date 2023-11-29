package com.test;

// class 'StaticVariableTest1' containing the 'main' method to manipulate and display static variable values
public class StaticVariableTest1 {

	public static void main(String[] args) {
    
		// creating instances of StaticVariableTest2
		StaticVariableTest2 s1 = new StaticVariableTest2();
		StaticVariableTest2 s2 = new StaticVariableTest2();
		
		// modifying the value of static variable 'a' using 's1' object
		s1.a = 100;
		
		// displaying the value of 'a' from 's1' and 's2' objects
		System.out.println(s1.a);
		System.out.println(s2.a);
    
	}// end method 'main'

}// end class 'StaticVariableTest1'
