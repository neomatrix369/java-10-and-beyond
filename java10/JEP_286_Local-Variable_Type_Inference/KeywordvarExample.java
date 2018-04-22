public class KeywordvarExample {
	public static void main(String args[]) {
		String a = "some string";
		var aVarVariable = "String";
		System.out.println(aVarVariable);
		          //
		aVarVariable = "Changed value";   // <=== is this allowed, does it compile?
		System.out.println(aVarVariable);

		aVarVariable = 10;   // <=== is this allowed, does it compile?
		System.out.println(aVarVariable);

		var aVarVariable = "Change value again";   // <=== is this allowed, does it compile?
		System.out.println(aVarVariable);

		var aVarVariable = 10;   // <=== is this allowed, does it compile?
		System.out.println(aVarVariable);
	}   	
}
