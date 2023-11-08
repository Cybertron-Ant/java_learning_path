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
      
    }// end 'main'
}// end class ObjectCreation

/* define the 'A' class, with an instance variable 'n1' initialized to 100 */
class A {
    int n1 = 100;
}// end class 'A'
