
/* creates an instance of class 'A', showcasing the execution flow of constructors and variable initialization within a class when an object is instantiated */
// class 'MyConstructor' defining the main method
class MyConstructor {
    // Static variable 'number' initialized with value 100
    static int number = 100;

    // 'main' method
    public static void main(String[] args) {
        // uncomment to print the initial value of 'number'
        //System.out.println(number);

        // changing the value of 'number' to 1000
        number = 1000;

        // uncomment to print the updated value of 'number'
        //System.out.println(number);

        // creating an instance of class A
        A a1 = new A();

        // creating another instance of class A (commented out)
        //A a2 = new A();
    }
}

// Class A definition
class A {
    // Constructor of class A
    A() {
        // printing "Constructor Called" when an instance of class A is created
        System.out.println("Constructor Called");

        // printing the value of variable 'n1' defined in class A
        System.out.println(n1);
    }

    // variable 'n1' in class A initialized with value 100
    int n1 = 100;
}
