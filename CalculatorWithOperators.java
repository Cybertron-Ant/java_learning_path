import java.util.Scanner;

/* takes input and prints the sum, product, subtraction, quotient or remainder of two numbers using 5 math operators */
public class CalculatorWithOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, x, /, %): ");
        char operator = scanner.next().charAt(0);  // Read the first character of input.

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double result = 0.0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + result);
                break;
            case 'x':
            case 'X':
                result = firstNumber * secondNumber;
                System.out.println("Product: " + firstNumber + " x " + secondNumber + " = " + result);
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Quotient: " + firstNumber + " / " + secondNumber + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (secondNumber != 0) {
                    result = firstNumber % secondNumber;
                    System.out.println("Remainder: " + firstNumber + " % " + secondNumber + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, x, /, or %.");
                break;
        }
    }
}
