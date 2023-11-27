// package com.test;

/**
 * The EncapsulationClass demonstrates encapsulation by encapsulating the private field n1
 * and providing getter and setter methods to access and modify its value.
 */
public class EncapsulationClass {

    // Private integer field initialized to 10
    private int n1 = 10;

    /**
     * Getter method to retrieve the value of n1.
     *
     * @return the current value of n1
     */
    public int getN1() {
        System.out.println("Someone Viewed N1 data");
        return n1;
    }

    /**
     * Setter method to set the value of n1.
     *
     * @param n1 the new value to set for n1
     */
    public void setN1(int n1) {
        System.out.println("Someone changed N1 data");
        this.n1 = n1;
    }
}
