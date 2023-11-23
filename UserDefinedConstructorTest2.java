package com.test;


// user defined and default constructors template
public class UserDefinedConstructorTest2 {

  // default constructor | must be same name as class name
	UserDefinedConstructorTest2(){
		System.out.println(n2);
		System.out.println(n3);
	}

  // user defined constructor | must be same name as class name
	UserDefinedConstructorTest2(int newValue1){
		n2 = newValue1;
		System.out.println(n2);
		System.out.println(n3);
	}

  // user defined constructor | must be same name as class name
	UserDefinedConstructorTest2(int newValue1, int newValue2){
		n2 = newValue1;
		n3 = newValue2;
		System.out.println(n2);
		System.out.println(n3);
	}
	int n2 = 100;
	int n3 = 200;

}
