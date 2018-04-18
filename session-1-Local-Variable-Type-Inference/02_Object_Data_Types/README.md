**Local Variable Type Inference for Object Data Types example**

This example is a class named `ObjectTypes` wichs its methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/ObjectTypes.java

**Note:** in case one of the below .sh script fails due to the tree command, please take a look at Download and install the tree and wget command section in the README.md file and apply the appropriate solution.

Compiled the example with the following command:

    $ ./compile.sh

And we run the example with the following command:

    $ ./run.sh
    
Now, open the file `com/typeinference/ObjectTypes.java` and replace all object data types declaration with
the new keyword `var`, this change allow you to use Variable Type Inference.

    String id --> var id
    Book theLordOfTheRings --> var theLordOfTheRings

**Note:** The class `ObjectTypes.java` class uses objecs defined by the user `(Book, Store)` and by the JDK `(String, Integer, List )`  

Once you have replaces all object data types declaration, execute the commands for compile and run. 