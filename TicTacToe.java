// import Scanner to support user input
import java.util.Scanner;

class TicTacToe {
  public static void main(String[] args) {

    // instantiate Scanner as 'input' object to get user input
    Scanner input = new Scanner(System.in);

    // prompt user to enter a number
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    // close 'input' to prevent resource leak
    input.close();


    //  if a number is divisible by 3 and 5 then print "TicTac"
    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("TicTac");
    } // end IF
    else if (number % 3 == 0) {
            
      // elseif a number is divisible by 3 then print "Tic"
      System.out.println("Tic");
            
    } // end ELSEIF

  }// end method
}// end class
