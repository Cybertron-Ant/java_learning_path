import java.util.Scanner;

/* accepts user input for the matrix size and its elements, then calculates the sum of both the primary and secondary diagonals of the matrix and prints the results. */
public class _11_DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for matrix size
        System.out.print("Enter the number of rows for the square matrix: ");
        int rows = scanner.nextInt();
        
        // Creating the matrix based on user input
        int[][] matrix = new int[rows][rows];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of diagonals
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            primaryDiagonalSum += matrix[i][i]; // Primary diagonal elements (top-left to bottom-right)
            secondaryDiagonalSum += matrix[i][rows - i - 1]; // Secondary diagonal elements (top-right to bottom-left)
        }

        // print the sums of diagonals
        System.out.println("Sum of the primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);

        scanner.close();
    }
}
