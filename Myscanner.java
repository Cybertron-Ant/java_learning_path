package com.test;

//import Scanner class
import java.util.Scanner;

public class MyScanner {
  public static void main(String[] args) {
    // create instance of 'Scanner' class
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter 1st Number: ");
    // nextInt() method of Scanner class reads in a string of digits (characters) and converts them into an int type
    int a = scan.nextInt();
    
    System.out.println("Enter 2nd Number: ");
    int b = scan.nextInt();
    int c = a + b;

    System.out.println("Result: " + c);
    
  }// end method
}// end class
