class _2_Array2D {
    public static void main(String[] args) {
        // Add code here

    // create the dimensions of the 2D array, will be used later
    int rows = 3, columns = 4, value = 1; // Rows, columns, and the magician's starting value

    // define the 2D array using the defined dimensions, 'rows' and 'columns' variables
    int[][] twoDArray = new int[rows][columns];

    // fill the 2D array with values using nested 'for' loops
    for (int i = 0; i < rows; i++) // journey through rows
    for (int j = 0; j < columns; j++) // Wandering through columns
        twoDArray[i][j] = value++; // Assigning values

    } // end method
} // end class
