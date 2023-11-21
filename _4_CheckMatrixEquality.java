class _4_CheckMatrixEquality {
    public static void main(String[] args) {

      // define two matrices to compare their equality, later
      int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
      int[][] matrix2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    
    }// end 'main' method

    // 'MatricesEquality' method that checks for equivalence of two matrices!
    public static boolean MatricesEquality(int[][] matrix1, int[][] matrix2) {

        // comparison of dimensions begins.
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false; // The dimensions speak a different dialect; they cannot be equal!
        }// end IF

        // journey through the elements
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {

                // comparing the elements of the matrices.
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false; // the elementss do not match! the matrices differ
                }// end IF
            }// end FOR
        }// end FOR

        // the matrices are equal!
        return true;
    }// end 'MatricesEquality' method
    
}// end class
