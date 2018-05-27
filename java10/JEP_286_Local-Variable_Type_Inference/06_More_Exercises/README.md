### JEP 286: Local-Variable Type Inference

Run the below command on any of the below `java` source files in the current directory: 

```bash
javac AnonymousInnerClass.java
javac EnhancedForLoop.java
javac LambdaExpressions.java
javac LocalVariable.java
javac PrimitivesAndBigDecimal.java
javac README.md
javac ReservedKeyword.java
javac RestrictedUse.java
javac WithCollections.java
javac WithInterface.java
javac WithStreams.java
```

Compiler should produce no output or a sample output like the below:

```bash
RestrictedUse.java:10: error: cannot infer type for local variable aVarVariable
		var aVarVariable;                // <=== this not allowed, it does not compile
		    ^
  (cannot use 'var' on variable without initializer)
RestrictedUse.java:11: error: cannot infer type for local variable aVarVariable
		var aVarVariable = null;         // <=== this not allowed, it does not compile
		    ^
  (variable initializer is 'null')
2 errors
```

The above output and the respective source files have annotations as to why this is happening per line. The compiler returns error messages per line that won't compile.

