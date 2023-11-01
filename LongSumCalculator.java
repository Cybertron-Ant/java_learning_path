import java.util.Scanner;

/* prompts to enter two numbers as 'long', the operator '+', and then calculates and prints the sum using the 'long' data type */
public class LongSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (long): ");
        long firstNumber = scanner.nextLong();

        System.out.print("Enter the second number (long): ");
        long secondNumber = scanner.nextLong();

        System.out.print("Enter the operator (+): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            long sum = firstNumber + secondNumber;
            System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + sum);
        } else {
            System.out.println("Invalid operator. Please use '+' for addition.");
        }
    }
}
