**Local Variable Type Inference for Object Data Types example**

This example is a class named `ObjectTypes` whose methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/ObjectTypes.java

Compile the example with the following command:

    $ javac -d target src/com/typeinference/*

And we run the example with the following command:

    $ java -cp target com/typeinference/ObjectTypes
    
Now, open the file `com/typeinference/ObjectTypes.java` and replace all object data types declaration with
the new keyword `var`, this change allows you to use Variable Type Inference.

    String id --> var id
    Book theLordOfTheRings --> var theLordOfTheRings

**Note:** The class `ObjectTypes.java` class uses objecs defined by the user `(Book, Store)` and by the JDK `(String, Integer, List )`  

Once you have replaced all object data types declaration, execute the commands for compile and run. Please compare the outputs, are they the same? 
Are the types an instance of some object?
