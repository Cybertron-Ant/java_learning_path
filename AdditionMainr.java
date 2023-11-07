import java.util.Scanner;

/* takes user input for two integer numbers and calculates their addition inside the 'main' method */
public class AdditionMain {
    public static void main(String[] args) {
        // initialize Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the addition
        int sum = num1 + num2;

        // print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the Scanner
        scanner.close();
    }
}
