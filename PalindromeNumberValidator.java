import java.util.Scanner;

// class 'PalindromeNumberValidator' checks whether a given number is a palindrome or not

public class PalindromeNumberValidator {

    /**
     * checks if a given number is a palindrome
     *
     * @param (number / int) The number to be checked for palindrome property
     * @return True if the number is a palindrome, False otherwise
     */
    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int originalNumber = number;

        // reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // check if the original number is equal to its reversed form
        return originalNumber == reversed;
    }

    /*
     method 'main' takes user input and checks if the entered number is a palindrome
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // check if the entered number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        scanner.close(); // close the scanner
    }
}
