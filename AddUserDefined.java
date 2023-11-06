import java.util.Scanner;

/* gets input from the user, prompt the user to enter the first integer and the second integer, then, 
calculates the sum using the 'sum' method from the user defined class 'AddTwoNumbers' and prints the result || 
creates an object called 'adder' from the 'Add' class inside the 'main' method, 
and then uses the instance method 'sum' to calculate the sum of two integers provided by the user. */
    public class Add {
      public int sum(int num1, int num2) {
        return num1 + num2;
      }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Create an instance of the Add class
        Add adder = new Add();

        // Calculate the sum using the instance method
        int result = adder.sum(num1, num2);

        // Display the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
