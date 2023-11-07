class MultiDimensionalArraySameLine {
  public static void main(String[] args) {

    // declared and defined multi-dimensional array with values
    int[][] multiDimArray = {
            {10, 20, 100},
            {5000, 50000, 1000},
            {207, 108, 108},
            {5002, 50008}
    };// end multiDimArray


    // print even numbers from array using a 'for' loop
        System.out.println("Even numbers in the array:");
    for (int i = 0; i < multiDimArray.length; i++) {
      for (int j = 0; j < multiDimArray[i].length; j++) {
        if (multiDimArray[i][j] % 2 == 0) {
          System.out.println(multiDimArray[i][j]);
        }// end IF
      }// end FOR
    }// end FOR
    
  }// end method
}// end class
