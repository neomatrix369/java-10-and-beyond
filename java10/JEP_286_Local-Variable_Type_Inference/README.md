### JEP 286: Local-Variable Type Inference

Run the below command on `KeywordvarExample.java` in the current directory: 

```bash
javac KeywordvarExample.java
```

Compiler should produce the below output:

```bash
KeywordvarExample.java:10: error: cannot infer type for local variable aVarVariable
		var aVarVariable;                // <=== this not allowed, it does not compile
		    ^
  (cannot use 'var' on variable without initializer)
KeywordvarExample.java:11: error: cannot infer type for local variable aVarVariable
		var aVarVariable = null;         // <=== this not allowed, it does not compile
		    ^
  (variable initializer is 'null')
2 errors
```

The above output and the source file has annotations as to why this is happening per line. The compiler returns error messages per line that won't compile.

