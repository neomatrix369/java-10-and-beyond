**Local Variable Type Inference for all Types example**

This example is a class named `Java10var` whose methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/Java10var.java

Compile the example with the following command:

    $ javac -d target src/com/typeinference/Java10var.java 

And we run the example with the following command:

    $ java -cp target com/typeinference/Java10var
    
Now, open the file `com/typeinference/Java10var.java` and replace all data types declaration with
the new keyword `var`, this change allows you to use Variable Type Inference.

    int id --> var id
    Integer myNumber --> var myNumber

Once you have replaced all primitive data types declaration, execute next command for compile the example:

    $ javac -d target src/com/typeinference/Java10var.java 

** Note:** The `Java10var` class has some variable declarations with Variable Type Inference that can not be used.
Open the file `com/typeinference/Java10var.java` identify the uses of Variable Type Inference that are not allowed and change them for the original declaration.

Once you example compiles, execute it with the following command: 

    $ java -cp target com/typeinference/Java10var
