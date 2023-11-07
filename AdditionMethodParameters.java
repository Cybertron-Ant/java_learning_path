//program #3
import java.util.Scanner;

/* the 'addNumbers' method is used to add two numbers, and it takes the two integers as parameters. The 'main' method calls this method to calculate the sum of the user-entered numbers */
public class AdditionMethod {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Calculate the addition by calling the addNumbers method
        int sum = addNumbers(num1, num2);

        // print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
