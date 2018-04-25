// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class RestrictedUse {
	public static void main(String args[]) {
		// Just declaration of local variable
		var aVarVariable;                // <=== this not allowed, it does not compile

		// Declaration and assigning of local variable to null
		var aVarVariable = null;         // <=== this not allowed, it does not compile

		var varVariable = funcReturningNull(); // <=== this not allowed, it does not compile

		var first, second = 0;           // <=== this not allowed, it does not compile
		var first = 1, second = 2;       // <=== this not allowed, it does not compile
	}

	private static Object funcReturningNull() {
		return null;
	}
}
