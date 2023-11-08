/* create a new class called 'class ClassProperty' */
class ClassProperty {
  /* define the 'main' method within the 'ClassProperty' class, which is the entry point for the Java program */
      public static void main(String[] args) {
        /* declare an integer variable number and assign it the value 10000 */
        int number = 10000;

        /* print the value of the 'number' variable */
        System.out.println(number);

        /* create an instance of class 'A' and name it 'a1' */
        A a1 = new A();

        /* print value of the 'n1' instance variable/property of the 'a1' object/class */
        System.out.println(a1.n1);

        /* call the 'add' method */
        add();

        /* call the 'multiple' method of the 'a1' object */
        a1.multiple();
    } // end 'main'

/* define a static method called 'add' outside the 'main' method */
static void add(){

  /* print "Addition" */
  System.out.println("Addition");
}// end add

 /* define a class called 'A' */
class A {
  /* declare an instance variable n1 and assign it the value 100 */
  int n1 = 100;

  /* define a static method called 'multiple' within the 'A' class */
  static void multiple(){
    /* print "Multiplication" */
    System.out.println("Multiplication");
    }//  end multiple
}// end class A
