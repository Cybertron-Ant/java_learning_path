package com.test;

// class 'HirarchicalChild1' inherits from 'HirarchicalParent1' class
public class HirarchicalChild1 extends HirarchicalParent1 {
	static int n1 = 100;

	public static void main(String[] args) {
    
		System.out.println(n1);
		System.out.println(n3);
    
		HirarchicalChild2 hirarchicalChild2 = new HirarchicalChild2();
		System.out.println(hirarchicalChild2.n2);
    
	}// end method 'main'
}// end class 'HirarchicalChild1'
