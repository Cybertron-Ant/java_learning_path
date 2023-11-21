class _5_AddMatrices {
    public static void main(String[] args) {

      // define two matrices, 'matrix' and 'matrix2' variables
      int[][] matrix1 = { { 3, 7, 2 }, { 9, 2, 4 }, { 6, 1, 5 } };
      int[][] matrix2 = { { 4, 5, 9 }, { 8, 3, 6 }, { 1, 2, 7 } };
        
    }// end 'main' method

    // define method 'addMatrices' to add two matrices
    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int columns = m1[0].length;
        int[][] result = new int[rows][columns];// new matrix

        // addition of corresponding elements in matrix 'result'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }// end FOR
        }// end FOR

        return result;
    }//end 'addMatrices' method

}// end class '_5_AddMatrices'
