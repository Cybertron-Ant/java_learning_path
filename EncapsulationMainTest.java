// package com.test;

/*
  the 'EncapsulationMainTest' class serves as a testing ground for the 'EncapsulationClass'
  shows how the methods in the 'EncapsulationClass' work by creating an instance/object of it
 */
public class EncapsulationMainTest {

    /*
      the main method demonstrates the usage of the 'EncapsulationClass'
    
      parameter - 'args' command-line arguments (not used in this context)
     */
    public static void main(String[] args) {

        // instantiating an object of EncapsulationClass
        EncapsulationClass encapsulationClass = new EncapsulationClass();

        // Getting and printing the initial value of n1 using the getN1() method
        System.out.println(encapsulationClass.getN1());

        // setting a new value for n1 using the setN1() method
        encapsulationClass.setN1(2);

        // getting and printing the updated value of n1 using the getN1() method
        System.out.println(encapsulationClass.getN1());
      
    }// end method 'main'
}// end class 'EncapsulationMainTest'
