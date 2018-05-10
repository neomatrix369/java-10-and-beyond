**Local Variable Type Inference for Arrays Data Types example**

This example is a class named `ArraysTypes` whose methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/ArraysTypes.java

Compile the example with the following command:

    $ javac -d target src/com/typeinference/*

And we run the example with the following command:

    $ java -cp target com/typeinference/ArraysTypes
    
Now, open the file `com/typeinference/ArraysTypes.java` and replace all array data types declaration with
the new keyword `var`, this change allows you to use Variable Type Inference.

    int[] myArray --> var myArray

Once you have replaced all array data types declaration, execute the commands for compile and run. 
