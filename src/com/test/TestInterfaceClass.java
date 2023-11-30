package com.test;

// class 'TestInterfaceClass' implementing 'TestInterface1' and 'TestInterface2' interfaces
public class TestInterfaceClass implements TestInterface1, TestInterface2 {

	public static void main(String[] args) {
		
		// instanciating 'TestInterfaceClass'
		TestInterfaceClass testInterfaceClass = new TestInterfaceClass();
		
		// calling the 'test' method from 'TestInterface1'
		testInterfaceClass.test();
    
	}// end method 'main'

	// implementing the 'test' method from 'TestInterface1' interface
	@Override
	public void test() {
		System.out.println("Test");
	}// end method 'test'

	// implementing the test1 method from TestInterface1
	@Override
	public void test1() {
		// empty body
	}// end method 'test1'

	// implementing the test2 method from TestInterface2
	@Override
	public void test2() {
	  // empty body
	}// end method 'test2'
  
}// end class 'TestInterfaceClass'
