import java.util.Scanner;

/* takes two numbers as input from the user and swaps two variable and prints the result */
public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Before swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Swap the values of the two variables
        double temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
