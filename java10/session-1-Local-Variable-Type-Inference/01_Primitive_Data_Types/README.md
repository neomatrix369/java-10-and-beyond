**Local Variable Type Inference for Primitive Data Types example**

This first example is a class named `PrimitiveTypes` whose methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/PrimitiveTypes.java

Compile the example with the following command:

    $ javac -d target src/com/typeinference/PrimitiveTypes.java 

And we run the example with the following command:

    $ java -cp target com/typeinference/PrimitiveTypes
    
Now, open the file `com/typeinference/PrimitiveTypes.java` and replace all primitive data types declaration with
the new keyword `var`, this change allows you to use Variable Type Inference.

    int id --> var id

Once you have replaced all primitive data types declaration, execute the commands for compile and run. Please compare the outputs, are they the same? 
