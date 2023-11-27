package com.test;

/* RunTimePolymorphismChild class is changing how the add() method works from its parent class to show how a method can be replaced when you create a new class that extends another */
public class RunTimePolymorphismChild extends RunTimePolymorphismParent {

	public static void main(String[] args) {
		
		RunTimePolymorphismChild runTimePolymorphismChild = new RunTimePolymorphismChild();
		runTimePolymorphismChild.test();
    
	}// end method 'main'
	
	void test() {
		add();
	}
	
	@Override
	void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
    
		System.out.println("Result : " + c);
    
	}// end method 'add'

}// end class 'RunTimePolymorphismChild'
