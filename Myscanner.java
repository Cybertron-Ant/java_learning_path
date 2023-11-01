package com.test;

//import Scanner class
import java.util.Scanner

public class MyScanner {
  public static void main(String[] args) {
    // create instance of 'Scanner' class
    Scanner scan = new Scanner(System.in);
    // nextInt() method of Scanner class reads in a string of digits (characters) and converts them into an int type
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = a + b;

    System.out.println(c);
    
  }// end method
}// end class
