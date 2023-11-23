package com.test;

// inherits from 'TestParentClass1' class
public class TestChildClass1 extends TestParentClass1 {
	static int n1 = 100;
	public static void main(String[] args) {
		
		System.out.println(n1);
		System.out.println(n2);
		add();
		multiply();

	}// end method 'main'
	
	static void add() {
		System.out.println("Addition");
	}// end method 'add'

}// end class 'TestChildClass1'
