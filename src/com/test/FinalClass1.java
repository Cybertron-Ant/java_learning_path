package com.test;

// class 'FinalClass1' failed attempting to instantiate FinalClass2, which is declared as final
public class FinalClass1 {

	public static void main(String[] args) {
		// ERROR: Cannot instantiate a final class 'FinalClass2'
		FinalClass2 finalClass2 = new FinalClass2();
    
	}// end method 'main'

}// end class 'FinalClass1'
