import java.util.Scanner;

/* takes two integer arrays as input and checks if they are equal by comparing their lengths and elements */
public class _10_ArrayEqualityChecker {
    // Function to check if two arrays are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // If arrays are of different lengths, they can't be equal
        if (array1.length != array2.length) {
            return false;
        }

        // Check each element of the arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // If any elements are different, arrays are not equal
            }
        }

        // If all elements are the same, arrays are equal
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the size of the arrays
        System.out.print("Enter the size of arrays: ");
        int size = scanner.nextInt();

        // Input for the first array
        System.out.println("Enter elements for the first array:");
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.println("Enter elements for the second array:");
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }

        // Check if arrays are equal
        boolean isEqual = areArraysEqual(arr1, arr2);

        // Display the result
        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

        scanner.close();
    }
}
