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
    
  }// end method
}// end class
