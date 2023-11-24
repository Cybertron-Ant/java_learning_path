package com.test;

// polymorphism - method overloading
public class CompileTimePolymorphism {

	public static void main(String[] args) {
	
		add(10, 20);// int type
		add(10, 20, 30);// int type
		add(10.00F, 20.00F);// float type
		add(10.00F, 20.00F, 30.00F);// float type

	}// end method 'main'
	
	static void add(int a, int b) {
		System.out.println(a + b);
	}// end method 'add'
	
	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}// end method 'add'
	
	static void add(float a, float b) {
		System.out.println(a + b);
	}// end method 'add'
	
	static void add(float a, float b, float c) {
		System.out.println(a + b + c);
	}// end method 'add'

}// end class 'CompileTimePolymorphism'
