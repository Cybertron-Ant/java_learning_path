import java.util.Scanner;

/* find the factorial of a given number using a user-defined constructor and a recursive method 'calculateFactorial' */
class CalculateMyFactorial {
    private int number; // Number for which factorial will be calculated

    // constructor to initialize a number
    public CalculateMyFactorial(int num) {
        number = num;
    }

    /* method 'calculateFactorial' uses recursion to find the factorial of a given number
       parameter 'n' - the number for which factorial needs to be calculated
       return - The factorial of the given number
    */
    public long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // recursive call method to calculate the factorial
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter number to find its factorial: ");
        int userInput = scanner.nextInt();

        // create an instance of 'CalculateMyFactorial' class
        CalculateMyFactorial factorialCalculator = new CalculateMyFactorial(userInput);

        // calculate factorial taking user input as an argument
        long factorial = factorialCalculator.calculateFactorial(userInput);

        // print the result of the factorial
        System.out.println("Factorial of " + userInput + " is: " + factorial);

        scanner.close();
      
    }// end method 'main'
}// end class 'CalculateMyFactorial'
