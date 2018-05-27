**Local Variable Type Inference for Primitive Data Types example**

___

####   Please note you are in the `exercise-solutions` branch which contains solved exercises and is mainly for beginners or if you have hit a roadblock while solving the exercises in the `master` branch. 

####   Looking at the solutions can take away the fun and challenge behind solving the exercises. Switch to the `master` branch in case you would like to continue to have fun by solving the exercises and working through the challenges.

[Switch to master (exercises) branch](https://github.com/neomatrix369/java-10-and-beyond/blob/master/java10/README.md)
___

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
