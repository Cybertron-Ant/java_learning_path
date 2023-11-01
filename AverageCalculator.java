import java.util.Scanner;

/* takes three numbers as input from the user and prints the average of those numbers */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of the three numbers is: " + average);
    }
}
