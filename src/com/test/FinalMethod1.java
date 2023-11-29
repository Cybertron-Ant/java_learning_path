package com.test;

// class 'FinalMethod1' attempting to inherit from 'FinalMethod2'
public class FinalMethod1 extends FinalMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}// end method 'main'
	
	// ERROR: Cannot override the final method 'add' from FinalMethod2
	/*@Override
	void add() {
		System.out.println("Add");
	}*/

}// end class 'FinalMethod1'
