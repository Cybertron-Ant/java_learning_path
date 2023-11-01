import java.util.Scanner;

/* prompts to enter two numbers as 'int', the operator '+', and then calculates and prints the sum using the 'int' data type */
public class IntSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (int): ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number (int): ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the operator (+): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            int sum = firstNumber + secondNumber;
            System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + sum);
        } else {
            System.out.println("Invalid operator. Please use '+' for addition.");
        }
    }
}
