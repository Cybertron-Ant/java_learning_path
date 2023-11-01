import java.util.Scanner;

/* prompts to enter two numbers as 'float', the operator '+', and then calculates and prints the sum using the 'float' data type */
public class FloatSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (float): ");
        float firstNumber = scanner.nextFloat();

        System.out.print("Enter the second number (float): ");
        float secondNumber = scanner.nextFloat();

        System.out.print("Enter the operator (+): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            float sum = firstNumber + secondNumber;
            System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + sum);
        } else {
            System.out.println("Invalid operator. Please use '+' for addition.");
        }
    }
}
