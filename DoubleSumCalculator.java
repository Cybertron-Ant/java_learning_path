import java.util.Scanner;

/* prompts to enter two numbers as 'double', the operator '+', and then calculates and prints the sum using the 'double' data type */
public class DoubleSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (double): ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number (double): ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the operator (+): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            double sum = firstNumber + secondNumber;
            System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + sum);
        } else {
            System.out.println("Invalid operator. Please use '+' for addition.");
        }
    }
}
