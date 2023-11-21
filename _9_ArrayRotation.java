import java.util.Scanner;

/* prompts the user to input the number of elements in the array, the array elements themselves, and the number of positions to rotate. Then, it performs a left rotation based on the user's input and displays the resulting array before and after rotation.
*/
public class _9_ArrayRotation {

    // Function to perform a left rotation of an array 'arr' to the left by 'd' positions
    public static void leftRotate(int[] arr, int d) {
        int length = arr.length;

        // Adjust rotation if it's greater than array length
        d = d % length;

        // Create a temporary array to store elements to be rotated
        int[] temp = new int[d];

        // Store the elements to be rotated in a temporary array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements of the array to the left
        for (int i = d; i < length; i++) {
            arr[i - d] = arr[i];
        }

        // Copy elements from the temporary array back to the original array
        for (int i = 0; i < d; i++) {
            arr[length - d + i] = temp[i];
        }
    }

    // Function to print the elements of an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array from user input
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Get the elements of the array from user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the number of positions to rotate from user input
        System.out.print("Enter the number of positions to rotate left: ");
        int rotation = scanner.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        // Perform left rotation by 'rotation' positions
        leftRotate(arr, rotation);

        System.out.println("Array after rotating left by " + rotation + " positions:");
        printArray(arr);

        scanner.close();
    }
}
