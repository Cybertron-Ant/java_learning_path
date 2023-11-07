// import Scanner class to support taking user input
import java.util.Scanner;

class MultiDimensionalArrayValuesLater {
  public static void main(String[] args) {

    /* create instance of 'Scanner" object/class */
    Scanner scanner = new Scanner(System.in);

    /* declare a multi-dimensional array */
    int[][] multiDimArray;

    // prompt user to enter the dimensions of the multi-dimensional array using integers
    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = scanner.nextInt();

    /* define the multi-dimensional array with the specified dimensions from user input */
    multiDimArray = new int[rows][columns];


    /* populate the array with user input using a 'for' loop */
    System.out.println("Enter values for the array:");

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Enter value for position [" + i + "][" + j + "]: ");
        multiDimArray[i][j] = scanner.nextInt();
      }// end FOR
    }// end FOR


    // print even numbers from the array using a 'for' loop
    System.out.println("Even numbers in the array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (multiDimArray[i][j] % 2 == 0) {
          System.out.println(multiDimArray[i][j]);
        }// end IF
      }// end FOR
    }// end FOR
    
  }// end method
}// end class
