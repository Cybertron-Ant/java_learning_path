/*
  shows the usage of 'this' keyword to differentiate between class variables 
  and method parameters with the same name. 
  it also showcases how 'this' can be used to call another method within the same class.
 */
public class ThisKeywordExample {
    private int number;

    /*
      constructor of the class 'ThisKeywordExample'
      initializes the 'number' variable with the provided value.
     
      parameter - 'number' | an integer value to initialize the 'number' variable.
     */
    public ThisKeywordExample(int number) {
        // Using 'this' to differentiate between the class variable and the parameter with the same name.
        this.number = number;
    }// end constructor 'ThisKeywordExample'

    /* a method to display the value of the 'number' variable. */
    public void displayNumber() {
        System.out.println("The value of number is: " + this.number);
    }// end method 'displayNumber'

    /*
      a method that demonstrates the use of 'this' in a method call.
      this method calls the 'displayNumber()' method to show the value of 'number'.
     */
    public void showNumberUsingThis() {
        System.out.println("Using 'this' to call displayNumber() method:");
        this.displayNumber(); // Using 'this' to call another method within the same class.
    }// end method 'showNumberUsingThis'

    /*
      'main' method - entry point of the program.
       parameter - 'args' Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ThisKeywordExample example = new ThisKeywordExample(10);
        example.showNumberUsingThis();
      
    }// end method 'main'
  
}// end class 'ThisKeywordExample'
