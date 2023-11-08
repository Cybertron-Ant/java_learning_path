/* define the 'ObjectCreation' class */
class ObjectCreation {
    /* define the 'main' method */
    public static void main(String[] args) {
      /* declare an integer variable named 'number' and assign it the value 10000 */
      int number = 10000;
      
      /* print the value of the 'number' variable  */
      System.out.println(number);

      /* change the value of 'number' to 1000 and then print it again  */
      number = 1000;
      System.out.println(number);

      /* create two instances of the 'A' class named 'a1' and 'a2' */
      A a1 = new A();
      A a2 = new A();

      /* print the value of the 'n1' instance variable for both 'a1' and 'a2'. Initially, both instances have the same value of 'n1', which is 100 */
      System.out.println(a1.n1);
      System.out.println(a2.n1);

      /* change the value of the 'n1' instance variable for 'a1' to 10 and then print it again. This change only affects the 'n1' variable of 'a1' and not 'a2' */
      a1.n1 = 10;
      System.out.println(a1.n1);

      /* print the value of the 'n1' instance variable for 'a2'. This value remains 100 as it was not modified */
      System.out.println(a2.n1);
      
    }// end 'main'
}// end class ObjectCreation

/* define the 'A' class, with an instance variable 'n1' initialized to 100 */
class A {
    int n1 = 100;
}// end class 'A'
