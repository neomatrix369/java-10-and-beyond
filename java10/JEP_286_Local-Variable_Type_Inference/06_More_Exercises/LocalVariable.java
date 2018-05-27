// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class LocalVariable {
	public static void main(String args[]) {
		// Local variable
		String a = "some string";
		var aVarVariable = "String";
		System.out.println(aVarVariable);

		// Re-assigning local variable
		aVarVariable = "Changed value";   // <=== is this allowed, does it compile?
		System.out.println(aVarVariable);
	}
}
