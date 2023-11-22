/* shows the value of the 'n1' variable for both instances, showing the differences between default initialization and initialization through a parameterized constructor
   you can't write a user defined constructor without first writing a default constructor(which can be left empty) */
// Class defining the main method
class ParameterUserDefinedConstructor {
    // a sacred number within our ninja clan
    static int number = 100;

    // our journey begins here, fellow ninjas!
    public static void main(String[] args) {
      
        // summoning a ninja named 'a1' with incredible jutsu strength of '10000'
        // parameterized constructor
        A a1 = new A(10000);

        // Bringing forth another ninja named 'a2' with no specialized jutsu
        // creating an instance of class A using the default constructor
        A a2 = new A();

        // witnessing the incredible jutsu strength of 'a1'
        // printing the value of 'n1' for object 'a1'
        System.out.println(a1.n1);

        // discovering the jutsu strength of 'a2' (which might be quite ordinary)
        // printing the value of 'n1' for object 'a2'
        System.out.println(a2.n1);
    }// end method 'main'
}// end class 'ParameterUserDefinedConstructor'

// The ninja class 'A' emerges from the shadows!
class A {
    // A ninja's basic jutsu level
    int n1 = 100;

    // a ninja is born without any particular jutsu. . .for now!
    // default constructor for class 'A'
    A() {
      
        // unveiling the hidden potential of 'n1' for our new ninja!
        System.out.println("Default Constructor Called. . .");
        System.out.println(n1);
    }

    // however, a ninja with a hidden past has surfaced!
    // parameterized constructor for class 'A' with 'newValue' parameter
    A(int six_paths_chakra) {
      
        // this ninja carries a mysterious legacy!
        // printing the value of 'n1' for the object created with this constructor
        System.out.println("User Defined Constructor Called.");

        // unveil what's behind 'n1' for this remarkable ninja!
        // printing the value of 'n1' for the object created with this constructor
        System.out.println(n1);

        // elevating the jutsu level of our ninja with the divine tree's six paths chakra
        // assigning the 'six_paths_chakra' parameter to 'n1' variable
        n1 = six_paths_chakra;
    }// end user defined constructor 'A'
}// end class 'A'
