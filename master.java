class VariablesOutsideMainMethod {
  /* outside 'main' declare private variable 'a' */
  private static int a = 5;
  
  /* outside 'main', assign 'a' to 5 */
  //a = 5;
  public static void main(String[] args) {

    /* if i print the value of 'a', an error will occur, because i can't declare then reassign a variable outside the 'main' method */
    /* if i define a variable on one line(private static int a = 5;) outside 'main', it will run successfully when referenced inside the 'main' method */
    System.out.println(a);
    
  }// end method
}// end class
