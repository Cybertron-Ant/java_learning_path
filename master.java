class HelloWorld {
  /* outside 'main' declare private variable 'a' */
  private static int a;
  
  /* outside 'main', assign 'a' to 5 */
  a = 5;
  public static void main(String[] args) {

    /* if i print the value of 'a', an error will occur, because i can't declare then reassign a variable outside the 'main' method */
    System.out.println(a);
    
  }// end method
}// end class
