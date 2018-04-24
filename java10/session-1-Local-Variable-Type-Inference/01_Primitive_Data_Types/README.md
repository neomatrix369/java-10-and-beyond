**Local Variable Type Inference for Primitive Data Types example**

This first example is a class named `PrimitiveTypes` whose methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/PrimitiveTypes.java

**Note:** in case one of the below `.sh` script fails due to the `tree` command, please take a look at Download and install the `tree` and `wget` command section in the `README.md` file and apply the appropriate solution.

Compiled the example with the following command:

    $ ./compile.sh

And we run the example with the following command:

    $ ./run.sh
    
Now, open the file `com/typeinference/PrimitiveTypes.java` and replace all primitive data types declaration with
the new keyword `var`, this change allows you to use Variable Type Inference.

    int id --> var id

Once you have replaced all primitive data types declaration, execute the commands for compile and run. Please compare the outputs, are they the same? 
