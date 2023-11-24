package com.test;

// grandparent class
public class GrandParent1 {
  
	static int number3 = 300;
  
	static void multiply() {
    
		Child1 child1 = new Child1();
    
		System.out.println(child1.number1);
		System.out.println(child1.number2);
    
	}// end method 'multiply'
}// end class 'GrandParent1'
