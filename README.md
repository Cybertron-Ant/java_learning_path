# Getters and Setters

are methods used to control access to the fields(variables) of a class.

Getters retrieve the value of a private field, allowing external classes to read its value.
Setters modify or update the value of a private field, enabling external classes to change its value.
These methods help enforce encapsulation by providing controlled access to the class's internal state. By making fields private and using getters and setters, you can manage how data is accessed and modified, ensuring proper validation, security, and maintenance of the class's properties.


# use 'import' statements to import classes in Eclipse IDE:
MyFirstProject folder -> src folder -> create new package(com.test) -> create new class(HelloWorld.java)[write some code] inside com.test package -> create new package(com.dog) inside 'src' folder -> create new class(Dog.java)['public' class](package com.dog;)[write some code] inside com.dog package -> type 'import com.dog.Dog;'('com.dog' is the package name, '.Dog' is the class name) in 'HelloWorld.java', use your imported class in your 'main' method of your HelloWorld.java program || if you are creating classes inside the same package that holds your 'HelloWorld.java' class, Eclipse IDE will handle the imports automatically, so you don't have to use/type 'import' statements
