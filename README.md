# java_learning_path
This repo hosts all that I've learned from books about Java

#to create a java app in Eclipse ide:

file -> new -> java project -> enter "MyFirstProject" inside (Project Name) field -> click (next) -> click (Finish)


#to create a java class in eclipse ide:
right-click (src) folder -> click (new) -> click (class) -> type "MyClass" inside (Name) field -> checkmark (public static void main(String[] args)) checkbox to create a (main) method -> click (Finish) -> edit 'MyClass.java' file -> type (System.out.println("Hello World")) -> right-click 'MyClass.java' file -> click (Run As) -> click (1 Java Application)


#set environment variables:
type "environ" in the (windows) search bar -> click (edit the system environment variables) -> click (environment variables) -> click (path) under 'system variables' -> click (edit) -> navigate to the (bin) folder inside the (java jdk 20) folder and copy the file path -> click (new) under 'environment variables' -> paste the copied path -> click (ok) -> under 'system variables' select 'Path' -> click (new) -> type "JAVA_HOME" inside 'variable name' field -> paste copied path inside 'variable value' field and remove the "/bin" -> click (ok) -> click (ok) -> click (ok) -> type "cmd" in windows search bar -> type 'java --version' in command prompt


# install java development kit 20:
download jdk-20 windows x64 installer -> create directories (Program Files -> Java -> jdk-20) -> install jdk in that file path


i watched this video about how to install java jdk-20 and set environment variables on youtube - https://youtube.com/watch?v=5pno0ddT_74


i downloaded java development kit 20 from this website - https://oracle.com/java/technologies/javase/jdk20-archive-downloads.htmlz


#set up java runtime environment (jre):
click the (window) tab -> click (preferences) -> click Java -> (installed jre) dropdown -> click (execution environment) -> under 'execution environments' click (javaSE-1.6) -> under 'compatible JREs' checkmark (jre) -> click (apply and close) -> select and right-click 'MyFirstProject' -> click (properties) -> click (Java Compiler) -> select 1.6 from the drop-down menu -> checkmark 'Enable project specific settings' -> uncheck 'Use compliance from execution environment 'JavaSE-20' on the 'Java Build Path' ' -> checkmark 'Use default compliance settings' -> click (Apply and Close) -> click the (file) tab -> click (Restart)


# use 'import' statements to import classes in Eclipse IDE:
MyFirstProject folder -> src folder -> create new package(com.test) -> create new class(HelloWorld.java)[write some code] inside com.test package -> create new package(com.dog) inside 'src' folder -> create new class(Dog.java)['public' class](package com.dog;)[write some code] inside com.dog package -> type 'import com.dog.Dog;'('com.dog' is the package name, '.Dog' is the class name) in 'HelloWorld.java', use your imported class in your 'main' method of your HelloWorld.java program || if you are creating classes inside the same package that holds your 'HelloWorld.java' class, Eclipse IDE will handle the imports automatically, so you don't have to use/type 'import' statements
