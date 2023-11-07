class MultiDimensionalArraySameLine {
  public static void main(String[] args) {

    // declared and defined multi-dimensional array with values
    int[][] MyMultiDimArray = {
            {10, 20, 100},
            {5000, 50000, 1000},
            {207, 108, 108},
            {5002, 50008}
    };// end MyMultiDimArray


    // print even numbers from array using a 'for' loop
        System.out.println("Even numbers in the array:");
    for (int i = 0; i < MyMultiDimArray.length; i++) {
      for (int j = 0; j < MyMultiDimArray[i].length; j++) {
        if (MyMultiDimArray[i][j] % 2 == 0) {
          System.out.println(MyMultiDimArray[i][j]);
        }// end IF
      }// end FOR
    }// end FOR
    
  }// end method
}// end class
// question #3
