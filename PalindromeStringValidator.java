import java.util.Scanner;

/* the objective of the program is to take a user-provided string, process it to remove spaces and ignore case, and determine whether the resulting string is a palindrome or not
 */
public class PalindromeStringValidator {

    // method 'main' - entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.nextLine();

        // remove spaces and convert to lowercase for uniform comparison
        String processedString = inputString.replaceAll("\\s+", "").toLowerCase();

        // check if the processed string is a palindrome
        if (isPalindrome(processedString)) {
            System.out.println("'" + inputString + "' is a palindrome.");
        } else {
            System.out.println("'" + inputString + "' is not a palindrome.");
        }

        scanner.close(); // close the scanner to prevent resource leak
    }

    // method 'isPalindrome' to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // loop until the pointers meet in the middle
        while (left < right) {
            // compare characters from both ends of the string
            if (str.charAt(left) != str.charAt(right)) {
                return false; // if characters don't match, it's not a palindrome
            }
            left++; // move the left pointer towards the right
            right--; // move the right pointer towards the left
        }
        return true; // if the loop completes without returning false, it's a palindrome
    }
}
