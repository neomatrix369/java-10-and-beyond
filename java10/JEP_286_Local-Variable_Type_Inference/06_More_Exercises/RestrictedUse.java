// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class RestrictedUse {
	public static void main(String args[]) {
		// Just declaration of local variable
		var aVarVariable;                // <=== is this allowed, will it compile?

		// Declaration and assigning of local variable to null
		var aVarVariable = null;         // <=== is this allowed, will it compile?

		var varVariable = funcReturningNull(); // <=== is this allowed, will it compile?

		var first, second = 0;           // <=== is this allowed, will it compile?
		var first = 1, second = 2;       // <=== is this allowed, will it compile? What does the compiler say?
	}

	private static Object funcReturningNull() {
		return null;
	}
}
