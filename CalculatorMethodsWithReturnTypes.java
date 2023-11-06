import java.util.Scanner;

/* calculator class takes user input and includes static methods for addition, subtraction, multiplication, and division */
class CalculatorMethodsWithReturnTypes {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        int additionResult = addition();
        System.out.println("Addition : " + additionResult);

        int subtractionResult = subtraction();
        System.out.println("Subtraction : " + subtractionResult);

        int multiplicationResult = multiplication();
        System.out.println("Multiplication : " + multiplicationResult);

        int divisionResult = division();
        System.out.println("Division : " + divisionResult);
    }

    static int addition() {
        System.out.println("Enter 1st Number for Addition : ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number for Addition : ");
        int b = scan.nextInt();
        return a + b;
    }

    static int subtraction() {
        System.out.println("Enter 1st Number for Subtraction : ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number for Subtraction : ");
        int b = scan.nextInt();
        return a - b;
    }

    static int multiplication() {
        System.out.println("Enter 1st Number for Multiplication : ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number for Multiplication : ");
        int b = scan.nextInt();
        return a * b;
    }

    static int division() {
        System.out.println("Enter the numerator for Division : ");
        int a = scan.nextInt();
        System.out.println("Enter the denominator for Division : ");
        int b = scan.nextInt();
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
}
