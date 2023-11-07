//program#2
import java.util.Scanner;

/* takes user input to calculate the sum of two integer numbers inside the main method, but the variables are declared outside of the 'main' method. */
public class AdditionVariablesOutsideMain {
    public static int num1;
    public static int num2;
    public static int sum;

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Calculate the addition
        sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
