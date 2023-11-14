class SwitchStatement {
    public static void main(String[] args) {

      /* initialize a variable 'marks' with a value of 100, within the 'main' method */
      int marks = 100;

      /* declare a 'switch' statement using the value of 'marks' */
      switch(marks){

        /* check if 'marks' variable is 100 and executes the code block if true */
        case 100 :
          System.out.println("Input is 100.");
          break;

        /* check if 'marks' variable is 200 and executes the code block if true */
        case 200 :
          System.out.println("Input is 200.");
          break;

        /* check if 'marks' variable is 300 and executes the code block if true */
        case 300 :
          System.out.println("Input is 300.");
          break;

        /* executes if none of the cases match */
        default :
          System.out.println("No cases match.");
          break;
              
      }// end SWITCH
      /* print "Thank you!!" regardless, after the switch statement */
      System.out.println("Thank you!!");

    }// end method 'main'
}// end class 'SwitchStatement'
