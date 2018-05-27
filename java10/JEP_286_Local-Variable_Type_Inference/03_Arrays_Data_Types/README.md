**Local Variable Type Inference for Arrays Data Types example**

___

####   Please note you are in the `exercise-solutions` branch which contains solved exercises and is mainly for beginners or if you have hit a roadblock while solving the exercises in the `master` branch. 

####   Looking at the solutions can take away the fun and challenge behind solving the exercises. Switch to the `master` branch in case you would like to continue to have fun by solving the exercises and working through the challenges.

[Switch to master (exercises) branch](https://github.com/neomatrix369/java-10-and-beyond/blob/master/java10/README.md)
___

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
