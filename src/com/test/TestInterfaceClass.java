package com.test;

// class 'TestInterfaceClass' implementing 'TestInterface1' and 'TestInterface2'
public class TestInterfaceClass implements TestInterface1, TestInterface2 {

	public static void main(String[] args) {
		
		// instanciating 'TestInterfaceClass'
		TestInterfaceClass testInterfaceClass = new TestInterfaceClass();
		
		// calling the test method from 'TestInterface1'
		testInterfaceClass.test();
	}

	// implementing the 'test' method from 'TestInterface1'
	@Override
	public void test() {
		System.out.println("Test");
	}// end method '

	// implementing the 'test1' method from TestInterface1
	@Override
	public void test1() {
		
	}// end method 'test1'

	// implementing the 'test2' method from 'TestInterface2'
	@Override
	public void test2() {
		
	}// end method 'test2'

	// implementing the 'test3' method from 'TestInterface2'
	@Override
	public void test3() {
	
	}// end method 'test3'
  
}// end class 'TestInterfaceClass'
