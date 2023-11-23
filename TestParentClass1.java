package com.test;

// class 'TestParentClass1'(mid level) inherits from 'TestGrandParentClass1' class
public class TestParentClass1 extends TestGrandParentClass1 {
	static int n2 = 1000;

	static void multiply() {
    
		System.out.println("Multiplication");
		System.out.println(n3);
    
		TestChildClass1 t1 = new TestChildClass1();
		System.out.println(t1.n1);
    
	}// end method 'main'
}// end class 'TestParentClass1'
