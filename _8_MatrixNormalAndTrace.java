import java.util.Scanner; // Importing the Scanner utility for input reading

/* performs operations on a square matrix provided by the user and calculates two properties: the "normal" (also known as the Frobenius norm) and the "trace" of the matrix.
The program starts by asking the user to input the size of the square matrix, defining how many rows and columns it will have.
It then prompts the user to input the elements of the square matrix row by row.
After performing the calculations, the program displays the calculated normal and trace of the provided matrix.*/
public class _8_MatrixNormalAndTrace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initializing the scanner object

        System.out.print("Enter the size of the square matrix: "); // Prompting user for matrix size
        int n = scanner.nextInt(); // Reading the size provided by the user

        int[][] matrix = new int[n][n]; // Creating an array to hold the square matrix

        System.out.println("Enter the elements of the square matrix:"); // Prompting for matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt(); // Reading and storing the matrix elements
            }
        }

        int norm = calculateNorm(matrix); // Calculating the norm of the matrix
        int trace = calculateTrace(matrix); // Calculating the trace of the matrix

        // Displaying the results
        System.out.println("The norm of the matrix is: " + norm); // Showing the calculated norm
        System.out.println("The trace of the matrix is: " + trace); // Displaying the calculated trace

        scanner.close(); // Closing the scanner object to release resources
    }

    // Method to calculate the norm of the matrix
    public static int calculateNorm(int[][] matrix) {
        int norm = 0; // Initializing the variable to store the norm

        // Computing the sum of squares of all elements
        for (int[] row : matrix) {
            for (int element : row) {
                norm += element * element; // Squaring each element and adding to the norm
            }
        }

        // Calculating the square root of the sum of squares
        norm = (int) Math.sqrt(norm); // Finding the square root of the sum

        return norm; // Returning the calculated norm
    }

    // Method to calculate the trace of the matrix
    public static int calculateTrace(int[][] matrix) {
        int trace = 0; // Initializing the variable to store the trace

        // Computing the sum of diagonal elements
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i]; // Adding each diagonal element to the trace
        }

        return trace; // Returning the calculated trace
    }
}
