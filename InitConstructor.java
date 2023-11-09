class InitConstructor {
  public static void main(String[] args) {

    /* create a new instance of the 'Person' class and pass in a name as an argument/parameter */
    Person person1 = new Person("John");

    /* print the person's name using the getName() method of the 'person1' class instance of the 'Person' class */
    System.out.println("Person's name is: " + person1.getName());
    
  }// end method
}// end class InitConstructor

/* declare 'Person' class */
class Person {
  /* define a private instance variable/property for the person's name */
  private String name;

  /* define a 'constructor' for the 'Person' class that takes a 'String' parameter for the person's name */
  public Person(String name) {
    /* inside the constructor, set the value of the instance variable 'name' to the value of the parameter passed in */
    this.name = name;
 }// end CONSTRUCTOR 'Person'

  /* define a getter method for the 'name' instance variable/property that's inside the constructor */
  public String getName() {
    return name;
 }// end method 'getName'

}// end class Person
