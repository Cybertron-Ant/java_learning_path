import java.util.Scanner;

/* takes operators +, -, x, /, % as input from the user and prints the sum, product, subtraction, quotient or remainder of two numbers */
public class FiveOperatorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input the operator (+, -, x, /, %): ");
        String operator = scanner.next();

        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        int result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                break;
            case "x":
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " x " + secondNumber + " = " + result);
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case "%":
                if (secondNumber != 0) {
                    result = firstNumber % secondNumber;
                    System.out.println(firstNumber + " % " + secondNumber + " = " + result);
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
