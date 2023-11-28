import java.util.Scanner;

/*
 class 'VowelTrackerConstructor' to count the occurrences of each vowel in a string, regardless of case
 */
public class VowelTrackerConstructor {
    private int[] vowelCounts; // array to store the counts of each vowel (A, E, I, O, U)

    /*
      constructor that initializes the 'vowelCounts' array, empty, with a size of 5
     */
    public VowelTrackerConstructor() {
        vowelCounts = new int[5]; // index 0: A, 1: E, 2: I, 3: O, 4: U
    }// end method 'VowelTrackerConstructor'

    /*
      Method to count vowels in a string and update the counts.
      parameter - 'word' the input string
     */
    public void trackVowels(String word) {
        // convert the string to uppercase for case-insensitive comparison
        word = word.toUpperCase();

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

        // print the counts of each vowel
        System.out.println("Vowel counts:");
        System.out.println("A - " + vowelCounts[0]);
        System.out.println("E - " + vowelCounts[1]);
        System.out.println("I - " + vowelCounts[2]);
        System.out.println("O - " + vowelCounts[3]);
        System.out.println("U - " + vowelCounts[4]);
    }// end method 'trackVowels'


    public static void main(String[] args) {
        // instantiate a 'VowelTrackerConstructor' object
        VowelTrackerConstructor vowelTracker = new VowelTrackerConstructor();

        // instantiate a 'Scanner' object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        // read the input word from the user
        String word = scanner.nextLine();

        // call the 'trackVowels' method with the user-input stored in the 'word' variable
        vowelTracker.trackVowels(word);

        // close the scanner
        scanner.close();
        
    }// end method 'main'
}// end class 'VowelTrackerConstructor'
