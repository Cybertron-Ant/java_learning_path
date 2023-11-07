//program#4
import java.util.Scanner;

/*  the 'addNumbers' method doesn't take any parameters. The 'main' method sets the values of 'num1' and 'num2' based on user input and then calls the 'addNumbers' method to calculate the sum. */
public class Addition {
    public static int num1;
    public static int num2;

    public static void main(String[] args) {
        // initialize 'Scanner' object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Calculate the addition by calling the addNumbers method
        int sum = addNumbers();

        // print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method to add two numbers without parameters
    public static int addNumbers() {
        return num1 + num2;
    }
}
