package vowel.testVowel;

/* takes a string input and counts the occurrences of each vowel (A, E, I, O, U) in a string, regardless of case */
public class WordVowelTracker {

    // method 'trackVowels' to count vowels in a string
    public static void trackVowels(String word) {
        // Convert the string to uppercase for case-insensitive comparison
        word = word.toUpperCase();

        // define an array to store the counts of each vowel (A, E, I, O, U)
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
                    // Do nothing for non-vowel characters
                    break;
            }
        }

        // print the counts of each vowel, each on a new line
        System.out.println("Vowel counts:");
        System.out.println("A - " + vowelCounts[0]);
        System.out.println("E - " + vowelCounts[1]);
        System.out.println("I - " + vowelCounts[2]);
        System.out.println("O - " + vowelCounts[3]);
        System.out.println("U - " + vowelCounts[4]);
    }

    // /public static void main(String[] args) {
    //     String word = "Antonio";
    //     trackVowels(word);
    // }
}

