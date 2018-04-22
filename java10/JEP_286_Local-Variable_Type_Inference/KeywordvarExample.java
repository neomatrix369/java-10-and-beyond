public class KeywordvarExample {
	public static void main(String args[]) {
		String a = "some string";
		var aVarVariable = "String";
		System.out.println(aVarVariable);
		          //
		aVarVariable = "Changed value";   // <=== this allowed, it does compile
		System.out.println(aVarVariable);

		var aVarVariable;                // <=== this not allowed, it does not compile
		var aVarVariable = null;         // <=== this not allowed, it does not compile
	}
}
