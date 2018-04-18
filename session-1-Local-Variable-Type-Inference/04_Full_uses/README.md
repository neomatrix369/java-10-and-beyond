**Local Variable Type Inference for all Types example**

This example is a class named `FullUsesTypes` wichs its methods should use 
`Type Inference` to declare variables using them in Expressions, Statements, and Blocks as Loops.

Perform the below commands to see the contents of the respective Java classes contained in the src folder:

    $ cat src/com/typeinference/FullUsesTypes.java

**Note:** in case one of the below .sh script fails due to the tree command, please take a look at Download and install the tree and wget command section in the README.md file and apply the appropriate solution.

Compiled the example with the following command:

    $ ./compile.sh

And we run the example with the following command:

    $ ./run.sh
    
Now, open the file `com/typeinference/FullUsesTypes.java` and replace all e data types declaration with
the new keyword `var`, this change allow you to use Variable Type Inference.

    int id --> var id
    Integer myNumber --> var myNumber

Once you have replaces all primitive data types declaration, execute next command for compile the example:

    $ ./compile.sh

**Note:** The class `FullUsesTypes` has variable declarations wich Variable Type Inference can't be used. 
Open the file `com/typeinference/FullUsesTypes.java` and replace the uses of Type Inference wich it can't be used 
for the original type the declaration. 

Once you example compiles, execute it with the following command: 

    $ ./run.sh
