package com.test;

// class 'HirarchicalChild2' inherits from 'HirarchicalParent1' class
public class HirarchicalChild2 extends HirarchicalParent1 {
	static int n2 = 200;
	
	static void test() {
    
		System.out.println(n2);
		System.out.println(n3);
    
		HirarchicalChild1 hirarchicalChild1 = new HirarchicalChild1();
		System.out.println(hirarchicalChild1.n1);
    
	}// end method 'test'
}// end class 'HirarchicalChild2'
