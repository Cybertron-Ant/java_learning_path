// import class to take user input
import java.util.Scanner;


/* basic structure of the CalculatorAlgorithm class */
class CalculatorAlgorithm {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // main methods code goes here

       /* invoke 'addition' method */
      int additionResult = addition();
      System.out.println("Addition : " + additionResult);

      /* invoke 'subtraction' method inside 'main' method */
      int subtractionResult = subtraction();
      System.out.println("Subtraction : " + subtractionResult);
      
    }// end main

    /* defined addition method */
    static int addition() {
    System.out.println("Enter 1st Number for Addition : ");
    int a = scan.nextInt();
    System.out.println("Enter 2nd Number for Addition : ");
    int b = scan.nextInt();
    return a + b;
}// end addition method

    /* defined subtraction method */
    static int subtraction() {
      System.out.println("Enter 1st Number for Subtraction : ");
      int a = scan.nextInt();
      System.out.println("Enter 2nd Number for Subtraction : ");
      int b = scan.nextInt();
      return a - b;
    }//end subtraction method


    /* defined multiplication method */
    static int multiplication() {
      System.out.println("Enter 1st Number for Multiplication : ");
      int a = scan.nextInt();
      System.out.println("Enter 2nd Number for Multiplication : ");
      int b = scan.nextInt();
      return a * b;
   }// end multiplication method


    /* defined division method */
    static int division() {
      System.out.println("Enter the numerator for Division : ");
      int a = scan.nextInt();
      System.out.println("Enter the denominator for Division : ");
      int b = scan.nextInt();
      if (b == 0) {
        System.out.println("Error: Division by zero");
        return 0;
      }
      return a / b;
   }// end division method

}// end class
