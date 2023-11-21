import java.util.Scanner;

/*  allows users to input a square matrix and then calculates its determinant */
public class _7_DeterminantFinder {

    // 'findDeterminant' method to find the matrix's determinant
    public static int findDeterminant(int[][] matrix) {
        int size = matrix.length;

        // ensuring the matrix is square
        if (size != matrix[0].length) {
            throw new IllegalArgumentException("I'm afraid this dark magic only works on square matrices!");
        }

        // for a 1x1 matrix, the determinant is simply the single element
        if (size == 1) {
            return matrix[0][0];
        }

        // initialize determinant to 0
        int determinant = 0;

        // 'for' loop to travel through the matrix and find the determinant
        for (int i = 0; i < size; i++) {
            int[][] subMatrix = new int[size - 1][size - 1];

            // creating the sub-matrix
            for (int j = 1; j < size; j++) {
                for (int k = 0, col = 0; k < size; k++) {
                    if (k == i) {
                        continue; // skip the column for the sub-matrix
                    }
                    subMatrix[j - 1][col++] = matrix[j][k];
                }
            }

            // recursive invocation for the sub-matrix
            determinant += Math.pow(-1, i) * matrix[0][i] * findDeterminant(subMatrix);
        }

        // Return the mesmerizing determinant
        return determinant;
    }

    //
    public static void main(String[] args) {
        // invoke 'Scanner' object to support user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // initialize a matrix with the provided size and fills it with the user's entered elements.
        int[][] userMatrix = new int[size][size];

        System.out.println("Enter the elements of the square matrix:");

        // capturing the elements of the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // print the determinant's value
        int determinant = findDeterminant(userMatrix);
        System.out.println("The determinant is: " + determinant + " - a number beyond ordinary perception!");

        scanner.close(); // closing the scanner
    }
}
