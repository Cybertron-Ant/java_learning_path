package com.test;

// class 'FinalVariableTest' demonstrating the usage of 'final' variables
public class FinalVariableTest {

	public static void main(String[] args) {
    
		// defining a final variable 'a' initialized to 10
		final int a = 10;
		
		// ERROR: Attempting to reassign a value to a 'final' variable 'a'
		// a = 100;
		
		// displaying the value of the final variable 'a'
		System.out.println(a);
    
	}// end method 'main'

}// end class 'FinalVariableTest'
