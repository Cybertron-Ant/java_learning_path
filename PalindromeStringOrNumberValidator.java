import java.util.Scanner;

/* class 'PalindromeStringOrNumberValidator' to determine if a given input, string or a number, is a palindrome or not */
public class PalindromeStringOrNumberValidator {
    private String inputString;
    private boolean isPalindrome;

    // constructor for string input
    public PalindromeStringOrNumberValidator(String input) {
        determineInputType(input);
    }// end constructor 'PalindromeStringOrNumberValidator'

    // user-defined constructor 'determineInputType' to check input type
    private void determineInputType(String input) {
        if (isNumeric(input)) {
            int number = Integer.parseInt(input);
            this.isPalindrome = isPalindrome(number);
        } else {
            this.inputString = input;
            this.isPalindrome = isPalindrome(input);
        }// end ELSE
    }// end method 'determineInputType'

    // method 'isPalindrome'(overloading) for palindrome check with [String] input
    private boolean isPalindrome(String input) {
        String processedString = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = processedString.length() - 1;

        while (left < right) {
            if (processedString.charAt(left) != processedString.charAt(right)) {
                return false;
            }// END if
            left++;
            right--;
        }// end WHILE
        return true;
    }// end method 'isPalindrome'

    // method 'isPalindrome'(overloading) for palindrome check with [numeric] input
    private boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }// end WHILE

        return originalNumber == reversedNumber;
    }// end method 'isPalindrome'

    // method 'isNumeric' to check if the input is a number
    private boolean isNumeric(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }// end method 'isNumeric'

    // method 'displayResult' to print palindrome result
    public void displayResult() {
        if (isPalindrome) {
            if (inputString != null) {
                System.out.println("'" + inputString + "' is a palindrome.");
            } else {
                System.out.println("The number is a palindrome.");
            }// end ELSE
        } else {
            if (inputString != null) {
                System.out.println("'" + inputString + "' is not a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }// end ELSE
        }// end ELSE
    }// end method 'displayResult'

    public static void main(String[] args) {

        // take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string or number to check if it's a palindrome: ");
        String userInput = scanner.nextLine();

        // instantiate 'PalindromeStringOrNumberValidator' object, taking user input as argument
        PalindromeStringOrNumberValidator validator = new PalindromeStringOrNumberValidator(userInput);

        // use the 'displayResult' method to print the result
        validator.displayResult();

        scanner.close();
        
    }// end method 'main'
}// end class 'PalindromeStringOrNumberValidator'




