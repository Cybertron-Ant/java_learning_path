class DefineArrayValuesLater {
  public static void main(String[] args) {

    // invoke a Scanner object
    Scanner scanner = new Scanner(System.in); 

    // declare an array
    int[] myArray;

    // prompt user to enter the number of elements
    System.out.print("Enter the number of elements: ");
    int numberOfElements = scanner.nextInt();

    // define the array with the specified number of elements based on user input value
    myArray = new int[numberOfElements];

    // populate the array with user input
    System.out.println("Enter " + numberOfElements + " integers:");

    // populate the array with user input using a 'for' loop
    for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
    }// end FOR


    // print even numbers using a 'for' loop
    System.out.println("Even numbers in the array:");
    for (int num : myArray) {
      if (num % 2 == 0) {
        System.out.println(num);
      }// end IF
    }// end FOR
    
  }// end method
}// end class
