
/* 'SingletonMainClass' is intended to showcase and test the Singleton pattern's behavior by obtaining multiple instances 
   of SingletonBaseClass and demonstrating their singularity, allowing only one instance to be created and reused */
/* the 'SingletonMainClass' is used to create and retrieve instances from the 'SingletonBaseClass' to demonstrate 
  that only one instance of 'SingletonBaseClass' is created throughout the program execution */
// class 'SingletonMainClass' containing the 'main' method to demonstrate Singleton pattern usage
public class SingletonMainClass {

	public static void main(String[] args) {
		// retrieving Singleton instances using 'getObject' method of 'SingletonBaseClass'

		// obtaining the first 'SingletonBaseClass' instance
		SingletonBaseClass singletonBaseClass1 = SingletonBaseClass.getObject();

		// obtaining the second 'SingletonBaseClass' instance
		SingletonBaseClass singletonBaseClass2 = SingletonBaseClass.getObject();

		// obtaining the third 'SingletonBaseClass' instance
		SingletonBaseClass singletonBaseClass3 = SingletonBaseClass.getObject();

		// obtaining the fourth 'SingletonBaseClass' instance
		SingletonBaseClass singletonBaseClass4 = SingletonBaseClass.getObject();

		// obtaining the fifth 'SingletonBaseClass' instance
		SingletonBaseClass singletonBaseClass5 = SingletonBaseClass.getObject();
	}// end method 'main'

}// end class 'SingletonMainClass'
