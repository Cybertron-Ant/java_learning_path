package com.test;

// class 'HirarchicalParent1'
public class HirarchicalParent1 {
	static int n3 = 300;
	
	static void test() {
    
		HirarchicalChild2 hirarchicalChild2 = new HirarchicalChild2();
		System.out.println(hirarchicalChild2.n2);
		System.out.println(n3);
    
		HirarchicalChild1 hirarchicalChild1 = new HirarchicalChild1();
		System.out.println(hirarchicalChild1.n1);
    
	}// end method 'test'
}// end class 'HirarchicalParent1'
