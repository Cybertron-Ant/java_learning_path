class SingleDimensionalArrayTwo {
  public static void main(String[] args) {

    // declare and define an array containing values in same line
    int[] myArray = {10, 20, 100, 5000, 50000, 1000, 207, 108, 108, 5002, 50008};


    // print all even numbers from array using a 'for' loop
    for (int num : myArray) {
      if (num % 2 == 0) {
        System.out.println(num);
      }// end IF
    }// end FOR
    
  }// end method
}// end class
