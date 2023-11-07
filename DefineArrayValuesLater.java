class DefineArrayValuesLater {
  public static void main(String[] args) {

    // declare an array
    int[] myArray;

    // prompt user to enter the number of elements
    System.out.print("Enter the number of elements: ");
    int numberOfElements = scanner.nextInt();

    // define the array with the specified number of elements based on user input value
    myArray = new int[numberOfElements];

    // populate the array with user input
    System.out.println("Enter " + numberOfElements + " integers:");
    
  }// end method
}// end class
