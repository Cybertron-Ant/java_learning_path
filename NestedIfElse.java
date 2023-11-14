class NestedIfElse {
    public static void main(String[] args) {

      /* declare an integer variable 'marks' and assign it a value representing a student's marks, within the 'main' method */
      int marks = 99; // Change this value to test different scenarios

      /* an 'if-else' statement to determine the scholarship based on the marks obtained, the code to check the value of 'marks' */
      if (marks == 100) {
        System.out.println("100% Scholarship");
      } else if (marks > 80) {
        System.out.println("75% Scholarship");
      } else if (marks > 50) {
        System.out.println("50% Scholarship");
      } else {
        System.out.println("No Scholarship");
      }// end ELSE
    
    }// end method 'main'
}// end class NestedIfElse
