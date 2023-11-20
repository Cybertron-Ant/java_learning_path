class _1_LargestValue {
  public static void main(String[] args) {

    // create an array filled with various numbers
    int[] universeOfNumbers = {33, 81, 107, 100, 47, 59, 58};

    // select the first element from the array and consider it as the initial "chosen one"/entry point
    int chosenOne = universeOfNumbers[0];


        // travel through the array to find the largest element
        for (int i = 1; i < universeOfNumbers.length; i++) {
            // if this element is greater than the chosen one
            if (universeOfNumbers[i] > chosenOne) {
                chosenOne = universeOfNumbers[i]; // Update the chosen one if it is surpassed
            }// end IF
        }// end FOR

  }// end method
}// end class
