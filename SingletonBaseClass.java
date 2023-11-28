
// base class 'SingletonBaseClass' implementing the Singleton design pattern.
public class SingletonBaseClass {
	
	// private constructor to prevent direct instantiation
	private SingletonBaseClass(){
		// displays a message indicating the default constructor is called
		System.out.println("Default Constructor Called.");
	}// end constructor 'SingletonBaseClass'
	
	// static instance of 'SingletonBaseClass' created upon class loading
	static SingletonBaseClass singletonBaseClass = new SingletonBaseClass();
	
	// method to retrieve the 'Singleton' instance
	static SingletonBaseClass getObject(){
		return singletonBaseClass;
	}// end getter method 'getObject'

}// end class 'SingletonBaseClass'
