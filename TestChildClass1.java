package com.test;

// 'TestChildClass1' inherits from both 'TestParentClass1'(willfully), and 'TestGrandParentClass1'(automatically)
public class TestChildClass1 extends TestParentClass1 {
	static int n1 = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    // child
		System.out.println(n1);

    // parent
		System.out.println(n2);

    // grandparent
		System.out.println(n3);

    // child
		add();

    // parent
		multiply();

    // grandparent
		subtraction();

	}// end method 'main'
	
	static void add() {
		System.out.println("Addition");
    
	}// end method 'add'

}// end class 'TestChildClass1'
