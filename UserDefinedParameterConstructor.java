/* showing differences between default initialization and initialization through a parameterized constructor(two parameter)
   you can't write a user defined constructor without first writing a default constructor(which can be left empty)  */
class UserDefinedParameterConstructor {
    // a sacred number within our ninja clan
    static int number = 100;

    // our ninja adventure begins here!
    public static void main(String[] args) {
      
        // summoning a ninja named 'a1' with default chakra levels
        // Creating an instance 'a1' of class A using default constructor
        A a1 = new A();

        // invoking a ninja named 'a2' with boosted chakra level of '1000'
        // creating an instance 'a2' of class A using a single-parameter constructor
        A a2 = new A(1000);

        // calling forth a ninja named 'a3' with dual chakra power: '10' and '20'
        // Creating an instance 'a3' of class A using a two-parameter constructor
        A a3 = new A(10, 20);

        // displaying the chakra levels of 'a1'
        // printing the value of 'n1' and 'n2' for object(class instance) 'a1'
        System.out.println(a1.n1);
        System.out.println(a1.n2);

        // revealing the chakra levels of 'a2'
        // printing the value of 'n1' and 'n2' for object(class instance) 'a2'
        System.out.println(a2.n1);
        System.out.println(a2.n2);

        // unveiling the chakra levels of 'a3'
        // printing the value of 'n1' and 'n2' for object(class instance) 'a3'
        System.out.println(a3.n1);
        System.out.println(a3.n2);
    }
}

// the ninja class 'A' emerges from the shadows
class A {
    // default chakra levels for a new ninja
    int n1 = 100;
    int n2 = 200;

    // a ninja emerges with the default chakra
    // default constructor for class 'A'
    A() {
        // see the chakra level of the new ninja!
        // indicates the default constructor is called
        System.out.println("Default Constructor Called. . .");
    }

    // a powerful ninja surfaces with enhanced chakra levels!
    // constructor for class 'A' with a single parameter
    A(int newValue) {
      
        // this ninja harnesses special jutsu to boost chakra
        // indicates the single-parameter constructor being called
        System.out.println("User Defined 1 Constructor Called.");

        // enhancing the chakra of our special ninja
        // assigns the value 'newValue' to 'n1'
        n1 = newValue;
    }// end default constructor 'A'

    // a legendary ninja arises with dual chakra powers
    // constructor for class 'A' with two parameters
    A(int newValue1, int newValue2) {
      
        // this ninja wields dual chakra powers with unique jutsu
        // indicates the two-parameter constructor being called
        System.out.println("User Defined 2 Constructor Called.");

        // empowering the ninja with two distinct chakra levels
        // assigns 'newValue1' to 'n1' and 'newValue2' to 'n2' variables(class properties)
        n1 = newValue1;
        n2 = newValue2;
      
    }// end user defined constructor 'A'
}// end class 'A'
