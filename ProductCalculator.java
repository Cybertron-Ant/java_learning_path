import java.util.Scanner;

// calculates the product of two numbers and prints the result as an integer
public class ProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
    }
}
