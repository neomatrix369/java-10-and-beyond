import java.util.HashMap;

// ****************************************************************************************************************
// Citation: the below examples are compilation of a number of links from the java10/Java-10-Resources.md document
// ****************************************************************************************************************
public class WithCollections {
	public static void main(String args[]) {
		var map = new HashMap<>();
		var varMap = new HashMap<>();    // infers as HashMap<???>, does it works, and compiles? what is ???? Object? String?

		var x = new HashMap<String, Integer>();  // infers as HashMap<AAA, BBB>, does it work or compile, what are AAA, BBB?
	}
}
