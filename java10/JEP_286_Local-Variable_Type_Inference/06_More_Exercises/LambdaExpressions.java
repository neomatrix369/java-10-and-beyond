// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class LambdaExpressions {
	public static void main(String args[]) {
		var compareString = String::compareTo;                       // is this allowed?

		// Is this possible, what does the compiler say?
		Consumer<String> printer = (var s) -> System.out.println(s); // statt s -> System.out.println(s);

		// Is a mixture of "var" and declarated types possible?
		BiConsumer<String, String> printer = (var s1, String s2) -> System.out.println(s1 + " " + s2);

		// Is this possible, what does the compiler say?
		BiConsumer<String, String> printer = (@Nonnull var s1, @Nullable var s2) -> System.out.println(s1 + (s2 == null ? "" : " " + s2));
	}
}
