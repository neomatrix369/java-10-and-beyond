// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class LambdaExpressions {
	public static void main(String args[]) {
		var compareString = String::compareTo;                      // this is not allowed yet

		// Inference of parameters in Lambda expressions
		Consumer<String> printer = (var s) -> System.out.println(s); // statt s -> System.out.println(s);

		// But no mixture of "var" and declarated types possible
		BiConsumer<String, String> printer = (var s1, String s2) -> System.out.println(s1 + " " + s2);

		// Useful for type annotations
		BiConsumer<String, String> printer = (@Nonnull var s1, @Nullable var s2) -> System.out.println(s1 + (s2 == null ? "" : " " + s2));
	}
}
