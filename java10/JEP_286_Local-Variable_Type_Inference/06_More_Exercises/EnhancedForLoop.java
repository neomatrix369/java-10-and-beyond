import java.util.ArrayList;

// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class Keywordvar {
	public static void main(String args[]) {
		// In combination with the <> Operator, infers to List<????> ??? = Object or String or Array?
		var arrayOfObjects = new ArrayList<>();
		arrayOfObjects.add("Hello World");
		for (var elementIsObject: arrayOfObjects) {
			System.out.println(elementIsObject.replace("World", "Java 10")); // cannot find symbol 'replace' as elementIsObject is of type object
		}

		// Infers to List<????> // Is this allowed, and will it compile? ??? = Object or String or Array
		var arrayOfStrings = new ArrayList<String>();
		arrayOfStrings.add("Hello World");
		for (var string: arrayOfStrings) {
			System.out.println(string.replace("World", "Java 10"));
		}
	}
}
