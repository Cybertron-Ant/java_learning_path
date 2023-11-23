package com.test;

// 'TestGrandParentClass1' to be inherited by all classes
public class TestGrandParentClass1 {
	static int n3 = 10000;

	static void subtraction() {
		System.out.println("Subtraction");
		TestChildClass1 tc1 = new TestChildClass1();
		System.out.println(tc1.n1);
		TestParentClass1 tp1 = new TestParentClass1();
		System.out.println(tp1.n2);
	}// end method 'main'
}// end class 'TestGrandParentClass1'
