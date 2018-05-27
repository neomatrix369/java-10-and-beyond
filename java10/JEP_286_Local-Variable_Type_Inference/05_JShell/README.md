**JShell: Local Variable Type Inference for all Types example**

___

####   Please note you are in the `exercise-solutions` branch which contains solved exercises and is mainly for beginners or if you have hit a roadblock while solving the exercises in the `master` branch. 

####   Looking at the solutions can take away the fun and challenge behind solving the exercises. Switch to the `master` branch in case you would like to continue to have fun by solving the exercises and working through the challenges.

[Switch to master (exercises) branch](https://github.com/neomatrix369/java-10-and-beyond/blob/master/java10/README.md)
___

This example covers the use of `Type Inference` in JShell to declare variables using them in Expressions, Statements, and Blocks as Loops.

You can run this example on your local JShell or online. For more information about JShell you can go to:  https://github.com/AdoptOpenJDK/jdk9-jigsaw/tree/master/session-3-jshell

To execute Local JShell run next command

     jshell
     
Verify you are using JShell for Java 10 version

    |  Welcome to JShell -- Version 10
    |  For an introduction type: /help intro


To execute JShell online go to next URL

    https://tryjshell.org
    
Verify you are using JShell for Java 10 version

    |  Welcome to JShell -- Version 10
    |  For an introduction type: /help intro
    
    
Once you are on JShell, try to do next exercises using Variable Type Inference

- Make a sum of two number of the type int, and print the result

		hacm$ jshell
		|  Welcome to JShell -- Version 10
		|  For an introduction type: /help intro
		
		jshell> int number1=2010;
		number1 ==> 2010
		
		jshell> int number2=30;
		number2 ==> 30
		
		jshell> System.out.println(number1+number2);
		2040
		
		jshell> 

- Declare text using String, StringBuilder, StringBuffer

		jshell> var myStringBuffer = new StringBuffer();
		myStringBuffer ==> 
		
		jshell> myStringBuffer.append("HI, everybody");
		$5 ==> HI, everybody
		
		jshell> myStringBuffer.append("I'm learning Java 10");
		$6 ==> HI, everybodyI'm learning Java 10
		
		jshell> System.out.println(myStringBuffer.reverse());
		01 avaJ gninrael m'Iydobyreve ,IH
		
		jshell> 

- Declare collections as List, ArrayList, Set, Map
	
		jshell> var myList = new ArrayList<Double>();
		myList ==> []
		
		jshell> myList.add(20D);
		$17 ==> true
		
		jshell> myList.add(30D);
		$18 ==> true
		
		jshell> myList.add(40D);
		$19 ==> true
		
		jshell> myList.add(50D);
		$20 ==> true
		
		jshell> myList.add(60D);
		$21 ==> true
		
		jshell> var max = myList.stream().mapToDouble( p -> p ).max();
		max ==> OptionalDouble[60.0]
		
		jshell> System.out.println(max);
		OptionalDouble[60.0]
		
		jshell> var maxAsDouble = myList.stream().mapToDouble( p -> p ).max().getAsDouble();
		maxAsDouble ==> 60.0
		
		jshell> System.out.println(maxAsDouble);
		60.0
		
		
		jshell> var mySubList = myList.stream().filter( p -> p>=50 ).collect( Collectors.toList() );
		mySubList ==> [50.0, 60.0]

For Object type you can use the method getClass() to check the type that the compiler used.
