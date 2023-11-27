package com.test;

/* demonstrates method overriding, inheritance, and variable scoping using the super and this keywords 
   in the context of runtime polymorphism 
   shows how a child class can use its own and its parent's variables and methods, 
   demonstrating how method overriding and inheritance work */
// this class demonstrates method overriding, inheritance, and variable scoping in the context of runtime polymorphism
public class RunTimePolymorphismChild extends RunTimePolymorphismParent {
	
	// Instance variable initialized to 10
	int n1 = 10;

	// the 'main' method that creates an instance of 'RunTimePolymorphismChild' and calls the 'test' method
	public static void main(String[] args) {
		
		RunTimePolymorphismChild runTimePolymorphismChild = new RunTimePolymorphismChild();
		runTimePolymorphismChild.test();
	}
	
	// method 'test' to show variable scoping and access using 'this' and 'super'
	void test() {
    
		// local variable 'n1' with a value of 100
		int n1 = 100;
		System.out.println(n1); // print local 'n1'
		System.out.println(this.n1); // Print n1 from the current object (child class)
		System.out.println(super.n1); // Print n1 from the parent class
    
		this.add(); // call add method from the current object (child class)
		super.add(); // call add method from the parent class
	}
	
	// overridden method from the parent class to perform addition
	@Override
	void add() {
    
		int a = 10;
		int b = 20;
		int c = a + b;
    
		System.out.println("Result : " + c); // print the result of the addition
    
	}// end method 'add'

}// end class 'RunTimePolymorphismChild'
