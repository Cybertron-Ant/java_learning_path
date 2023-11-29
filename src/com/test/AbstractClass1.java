package com.test;

// class 'AbstractClass1', failed attempting to inherit from AbstractClass2
public class AbstractClass1 extends AbstractClass2 {

	public static void main(String[] args) {

    // error: AbstractClass2 is abstract; cannot be instantiated
		 AbstractClass2 abstractClass2 = new AbstractClass2();
    
	}// end method 'main'

}// end class 'AbstractClass1'
