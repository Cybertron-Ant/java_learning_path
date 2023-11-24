import java.util.Scanner;

/* class 'WordVowelTracker' to count the occurrences of each vowel in a string, regardless of case */
public class WordVowelTracker {

    /* parameter - 'word', the input string */
    public static void trackVowels(String word) {
        // Convert the string to uppercase for case-insensitive comparison
        word = word.toUpperCase();

        // declare an empty array, with a size of 5, to store the counts of each vowel (A, E, I, O, U)
        int[] vowelCounts = new int[5]; // index 0: A, 1: E, 2: I, 3: O, 4: U

        // journey through each character in the string
        for (int i = 0; i < word.length(); i++) {

            char character = word.charAt(i);

            // check if the character is a vowel (A, E, I, O, U)
            switch (character) {
                case 'A':
                    vowelCounts[0]++; // increment count for 'A'
                    break;
                case 'E':
                    vowelCounts[1]++; // increment count for 'E'
                    break;
                case 'I':
                    vowelCounts[2]++; // increment count for 'I'
                    break;
                case 'O':
                    vowelCounts[3]++; // increment count for 'O'
                    break;
                case 'U':
                    vowelCounts[4]++; // increment count for 'U'
                    break;
                default:
                    // do nothing for non-vowel characters
                    break;
            }// end SWITCH
        }// end FOR

        // print the counts of each vowel, each on a new lineString[] vowels = {"A", "E", "I", "O", "U"};
        for (int i = 0; i < vowelCounts.length; i++) {
          System.out.println(vowels[i] + " - " + vowelCounts[i]);
        }// end FOR
    }// end method 'trackVowels'

    public static void main(String[] args) {
        // instanciate a 'Scanner' object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        // read the input word from the user
        String word = scanner.nextLine();

        // call the 'trackVowels' method with the user-input stored in 'word' variable
        trackVowels(word);

        // close the scanner
        scanner.close();

    }// end method 'main'
}// end class 'WordVowelTracker'
