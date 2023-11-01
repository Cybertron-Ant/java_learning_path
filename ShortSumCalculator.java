import java.util.Scanner;

/* prompts to enter two numbers as 'short', the operator '+', and then calculates and prints the sum using the 'short' data type */
public class ShortSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (short): ");
        short firstNumber = scanner.nextShort();

        System.out.print("Enter the second number (short): ");
        short secondNumber = scanner.nextShort();

        System.out.print("Enter the operator (+): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            short sum = (short) (firstNumber + secondNumber);
            System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + sum);
        } else {
            System.out.println("Invalid operator. Please use '+' for addition.");
        }
    }
}
