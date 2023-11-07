class MultiDimensionalArray {
  public static void main(String[] args) {
    /* define 2D integer array named 'a' with 4 rows and 2 columns, and each element of the array holds an integer value.
    The outer array[4] has 4 elements, the rows, each inner array[2] has 2 elements, the columns.
    10  20
    20  30
    30  10
    200 10
    access individual elements in the array using indices, for eg, a[0][0] would be 10, a[1][1] would be 30 */
    int[4][2] a = { {10, 20}, {20, 30}, {30, 10}, {200, 10} }; // 8

    /* reassign the value at the second row(index 1) and the first column(index 0) to 2008
        10  20
        2008  30
        30  10
        200 10*/
    a[1][0] = 2008;


    /* iterate through the rows of the multi-dimensional array */
    for (int i = 0; i < a.length; i++) {
    /* iterate through the columns of the multi-dimensional array */
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }// end 2nd FOR
      System.out.println(); /* move to the next row of the multi-dimensional array */
   }// end 1st FOR
    
  }// end method
}// end class
