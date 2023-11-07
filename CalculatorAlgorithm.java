// import class to take user input
import java.util.Scanner;


/* basic structure of the CalculatorAlgorithm class */
class CalculatorAlgorithm {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // main methods code goes here
      
    }// end main

    /* defined addition method */
    static int addition() {
    System.out.println("Enter 1st Number for Addition : ");
    int a = scan.nextInt();
    System.out.println("Enter 2nd Number for Addition : ");
    int b = scan.nextInt();
    return a + b;
}// end addition method

}// end class
