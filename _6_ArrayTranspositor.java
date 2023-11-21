/* 'ArrayTranspositor' class flip the rows and columns of a 2D array, transposing its elements, and then prints the transposed array */
public class _6_ArrayTranspositor {

    // define 'transposeArray' method that can swap an array's elements around
    public int[][] transposeArray(int[][] array) {
        int rows = array.length; // 'rows' variable keeps track of the array's length
        int columns = array[0].length; // 'columns' variable holds the length of the first part

        // defined 'transposedArray' is like a treasure chest for the changed array
        int[][] transposedArray = new int[columns][rows];

        // 'for' loops make the elements swap places
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedArray[j][i] = array[i][j]; // See? It's like swapping candies in a jar!
            }//end FOR
        }// end FOR

        return transposedArray; // the changed array is saved from this method
    }

    public static void main(String[] args) {
        // define 'magicalArray' with some values
        int[][] magicalArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Transpositor transpositor = new Transpositor(); // the magical Transpositor is here!

        // the array changes its shape through the Transpositor's magic!
        int[][] transposedArray = transpositor.transposeArray(magicalArray);

        // Observe, the transformed array for everyone to see!
        System.out.println("The magical transformed array is:");

        // unraveling the array's secrets, element by element
        for (int[] row : transposedArray) {
            for (int element : row) {
                System.out.print(element + " "); // Look! The array's elements are showing themselves
            }// end FOR
            System.out.println(); // A little break to make each part look special
        }// end FOR
      
    }// end 'main' method
}// end class 'ArrayTranspositor'
